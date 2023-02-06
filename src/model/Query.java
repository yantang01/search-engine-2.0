package model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Query {
  private String body;

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public Query(String query) {
    body = query;
  }

  public List<Double> getQueryVector() throws IOException {
    HashMap<String, Double> vector = new HashMap<>();
    for (String word : body.split(" ")) {
      if (vector.containsKey(word)) {
        continue;
      }
      vector.put(word, Math.log(1 + getTfQueryWord(word)) / Math.log(2) * getIdf(word));
    }
    List<Double> vectorList = new ArrayList<>();
    vectorList.addAll(vector.values());
    return vectorList;
  }

  private double getIdf(String word) throws IOException {
    HashMap<String, Double> idf = FileHandle.readHashMap("data", "idf.txt");

    if (!idf.containsKey(word)) {
      return 0;
    }
    return idf.get(word);
  }

  private double getTfQueryWord(String word) {
    String[] queryList = body.split(" ");
    HashMap<String, Integer> counter = new HashMap<>();
    for (String w : queryList) {
      if (counter.containsKey(w)) {
        counter.put(w, counter.get(w) + 1);
      } else {
        counter.put(w, 1);
      }
    }
    return (double) counter.get(word) / queryList.length;
  }
}
