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
public class P2_HafController implements Initializable {

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
    @FXML
    private ListView<String> List1;
    @FXML
    private ListView<String> List2;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList <String> Out1 = FXCollections.observableArrayList(MAIN_loop.P2_R1_city4_pView);
        ObservableList <String> Out2 = FXCollections.observableArrayList(MAIN_loop.P2_R1_city4_GovView);   
       
    List1.setItems(Out1);
    List2.setItems(Out2);
        // TODO
    }    

    @FXML
    private void icuFB_action(ActionEvent event) {
                         try{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("P2_Haf_ICU.fxml"));
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
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("P2_Haf_travel.fxml"));
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
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("P2_Haf_dead.fxml"));
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
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("P2_Haf_alive.fxml"));
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
