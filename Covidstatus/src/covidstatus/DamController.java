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
public class DamController implements Initializable {

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
    }

    @FXML
    private void govDB_action(ActionEvent event) {
    }

    @FXML
    private void travelDB_action(ActionEvent event) {
    }

    @FXML
    private void progDB_action(ActionEvent event) {
    }

    @FXML
    private void deadDB_action(ActionEvent event) {
    }

    @FXML
    private void aliveDB_action(ActionEvent event) {
    }

    @FXML
    private void backDB(ActionEvent event) {
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
