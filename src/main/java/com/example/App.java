package com.example;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * JavaFX App
 */
public class App extends Application {

    private double x;
    private double y;
    
    @Override
    public void start(Stage palco) throws IOException {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("view/principal.fxml"));
        palco.initStyle(StageStyle.TRANSPARENT);
        Parent root = loader.load();


        root.setOnMousePressed((MouseEvent e)->{ 
            x = e.getSceneX();
            y = e.getSceneY();
            
        });
        
        root.setOnMouseDragged((MouseEvent e)->{
        
            palco.setX(e.getScreenX()-x);
            palco.setY(e.getScreenY()-y);
            palco.setOpacity(0.4);
        });
        
        root.setOnMouseReleased((MouseEvent e )->{
            palco.setOpacity(1);
        });


        palco.setScene(new Scene(root));
        palco.show();
    
    }

    public static void main(String[] args) {
        launch();
    }

}