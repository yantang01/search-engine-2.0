package model;

import java.io.IOException;
import java.util.*;

public class SearchEngine {
  private Query q;
  private boolean boost;
  private int X;

  // 0 param constructor
  public SearchEngine() {
    q = new Query("");
    boost = false;
    X = 10;
  }

  // 3 params constructor
  public SearchEngine(String initQ, boolean initBoost, int initX) {
    q = new Query(initQ);
    boost = initBoost;
    X = initX;
  }

  // getter/setter methods
  public boolean isBoost() {
    return boost;
  }

  public void setQuery(String query) {
    this.q.setBody(query);
  }

  public void setBoost(boolean boost) {
    this.boost = boost;
  }

  private List<Double> getPageVector(String link) throws IOException {
    String dirName = FileHandle.getDirName(link);
    HashMap<String, Double> tfidfs = FileHandle.readHashMap(dirName, "tfidfs.txt");
    HashMap<String, Double> vector = new HashMap<>();
    for (String word : q.getBody().split(" ")) {
      if (vector.containsKey(word)) {
        continue;
      }
      if (!tfidfs.containsKey(word)) {
        vector.put(word, (double) 0);
        continue;
      }
      vector.put(word, tfidfs.get(word));
    }
    List<Double> vectorList = new ArrayList<>();
    vectorList.addAll(vector.values());
    return vectorList;
  }

  private double similarity(List<Double> queryVector, List<Double> pageVector) {
    double numerator = 0.0;
    double leftDenom = 0.0;
    double rightDenom = 0.0;
    for (int i = 0; i < queryVector.size(); i++) {
      numerator += (queryVector.get(i) * pageVector.get(i));
      leftDenom += (queryVector.get(i) * queryVector.get(i));
      rightDenom += (pageVector.get(i) * pageVector.get(i));
    }
    if (numerator == 0.0) {
      return 0.0;
    }
    return numerator / (Math.sqrt(leftDenom) * Math.sqrt(rightDenom));
  }

  public List<SearchResult> search() throws IOException {
    List<SearchResult> topList = new ArrayList<>();
    if (q.getBody().equals("")) {
      return topList;
    }

    HashMap<String, Double> linksVisited = FileHandle.readHashMap("data", "linksVisited.txt");
    List<Double> queryVector = q.getQueryVector();
    List<Result> resultList = new ArrayList<>();

    for (String link : linksVisited.keySet()) {
      List<Double> pageVector = getPageVector(link);
      String dirName = FileHandle.getDirName(link);
      String title = FileHandle.readText(dirName, "title.txt");
      double s = similarity(queryVector, pageVector);
      if (boost) {
        s = s * Double.parseDouble(FileHandle.readText(dirName, "pageRank.txt"));
      }
      resultList.add(new Result(link, title, s));
    }
    Collections.sort(
        resultList,
        new Comparator<Result>() {
          @Override
          public int compare(Result o1, Result o2) {
            if ((Math.round(o1.getScore() * 1000.0) / 1000.0)
                == (Math.round(o2.getScore() * 1000.0) / 1000.0)) {
              return o1.compareTo(o2);
            }
            return o1.compareTo(o2.getScore());
          }
        });
    if (X < resultList.size()) {
      resultList = resultList.subList(0, X);
    }
    topList.addAll(resultList);
    return topList;
  }
}
