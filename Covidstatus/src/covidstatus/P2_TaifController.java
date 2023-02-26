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
public class P2_TaifController implements Initializable {

    @FXML
    private Button icuT;
    @FXML
    private Button travelT;
    @FXML
    private Button deadT;
    @FXML
    private Button aliveT;
    @FXML
    private Button ProgrammerT;
    @FXML
    private Button govT;
    @FXML
    private Button backBT;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void icu_Taction(ActionEvent event) {
                                  try{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("P2_Taif_ICU.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));  
        stage.show();
        }catch(Exception e){
            System.out.println("error");
        }  
    }

    @FXML
    private void travel_Taction(ActionEvent event) {
                                  try{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("P2_Taif_travel.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));  
        stage.show();
        }catch(Exception e){
            System.out.println("error");
        }  
    }

    @FXML
    private void dead_Taction(ActionEvent event) {
                                  try{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("P2_Taif_dead.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));  
        stage.show();
        }catch(Exception e){
            System.out.println("error");
        }  
    }

    @FXML
    private void alive_Taction(ActionEvent event) {
                                  try{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("P2_Taif_alive.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));  
        stage.show();
        }catch(Exception e){
            System.out.println("error");
        }  
    }

    @FXML
    private void programmer_Taction(ActionEvent event) {
    }

    @FXML
    private void gov_Taction(ActionEvent event) {
    }

    @FXML
    private void backBT_action(ActionEvent event) {
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
