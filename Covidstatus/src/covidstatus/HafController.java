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
public class HafController implements Initializable {

    @FXML
    private Button icuFB;
    @FXML
    private Button govFB;
    @FXML
    private Button travelFB;
    @FXML
    private Button progFB;
    @FXML
    private Button deadFB;
    @FXML
    private Button aliveFB;
    @FXML
    private Button backFB;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void icuFB_action(ActionEvent event) {
                  try{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Haf_ICU.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));  
        stage.show();
        }catch(Exception e){
            System.out.println("error");
        }
    }

    @FXML
    private void govFB_action(ActionEvent event) {
    }

    @FXML
    private void travelFB_action(ActionEvent event) {
                         try{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Haf_travel.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));  
        stage.show();
        }catch(Exception e){
            System.out.println("error");
        }
    }

    @FXML
    private void progFB_action(ActionEvent event) {
    }

    @FXML
    private void deadFB_action(ActionEvent event) {
                                 try{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Haf_dead.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));  
        stage.show();
        }catch(Exception e){
            System.out.println("error");
        }
    }

    @FXML
    private void aliveFB_action(ActionEvent event) {
         try{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Haf_alive.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));  
        stage.show();
        }catch(Exception e){
            System.out.println("error");
        }
        
    }

    @FXML
    private void backFB_action(ActionEvent event) {
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
