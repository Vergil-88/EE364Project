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
public class P2_JeddahController implements Initializable {

    @FXML
    private ListView<String> List_Two;
    @FXML
    private ListView<String> List_One;
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
        ObservableList <String> Out1 = FXCollections.observableArrayList(MAIN_loop.P2_R2_city1_pView);
        ObservableList <String> Out2 = FXCollections.observableArrayList(MAIN_loop.P2_R2_city1_GovView);   
       
    List_One.setItems(Out1);
    List_Two.setItems(Out2);
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
                 try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("P2_WestCity.fxml"));
            Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        
        } catch (IOException io) {
            System.out.println("FXML Loading Error");
        }  
    }
    
}
