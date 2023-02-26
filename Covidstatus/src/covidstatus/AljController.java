/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author BFO6
 */
public class AljController implements Initializable {

    @FXML
    private Button icuJB;
    @FXML
    private Button govJB;
    @FXML
    private Button travelJB;
    @FXML
    private Button progJB;
    @FXML
    private Button deadJB;
    @FXML
    private Button aliveJB;
    @FXML
    private Button backJB;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void icuJB_action(ActionEvent event) {
         try{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Alj_ICU.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));  
        stage.show();
        }catch(Exception e){
            System.out.println("error");
        }
    }

    @FXML
    private void govJB_action(ActionEvent event) {
    }

    @FXML
    private void travelJB_action(ActionEvent event) {
                 try{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Alj_travel.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));  
        stage.show();
        }catch(Exception e){
            System.out.println("error");
        }
        
    }

    @FXML
    private void progJB_action(ActionEvent event) {
    }

    @FXML
    private void deadJB_action(ActionEvent event) {
                                              try{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Alj_dead.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));  
        stage.show();
        }catch(Exception e){
            System.out.println("error");
        }
        
    }

    @FXML
    private void aliveJB_action(ActionEvent event) {
                                                      try{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Alj_alive.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));  
        stage.show();
        }catch(Exception e){
            System.out.println("error");
        }
        
    }

    @FXML
    private void backJB_action(ActionEvent event) {
                       try{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("eastCityWindow.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));  
        stage.show();
        }catch(Exception e){
            System.out.println("error");
        }
    }
    
}
