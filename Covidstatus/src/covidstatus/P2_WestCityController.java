/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package covidstatus;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ahmed
 */
public class P2_WestCityController implements Initializable {

    @FXML
    private Button makkahButton;
    @FXML
    private Button madinahButton;
    @FXML
    private Button jeddahButton;
    @FXML
    private Button taifButton;
    @FXML
    private Button Makkahb;
    @FXML
    private Button jeddahB;
    @FXML
    private Button MadinahB;
    @FXML
    private Button taifB;
    @FXML
    private Button BACK;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void makkahAction(ActionEvent event) {
                //onionHead.setOpacity(100);

    }

    @FXML
    private void madinahAction(ActionEvent event) {
        
        
    }

    @FXML
    private void jeddahAction(ActionEvent event) {
 
    }

    @FXML
    private void taifAction(ActionEvent event) {
        
        
    }

    @FXML
    private void openMakkah(ActionEvent event) {
                try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("P2_Makkah.fxml"));
            Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        
        } catch (IOException io) {
            System.out.println("FXML Loading Error");
    }
    }

    @FXML
    private void openJeddah(ActionEvent event) {
               try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("P2_Jeddah.fxml"));
            Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        
        } catch (IOException io) {
            System.out.println("FXML Loading Error");
    }
    }

    @FXML
    private void openMadinah(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("P2_Madinah.fxml"));
            Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        
        } catch (IOException io) {
            System.out.println("FXML Loading Error");
    }
    }

    @FXML
    private void openTaif(ActionEvent event) {
         try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Taif.fxml"));
            Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        
        } catch (IOException io) {
            System.out.println("FXML Loading Error");
    }
    }

    @FXML
    private void backk(ActionEvent event) {
                        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("P2_2ndwin.fxml"));
            Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        
        } catch (IOException io) {
            System.out.println("FXML Loading Error");
        }
    }
    
}
