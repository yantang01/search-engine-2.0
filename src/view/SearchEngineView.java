package view;

import javafx.collections.FXCollections;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import model.SearchEngine;
import model.SearchResult;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SearchEngineView extends Pane {
  private TextField searchQuery;
  private Button searchButton;
  private CheckBox checkBoost;
  private ListView<String> titleList;
  private ListView<Double> scoreList;

  public Button getSearchButton() {
    return searchButton;
  }

  public CheckBox getCheckBoost() {
    return checkBoost;
  }

  public ListView<Double> getScoreList() {
    return scoreList;
  }

  public ListView<String> getTitleList() {
    return titleList;
  }

  public TextField getSearchQuery() {
    return searchQuery;
  }

  public SearchEngineView() {
    Label label1 = new Label("title");
    label1.relocate(245, 85);
    Label label2 = new Label("score");
    label2.relocate(400, 85);

    // Create and position the searchQuery TextField
    searchQuery = new TextField();
    searchQuery.relocate(245, 17.5);
    searchQuery.setPrefSize(200, 50);

    // Create and position the "Search" Button
    searchButton = new Button("Search!");
    searchButton.relocate(450, 17.5);
    searchButton.setPrefSize(100, 25);
    searchButton.setStyle("-fx-base: rgb(0,100,0); -fx-text-fill: rgb(255,255,255);");

    // Create and position the "checkBoost" CheckBox
    checkBoost = new CheckBox("Boost?");
    checkBoost.relocate(450, 42.5);
    checkBoost.setPrefSize(100, 25);

    // Create and position the ListView
    titleList = new ListView<String>();
    titleList.relocate(245, 102.5);
    titleList.setPrefSize(150, 350);

    scoreList = new ListView<Double>();
    scoreList.relocate(400, 102.5);
    scoreList.setPrefSize(150, 350);

    // Add all the components to the window
    getChildren()
        .addAll(searchQuery, searchButton, checkBoost, titleList, scoreList, label1, label2);
  }

  public void update(SearchEngine model) throws IOException {
    List<SearchResult> results = model.search();
    List<String> title = new ArrayList<>();
    List<Double> score = new ArrayList<>();

    for (SearchResult r : results) {
      title.add(r.getTitle());
      score.add(Math.round(r.getScore() * 100.0) / 100.0);
    }

    titleList.setItems(FXCollections.observableArrayList(title));
    scoreList.setItems(FXCollections.observableArrayList(score));
  }
}
