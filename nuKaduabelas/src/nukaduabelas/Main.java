/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nukaduabelas;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Acer
 */
public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        //Button btn = new Button();
        //btn.setText("Say 'Hello World'");
        //btn.setOnAction(new EventHandler<ActionEvent>() {
        /*CheckBox chk1 = new CheckBox("Pagi");
        //GridPane.setRowIndex(chk1,0);
        //GridPane.setColumnIndex(chk1,0);
        chk1.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                if(chk1.isSelected()){
                    System.out.println("Selamat Pagi");
                }
            }
        });
        
        CheckBox chk2 = new CheckBox("Siang");
        //GridPane.setRowIndex(chk2,2);
        //GridPane.setColumnIndex(chk2,0);
        chk2.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                if(chk2.isSelected()){
                    System.out.println("Selamat Siang");
                }
            }
        });*/
        
        RadioButton rad = new RadioButton("Pagi");
        //GridPane.setRowIndex(rad,0);
        //GridPane.setColumnIndex(rad,0);
        rad.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                if(rad.isSelected()){
                    System.out.println("Selamat Pagi");
                }
            }
        });
        
        StackPane root = new StackPane();
        //root.getChildren().add(btn);
        //root.getChildren().add(chk1);
        //root.getChildren().add(chk2);
        root.getChildren().add(rad);
        
        
        
        Scene scene = new Scene(root, 500, 500);
        
        primaryStage.setTitle("Hello World!");
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
