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
    double magnification = 1.5;
    Scale scale = new Scale(magnification, magnification, 0, 0);
    root.getTransforms().add(scale);

    Scene scene = new Scene(root, 1000, 550); // Double the initial size

    // Adjust translation after the scene is laid out
    scene.widthProperty().addListener((obs, oldVal, newVal) -> {
      root.setTranslateX((newVal.doubleValue() - root.getWidth() * magnification) / magnification);
    });
    scene.heightProperty().addListener((obs, oldVal, newVal) -> {
      root.setTranslateY((newVal.doubleValue() - root.getHeight() * magnification) / magnification);
    });

    // Initial translation adjustment
    root.setTranslateX((scene.getWidth() - root.getWidth() * magnification) / magnification);
    root.setTranslateY((scene.getHeight() - root.getHeight() * magnification) / magnification);

    stage.setTitle("Hello!");
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args) {
    launch();
  }
}