package dev.lpa.udemy425controls;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
  @Override
  public void start(Stage stage) throws IOException {
    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

    Pane root = fxmlLoader.load();

    // Apply scale transformation
    double magnification = 1;

    Scene scene = new Scene(root, 1000 * magnification, 500 * magnification); // Double the initial size

    stage.setTitle("Hello!");
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args) {
    launch();
  }
}