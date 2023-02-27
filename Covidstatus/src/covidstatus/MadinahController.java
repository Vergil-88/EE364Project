/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
    @FXML
    private ListView<String> List1;
    @FXML
    private ListView<String> List2;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         ObservableList <String> Out1 = FXCollections.observableArrayList(MAIN_loop.R2_city3_pView);
         ObservableList <String> Out2 = FXCollections.observableArrayList(MAIN_loop.R2_city3_GovView);   
       
    List1.setItems(Out1);
    List2.setItems(Out2);
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
         try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("westCityWindow.fxml"));
            Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        
        } catch (IOException io) {
            System.out.println("FXML Loading Error");
        }
    }

    @FXML
    private void programmer_Maction(ActionEvent event) {
    }

    @FXML
    private void gov_Maction(ActionEvent event) {
    }



    
}
