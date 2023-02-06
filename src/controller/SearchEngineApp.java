package controller;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import model.SearchEngine;
import view.SearchEngineView;

import java.io.IOException;

public class SearchEngineApp extends Application {
  SearchEngineView view;
  SearchEngine model;

  public SearchEngineApp() throws IOException {
    model = new SearchEngine();
  }

  @Override
  public void start(Stage stage) throws Exception {
    view = new SearchEngineView();

    // event handler - search
    view.getSearchButton()
        .setOnAction(
            new EventHandler<ActionEvent>() {
              @Override
              public void handle(ActionEvent actionEvent) {
                try {
                  handleSearch();
                } catch (IOException e) {
                  throw new RuntimeException(e);
                }
              }
            });

    // event handler - boost
    view.getCheckBoost()
        .setOnAction(
            new EventHandler<ActionEvent>() {
              @Override
              public void handle(ActionEvent actionEvent) {
                handleBoost();
              }
            });

    // event handler - enter key pressed
    view.setOnKeyPressed(
        new EventHandler<KeyEvent>() {
          @Override
          public void handle(KeyEvent keyEvent) {
            if (keyEvent.getCode().equals(KeyCode.ENTER)) {
              try {
                handleEnterKeyPressed();
              } catch (IOException e) {
                throw new RuntimeException(e);
              }
            }
          }
        });

    stage.setTitle("Happy Searching :). Try boosting page quality by one simple click.");
    stage.setResizable(false);
    stage.setScene(new Scene(view, 800, 485));
    stage.show();

    // update view
    view.update(model);
  }

  private void handleEnterKeyPressed() throws IOException {
    handleSearch();
  }

  private void handleBoost() {
    if (view.getCheckBoost().isSelected()) {
      model.setBoost(true);
    } else {
      model.setBoost(false);
    }
  }

  private void handleSearch() throws IOException {
    if (!view.getSearchQuery().getText().equals("")) {
      model.setQuery(view.getSearchQuery().getText());
    }
    view.update(model);
  }

  public static void main(String[] args) {
    launch(args);
  }
}
