/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package projectofsemester1;
import FightScene.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author pc
 */


public class StartWindowController implements Initializable {
@FXML
Button startgame;
Button exit;
public void startgame(ActionEvent e){
    ProjectofSemester1 openinginterface=new ProjectofSemester1();
    
    FightScene sc=new FightScene();
   sc.start(new Stage());
}
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
