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
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import Covid.MAIN_loop;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * FXML Controller class
 *
 * @author BFO6
 */
public class AlhfController implements Initializable {

    @FXML
    private Button icuHB;
    @FXML
    private Button govHB;
    @FXML
    private Button travelHB;
    @FXML
    private Button progHB;
    @FXML
    private Button deadHB;
    @FXML
    private Button aliveHB;
    @FXML
    private Button backHB;
    @FXML
    private ListView<String> List1;
    @FXML
    private ListView<String> List2;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
    ObservableList <String> Out1 = FXCollections.observableArrayList(MAIN_loop.R1_city1_pView);
    ObservableList <String> Out2 = FXCollections.observableArrayList(MAIN_loop.R1_city1_GovView);   
       
    List1.setItems(Out1);
    List2.setItems(Out2);
        
        
        
    }    

    @FXML
    private void icuHB_action(ActionEvent event) {
                               try{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Alhf_ICU.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));  
        stage.show();
        }catch(Exception e){
            System.out.println("error");
        }
        
    }

    @FXML
    private void govHB_action(ActionEvent event) {
    }

    @FXML
    private void travelHB_action(ActionEvent event) {
                                      try{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Alhf_travel.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));  
        stage.show();
        }catch(Exception e){
            System.out.println("error");
        }
    }

    @FXML
    private void progHB(ActionEvent event) {
    }

    @FXML
    private void deadHB_action(ActionEvent event) {
                             try{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Alhf_dead.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));  
        stage.show();
        }catch(Exception e){
            System.out.println("error");
        }  
        
    }

    @FXML
    private void alivrHB_action(ActionEvent event) {
                                  try{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Alhf_alive.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));  
        stage.show();
        }catch(Exception e){
            System.out.println("error");
        }
    }

    @FXML
    private void backHB_action(ActionEvent event) {
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
