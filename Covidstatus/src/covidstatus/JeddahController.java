/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package covidstatus;
import Covid.*;
import static java.lang.System.in;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import jdk.jpackage.main.Main;

/**
 * FXML Controller class
 *
 * @author ahmed
 */
public class JeddahController implements Initializable {
    
    @FXML
    private ListView<String> List_Two;
    @FXML
    private ListView<String> List_One;
    @FXML
    private Button ICU;
    @FXML
    private Button GOV;
    @FXML
    private Button Programmer;
  ObservableList<String> Stu = FXCollections.observableArrayList();
        ArrayList <String> arr = new ArrayList <String>();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
               
      List_Two.setItems(MAIN_loop.RRRR); 
           
            
         
        
    }    

    @FXML
    private void ICU_Action(ActionEvent event) {
    }

    @FXML
    private void GOV_Action(ActionEvent event) {
  
          List_Two.setItems(MAIN_loop.RRRR);
       // List_One.getItems().addAll(MAIN_loop.RRRR);
    }

    @FXML
    private void Programmer_Action(ActionEvent event) {
        
        
    }
    
}
