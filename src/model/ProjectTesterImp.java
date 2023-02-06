package model;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class ProjectTesterImp implements ProjectTester {
  private Crawler crawler;

  @Override
  public void initialize() {
    crawler = new Crawler();
  }

  @Override
  public void crawl(String seedURL) throws IOException {
    crawler.crawl(seedURL);
  }

  @Override
  public List<String> getOutgoingLinks(String url) {
    for (Page p : crawler.getPages()) {
      if (p.getUrl().equals(url)) {
        return p.getOutgoingLinks();
      }
    }
    return null;
  }

  @Override
  public List<String> getIncomingLinks(String url) {
    for (Page p : crawler.getPages()) {
      if (p.getUrl().equals(url)) {
        return p.getIncomingLinks();
      }
    }
    return null;
  }

  @Override
  public double getPageRank(String url) {
    for (Page p : crawler.getPages()) {
      if (p.getUrl().equals(url)) {
        return p.getPageRank();
      }
    }
    return -1;
  }

  @Override
  public double getIDF(String word) {
    HashMap<String, Double> idf = crawler.getIdf();
    if (!idf.containsKey(word)) {
      return 0;
    }
    return idf.get(word);
  }

  @Override
  public double getTF(String url, String word) {
    for (Page p : crawler.getPages()) {
      if (p.getUrl().equals(url)) {
        HashMap<String, Double> tf = p.getTf();
        if (!tf.containsKey(word)) {
          return 0;
        }
        return tf.get(word);
      }
    }
    return 0;
  }

  @Override
  public double getTFIDF(String url, String word) throws IOException {
    for (Page p : crawler.getPages()) {
      if (p.getUrl().equals(url)) {
        HashMap<String, Double> tfidf = p.getTfidfs();
        if (!tfidf.containsKey(word)) {
          return 0;
        }
        return tfidf.get(word);
      }
    }
    return 0;
  }

  @Override
  public List<SearchResult> search(String query, boolean boost, int X) throws IOException {
    SearchEngine s = new SearchEngine(query, boost, X);
    return s.search();
  }
}
