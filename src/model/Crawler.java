package model;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Crawler {

  private List<Page> pages;
  private HashMap<String, Double> idf;

  public Crawler() {
    initialize();
  }

  public List<Page> getPages() {
    return pages;
  }

  public HashMap<String, Double> getIdf() {
    return idf;
  }

  public void setIdf(HashMap<String, Double> idf) {
    this.idf = idf;
  }

  // initialize crawler
  // clear data dir
  // create new data structures
  private void initialize() {
    File dir = new File("data");
    deleteDir(dir);

    pages = new ArrayList<>();
    idf = new HashMap<>();
  }

  // this method crawls the website
  public void crawl(String seed) throws IOException {

    List<String> queue = new LinkedList<>();
    HashMap<String, List<String>> incomingLinks = new HashMap<>();
    HashMap<String, List<String>> wordAppears = new HashMap<>();
    HashMap<String, List<String>> outgoingHelper = new HashMap<>();
    HashMap<String, Integer> linksVisited = new HashMap<>();
    HashMap<Integer, String> mapIdToUrl = new HashMap<>();
    int id = 0;

    queue.add(seed);
    linksVisited.put(seed, id);
    mapIdToUrl.put(id, seed);

    while (!queue.isEmpty()) {
      // read the top url
      String contents = readUrl(queue.get(0));
      Page p = new Page(queue.get(0));

      // get each page's dir name
      String dirName = FileHandle.getDirName(queue.get(0));

      // write title to the folder
      String title = getTitle(contents);
      FileHandle.writeText(dirName, "title.txt", getTitle(contents));
      p.setTitle(title);

      List<String> words = parseWords(contents);
      HashMap<String, Double> tf = new HashMap<>();
      for (String w : words) {
        double f = (double) 1 / words.size();
        if (!tf.containsKey(w)) {
          tf.put(w, f);
        } else {
          tf.put(w, tf.get(w) + f);
        }

        if (!wordAppears.containsKey(w)) {
          wordAppears.put(w, new ArrayList<>());
          wordAppears.get(w).add(queue.get(0));
        } else {
          if (!wordAppears.get(w).contains(queue.get(0))) {
            wordAppears.get(w).add(queue.get(0));
          }
        }
      }

      List<String> links = parseLinks(contents);
      List<String> outgoingLinks = new ArrayList<>();

      for (String l : links) {
        String fullLink = getFullUrl(l, seed);
        outgoingLinks.add(fullLink);
        if (incomingLinks.containsKey(fullLink)) {
          incomingLinks.get(fullLink).add(queue.get(0));
        } else {
          incomingLinks.put(fullLink, new ArrayList<>());
          incomingLinks.get(fullLink).add(queue.get(0));
        }

        if (!linksVisited.containsKey(fullLink)) {
          id++;
          linksVisited.put(fullLink, id);
          mapIdToUrl.put(id, fullLink);
          queue.add(fullLink);
        }
      }

      p.setOutgoingLinks(outgoingLinks);
      p.setTf(tf);

      FileHandle.writeList(dirName, "outgoingLinks.txt", outgoingLinks);
      FileHandle.writeHashMapDouble(dirName, "tf.txt", tf);

      outgoingHelper.put(queue.get(0), outgoingLinks);

      queue.remove(0);
      pages.add(p);
    }

    FileHandle.writeHashMapInteger("data", "linksVisited.txt", linksVisited);
    writeIncomingLinks(incomingLinks);
    writeIdf(linksVisited, wordAppears);
    writeTfidf(linksVisited);
    writePageRank(seed, linksVisited, mapIdToUrl, outgoingHelper);
  }

  private void writePageRank(
      String url,
      HashMap<String, Integer> linksVisited,
      HashMap<Integer, String> mapIdToUrl,
      HashMap<String, List<String>> outgoingHelper)
      throws IOException {

    if (!linksVisited.containsKey(url)) {
      return;
    }

    // 1. Generate Matrix
    int ROWS = linksVisited.size();
    int COLS = linksVisited.size();
    double[][] matrix = new double[ROWS][COLS];
    for (double[] row : matrix) {
      Arrays.fill(row, 0);
    }
    // count 1s
    List<Integer> counter = new ArrayList<>();

    // 2. Adjacency Matrix
    for (int r = 0; r < ROWS; r++) {
      int count = 0;
      for (int c = 0; c < COLS; c++) {
        boolean b = getMatrixValue(r, c, mapIdToUrl, outgoingHelper);
        if (!b) {
          continue;
        }
        matrix[r][c] = 1;
        count++;
      }
      counter.add(count);
    }

    // 3. Initial transition
    // 4. Scaled Adjacency Matrix; alpha value of 0.1
    // 5. Adjacency Matrix after adding alpha/N to each entry
    for (int r = 0; r < ROWS; r++) {
      for (int c = 0; c < COLS; c++) {
        matrix[r][c] = matrix[r][c] / counter.get(r) * 0.9 + (0.1 / ROWS);
      }
    }

    // 6. Multiply the matrix by a vector
    double distance = 99;
    double[][] vector = new double[1][ROWS];
    for (double[] row : vector) {
      Arrays.fill(row, (double) 1 / ROWS);
    }
    while (distance > 0.0001) {
      double[][] newVector = multMatrix(vector, matrix);
      distance = euclideanDist(vector, newVector);
      vector = newVector;
    }

    for (String link : linksVisited.keySet()) {
      String dirName = FileHandle.getDirName(link);
      int id = urlToId(link, linksVisited);
      for (Page p : pages) {
        if (p.getUrl().equals(link)) {
          assert vector != null;
          p.setPageRank(vector[0][id]);
        }
      }
      FileHandle.writeText(dirName, "pageRank.txt", String.valueOf(vector[0][id]));
    }
  }

  private int urlToId(String link, HashMap<String, Integer> linksVisited) {
    return linksVisited.get(link);
  }

  private String idToUrl(int id, HashMap<Integer, String> mapIdToUrl) {
    return mapIdToUrl.get(id);
  }

  private double euclideanDist(double[][] vector, double[][] newVector) {
    double total = 0;
    for (int n = 0; n < vector[0].length; n++) {
      total += Math.pow((vector[0][n] - newVector[0][n]), 2);
    }
    return Math.pow(total, 0.5);
  }

  private double[][] multMatrix(double[][] vector, double[][] matrix) {
    if (vector[0].length != matrix.length) {
      return null;
    }

    double[][] newM = new double[vector.length][matrix[0].length];

    for (int i = 0; i < vector.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        for (int k = 0; k < matrix.length; k++) {
          newM[i][j] += vector[i][k] * matrix[k][j];
        }
      }
    }
    return newM;
  }

  private boolean getMatrixValue(
      int id,
      int outgoingId,
      HashMap<Integer, String> mapIdToUrl,
      HashMap<String, List<String>> outgoingHelper) {

    String url = idToUrl(id, mapIdToUrl);
    String outgoingUrl = idToUrl(outgoingId, mapIdToUrl);

    if (outgoingHelper.get(url).contains(outgoingUrl)) {
      return true;
    } else {
      return false;
    }
  }

  private void writeTfidf(HashMap<String, Integer> linksVisited) throws IOException {
    HashMap<String, Double> idf = FileHandle.readHashMap("data", "idf.txt");
    for (String link : linksVisited.keySet()) {
      HashMap<String, Double> tfidf = new HashMap<>();
      String dirName = FileHandle.getDirName(link);
      HashMap<String, Double> tf = FileHandle.readHashMap(dirName, "tf.txt");
      for (String w : tf.keySet()) {
        tfidf.put(w, (Math.log(1 + tf.get(w)) / Math.log(2)) * idf.get(w));
      }
      for (Page p : pages) {
        if (p.getUrl().equals(link)) {
          p.setTfidfs(tfidf);
        }
      }
      FileHandle.writeHashMapDouble(dirName, "tfidfs.txt", tfidf);
    }
  }

  private void writeIdf(
      HashMap<String, Integer> linksVisited, HashMap<String, List<String>> wordAppears)
      throws IOException {
    HashMap<String, Double> idf = new HashMap<>();
    int numOfDocs = linksVisited.size();
    for (String w : wordAppears.keySet()) {
      idf.put(w, Math.log((double) numOfDocs / (1 + wordAppears.get(w).size())) / Math.log(2));
    }

    this.setIdf(idf);
    FileHandle.writeHashMapDouble("data", "idf.txt", idf);
  }

  private void writeIncomingLinks(HashMap<String, List<String>> incomingLinks) throws IOException {
    for (String key : incomingLinks.keySet()) {
      for (Page p : pages) {
        if (p.getUrl().equals(key)) {
          p.setIncomingLinks(incomingLinks.get(key));
        }
      }
      FileHandle.writeList(FileHandle.getDirName(key), "incomingLinks.txt", incomingLinks.get(key));
    }
  }

  // use WebRequester provided to read url
  private String readUrl(String url) {
    String contents = "";
    try {
      contents = WebRequester.readURL(url);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return contents;
  }

  // this will return a list of links
  private List<String> parseLinks(String contents) {
    int startIndex = 0;
    int endIndex = 0;
    String startTag = "a href=\"";
    String endTag = "\">";
    List<String> links = new ArrayList<>();
    while (true) {
      startIndex = contents.indexOf(startTag, endIndex);
      if (startIndex == -1) {
        break;
      }
      endIndex = contents.indexOf(endTag, startIndex);
      links.add(contents.substring(startTag.length() + startIndex, endIndex));
    }
    return links;
  }

  // this will return a list of words
  private List<String> parseWords(String contents) {
    int startIndex = 0;
    int endIndex = 0;
    String startTag = "<p>";
    String endTag = "</p>";
    List<String> words = new ArrayList<>();
    while (true) {
      startIndex = contents.indexOf(startTag, endIndex);
      if (startIndex == -1) {
        break;
      }
      endIndex = contents.indexOf(endTag, startIndex);
      String[] strs =
          contents.substring(startTag.length() + startIndex, endIndex).trim().split("\\s+");
      for (String w : strs) {
        words.add(w);
      }
    }
    return words;
  }

  private String getTitle(String contents) {
    String startTag = "<title>";
    String endTag = "</title>";
    int startIndex = contents.indexOf(startTag);
    int endIndex = contents.indexOf(endTag);
    return contents.substring(startTag.length() + startIndex, endIndex);
  }

  private String getFullUrl(String url, String base) {
    if (url.startsWith("./")) {
      int start = url.indexOf("./");
      int end = base.lastIndexOf("/");
      String full = base.substring(0, end) + url.substring(start + 1);
      return full;
    }
    return url;
  }

  private static void deleteDir(File dir) {
    File[] files = dir.listFiles();
    if (files != null) {
      for (final File file : files) {
        deleteDir(file);
      }
    }
    dir.delete();
  }
}
