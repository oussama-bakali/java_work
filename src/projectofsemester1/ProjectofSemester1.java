/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package projectofsemester1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import FightScene.*;
/**
 *
 * @author pc
 */
public class ProjectofSemester1 extends Application {
    Stage s1;
    public Stage getStage(){
        return this.s1;
    }
    @Override
    public void start(Stage s1) {
    try{
       
            Parent root=FXMLLoader.load(getClass().getResource("StartWindow.fxml"));
            
            String css = this.getClass().getResource("startwindow.css").toExternalForm();
 
            
            Scene scene =new Scene(root);
              scene.getStylesheets().add(css);
            s1.setScene(scene);
            s1.show();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
 public void GameStart() {
    try{
       
            Parent root=FXMLLoader.load(getClass().getResource("StartWindow.fxml"));
            
            String css = this.getClass().getResource("startwindow.css").toExternalForm();
 
            
            Scene scene =new Scene(root);
              scene.getStylesheets().add(css);
            s1.setScene(scene);
            s1.show();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
