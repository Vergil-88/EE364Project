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
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author BFO6
 */

public class NorthStatsController implements Initializable {
    @FXML
    private Button Data;
    @FXML
    private Label LtypeA;
    @FXML
    private Label LtypeB;
    @FXML
    private Label LtypeC;
    @FXML
    private Label Lrecovered;
    @FXML
    private Label Ldead;
    @FXML
    private TextArea typeA;
    
    @FXML
    private TextArea typeB;
    @FXML
    private TextArea typeC;
    @FXML
    private TextArea Recovered;
    @FXML
    private TextArea Dead;
    
     String x = "yyy";
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        // TODO
    }    
    @FXML     public void StartAction(ActionEvent event)throws NullPointerException {          
        
            LtypeA.setText(x);
            typeA.appendText("xxxxxxxxxxxxxxxxxx");
    }
    
}
