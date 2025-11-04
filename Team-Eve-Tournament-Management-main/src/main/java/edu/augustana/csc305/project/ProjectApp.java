package edu.augustana.csc305.project;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;

public class ProjectApp extends Application {

    @Override public void start(Stage stage) throws IOException {
        Scene scene = new Scene(new HelloView(), Screen.getPrimary().getVisualBounds().getWidth(), Screen.getPrimary().getVisualBounds().getHeight());
        stage.setScene(scene);
        stage.setMaximized(true);
        stage.setTitle("Tournament Manager");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
