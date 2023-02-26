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
public class P2_MakkahController implements Initializable {

    @FXML
    private Button icuK;
    @FXML
    private Button travelK;
    @FXML
    private Button deadK;
    @FXML
    private Button aliveK;
    @FXML
    private Button ProgrammerK;
    @FXML
    private Button govK;
    @FXML
    private Button backBK;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void icu_Kaction(ActionEvent event) {
                       try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("P2_Makkah_ICU.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        }catch(Exception e){
            System.out.println("error");
        } 
    }

    @FXML
    private void travel_Kaction(ActionEvent event) {
                             try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("P2_Makkah_travel.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        }catch(Exception e){
            System.out.println("error");
        }
    }

    @FXML
    private void dead_Kaction(ActionEvent event) {
                             try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("P2_Makkah_dead.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        }catch(Exception e){
            System.out.println("error");
        }
    }

    @FXML
    private void alive_Kaction(ActionEvent event) {
                             try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("P2_Makkah_alive.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        }catch(Exception e){
            System.out.println("error");
        }
    }

    @FXML
    private void programmer_Kaction(ActionEvent event) {
    }

    @FXML
    private void gov_Kaction(ActionEvent event) {
    }

    @FXML
    private void backBK_action(ActionEvent event) {
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
