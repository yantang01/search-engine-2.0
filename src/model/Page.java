package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Page {
  private String url;
  private List<String> outgoingLinks;
  private List<String> incomingLinks;
  private Double pageRank;
  private HashMap<String, Double> tfidfs;
  private HashMap<String, Double> tf;
  private String title;

  public Page(String url) {
    this.url = url;
    outgoingLinks = new ArrayList<>();
    incomingLinks = new ArrayList<>();
    pageRank = 0.0;
    tfidfs = new HashMap<>();
    tf = new HashMap<>();
    title = "";
  }

  public void setIncomingLinks(List<String> incomingLinks) {
    this.incomingLinks = incomingLinks;
  }

  public void setOutgoingLinks(List<String> outgoingLinks) {
    this.outgoingLinks = outgoingLinks;
  }

  public void setPageRank(Double pageRank) {
    this.pageRank = pageRank;
  }

  public void setTf(HashMap<String, Double> tf) {
    this.tf = tf;
  }

  public void setTfidfs(HashMap<String, Double> tfidfs) {
    this.tfidfs = tfidfs;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getTitle() {
    return title;
  }

  public Double getPageRank() {
    return pageRank;
  }

  public HashMap<String, Double> getTf() {
    return tf;
  }

  public HashMap<String, Double> getTfidfs() {
    return tfidfs;
  }

  public List<String> getIncomingLinks() {
    return incomingLinks;
  }

  public List<String> getOutgoingLinks() {
    return outgoingLinks;
  }

  public String getUrl() {
    return url;
  }
}
