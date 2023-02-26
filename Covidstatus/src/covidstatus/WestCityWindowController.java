/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author BFO6
 */
public class WestCityWindowController implements Initializable {

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
    private ImageView onionHead;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void makkahAction(ActionEvent event) {
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
        //onionHead.setOpacity(100);
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Makkah.fxml"));
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
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Jeddah.fxml"));
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
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Madinah.fxml"));
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
    

}
