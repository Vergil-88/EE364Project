/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidstatus;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;

/**
 * FXML Controller class
 *
 * @author BFO6
 */
public class AliveController implements Initializable {

    Circle circle;
    Label lb = new Label();
    
    @FXML
    private AnchorPane anchorpan;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        int count = 0;
        int i=23;
            int j=23;
        ArrayList <Circle> c = new ArrayList<>();
        while(count<23000){
            
            if(i >= 5000){
                i = 23;
                j+=30;
           
            }
            
        circle = new Circle(i,j,15);
        circle.setStroke(javafx.scene.paint.Color.BLACK);
        circle.setFill(javafx.scene.paint.Color.GREEN);
        
        
        anchorpan.getChildren().add(circle);
        c.add(circle);
        
        
        
        count++;
            i+=30;
           
                 
             
            
     
    }
        for(Circle s:c){
        s.addEventHandler(MouseEvent.MOUSE_MOVED,new EventHandler<MouseEvent>(){
            
                
         
             
             public void handle(MouseEvent mo){
             Tooltip.install(s, new Tooltip("hello"));
             }
         });  
        }
        
        // TODO
    }    
    
}
