/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package covidstatus;
import Covid.MAIN_loop;
import java.io.IOException;
import static java.lang.System.in;
import java.net.URL;
import java.util.ArrayList;
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
import javafx.scene.input.MouseEvent;
//import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
//import jdk.jpackage.main.Main;

/**
 * FXML Controller class
 *
 * @author ahmed
 */
public class JeddahController implements Initializable {
    
    @FXML
    private ListView<String> List_Two;
    @FXML
    private ListView<String> List_One;
    @FXML
    private Button GOV;
    @FXML
    private Button Programmer;
  ObservableList<String> Stu = FXCollections.observableArrayList();
        ArrayList <String> arr = new ArrayList <String>();
    @FXML
    private Button icuB;
    @FXML
    private Button travelB;
    @FXML
    private Button deadB;
    @FXML
    private Button aliveB;
    @FXML
    private Button backBJ;
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         
   
            
       
    
        
    }    
   
    
    @FXML
    private void ICU_Action(ActionEvent event) {
        try{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Jeddah_ICU.fxml"));
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
    private void travel_action(ActionEvent event) {
                try{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Jeddah_travel.fxml"));
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
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Jeddah_dead.fxml"));
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
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Jeddah_alive.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));  
        stage.show();
        }catch(Exception e){
            System.out.println("error");
        }
    }

    @FXML
    private void backBJ_action(ActionEvent event) {
        try{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("westCityWindow.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));  
        stage.show();
        }catch(Exception e){
            System.out.println("error");
        }
    }

    }

