/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package covidstatus;

import Covid.MAIN_loop;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
public class P2_AljController implements Initializable {

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
    @FXML
    private ListView<String> List1;
    @FXML
    private ListView<String> List2;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         ObservableList <String> Out1 = FXCollections.observableArrayList(MAIN_loop.P2_R1_city2_pView);
         ObservableList <String> Out2 = FXCollections.observableArrayList(MAIN_loop.P2_R1_city2_GovView);   
       
    List1.setItems(Out1);
    List2.setItems(Out2);
        // TODO
    }    

    @FXML
    private void icuJB_action(ActionEvent event) {
                 try{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("P2_Alj_ICU.fxml"));
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
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("P2_Alj_travel.fxml"));
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
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("P2_Alj_dead.fxml"));
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
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("P2_Alj_alive.fxml"));
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
