package com.example;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage palco) throws IOException {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("view/principal.fxml"));
        Parent root = loader.load();
        palco.setScene(new Scene(root));
        palco.show();
    }

    public static void main(String[] args) {
        launch();
    }

}