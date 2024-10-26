package com.example.demo1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;

public class AppMain extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        String pathMain="C:\\Users\\Unifan\\Documents\\demo1\\src\\main\\java\\com\\example\\demo1\\View\\MainView.fxml";
        FXMLLoader fxmlLoader = new FXMLLoader();
        Parent  root = fxmlLoader.load(new FileInputStream(pathMain));
        Scene scene = new Scene(root, 800, 550);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}