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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ahmed
 */
public class P2_DamController implements Initializable {

    @FXML
    private Button icuDB;
    @FXML
    private Button govDB;
    @FXML
    private Button travelDB;
    @FXML
    private Button progDB;
    @FXML
    private Button deadDB;
    @FXML
    private Button aliveDB;
    @FXML
    private Button backDB;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void icuDB_action(ActionEvent event) {
                                                     try{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("P2_Dam_ICU.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));  
        stage.show();
        }catch(Exception e){
            System.out.println("error");
        }
    }

    @FXML
    private void govDB_action(ActionEvent event) {
    }

    @FXML
    private void travelDB_action(ActionEvent event) {
                                                     try{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("P2_Dam_travel.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));  
        stage.show();
        }catch(Exception e){
            System.out.println("error");
        }
    }

    @FXML
    private void progDB_action(ActionEvent event) {
    }

    @FXML
    private void deadDB_action(ActionEvent event) {
                                                     try{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("P2_Dam_dead.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));  
        stage.show();
        }catch(Exception e){
            System.out.println("error");
        }
    }

    @FXML
    private void aliveDB_action(ActionEvent event) {
                                                     try{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("P2_Dam_alive.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));  
        stage.show();
        }catch(Exception e){
            System.out.println("error");
        }
    }

    @FXML
    private void backDB(ActionEvent event) {
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
