/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package covidstatus;

import Covid.MAIN_loop;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
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
    @FXML
    private ListView<String> List1;
    @FXML
    private ListView<String> List2;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         ObservableList <String> Out1 = FXCollections.observableArrayList(MAIN_loop.P2_R1_city1_pView);
         ObservableList <String> Out2 = FXCollections.observableArrayList(MAIN_loop.P2_R1_city1_GovView);   
       
    List1.setItems(Out1);
    List2.setItems(Out2);
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
         try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("P2_EastCity.fxml"));
            Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        
        } catch (IOException io) {
            System.out.println("FXML Loading Error");
        } 
    }
    
}
