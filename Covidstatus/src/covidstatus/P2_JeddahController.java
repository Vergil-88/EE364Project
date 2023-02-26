/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package covidstatus;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ahmed
 */
public class P2_JeddahController implements Initializable {

    @FXML
    private ListView<?> List_Two;
    @FXML
    private ListView<?> List_One;
    @FXML
    private Button icuB;
    @FXML
    private Button travelB;
    @FXML
    private Button deadB;
    @FXML
    private Button aliveB;
    @FXML
    private Button GOV;
    @FXML
    private Button Programmer;
    @FXML
    private Button backBJ;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ICU_Action(ActionEvent event) {
                try{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("P2_Jeddah_ICU.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));  
        stage.show();
        }catch(Exception e){
            System.out.println("error");
        }
    }

    @FXML
    private void travel_action(ActionEvent event) {
                    try{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("P2_Jeddah_travel.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));  
        stage.show();
        }catch(Exception e){
            System.out.println("error");
        }
    }

    @FXML
    private void dead_action(ActionEvent event) {
                    try{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("P2_Jeddah_dead.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));  
        stage.show();
        }catch(Exception e){
            System.out.println("error");
        }
    }

    @FXML
    private void alive_action(ActionEvent event) {
                    try{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("P2_Jeddah_alive.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));  
        stage.show();
        }catch(Exception e){
            System.out.println("error");
        }
    }

    @FXML
    private void GOV_Action(ActionEvent event) {
    }

    @FXML
    private void Programmer_Action(ActionEvent event) {
    }

    @FXML
    private void backBJ_action(ActionEvent event) { //P2_WestCity
          try{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("P2_WestCity.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));  
        stage.show();
        }catch(Exception e){
            System.out.println("error");
        }    
    }
    
}
