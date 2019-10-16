/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applambdamouseevent;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author rafae
 */
public class AppLambdaMouseEvent extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Text txt = new Text();
        txt.setText("Programing is fun");
        
        Pane root = new Pane();
        root.getChildren().add(txt);
        
        Scene scene = new Scene(root, 300, 250);
        txt.setX((scene.getWidth()/2));
        txt.setY((scene.getHeight()/2));
        txt.setOnMouseDragged(ev ->
        {
            txt.setX(ev.getSceneX());
            txt.setY(ev.getSceneY());
            
            ev.consume();
        }
        );
        
        primaryStage.setTitle("MouseEvent");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
