package model;

public class Result implements SearchResult, Comparable<Result> {
  private String title;
  private String url;
  private double score;

  public Result(String initUrl, String initTitle, Double initScore) {
    url = initUrl;
    title = initTitle;
    score = initScore;
  }

  @Override
  public String getTitle() {
    return title;
  }

  @Override
  public double getScore() {
    return score;
  }

  @Override
  public int compareTo(double score) {
    if (this.score > score) {
      return -1;
    }
    return 1;
  }

  // lexicographical ordering when same score
  @Override
  public int compareTo(Result o) {
    return this.title.compareTo(o.title);
  }
}
