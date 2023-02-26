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
public class MadinahController implements Initializable {

    @FXML
    private Button icuM;
    @FXML
    private Button travelM;
    @FXML
    private Button deadM;
    @FXML
    private Button aliveM;
    @FXML
    private Button ProgrammerM;
    @FXML
    private Button govM;
    @FXML
    private Button backBM;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backBM_action(ActionEvent event) {
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

    @FXML
    private void icu_Maction(ActionEvent event) {
                try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Madinah_ICU.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        }catch(Exception e){
            System.out.println("error");
        }
        
    }

    @FXML
    private void travel_Maction(ActionEvent event) {
                           try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Madinah_travel.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        }catch(Exception e){
            System.out.println("error");
        }
    }

    @FXML
    private void dead_Maction(ActionEvent event) {
                   try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Madinah_dead.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        }catch(Exception e){
            System.out.println("error");
        }     
        
        
        
    }

    @FXML
    private void alive_Maction(ActionEvent event) {
                           try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Madinah_alive.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        }catch(Exception e){
            System.out.println("error");
        }
    }

    @FXML
    private void programmer_Maction(ActionEvent event) {
    }

    @FXML
    private void gov_Maction(ActionEvent event) {
    }



    
}
