/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package covidstatus;

import Covid.MAIN_loop;
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
 * @author ahmed
 */
public class Alhf_aliveController implements Initializable {
Circle circle;
Label lb = new Label();
    @FXML
    private AnchorPane anchorPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
             int Size=MAIN_loop.R1_city1_Citizen.size();
        
        int count = 0;
        int i=23;
        int j=23;
        ArrayList <Circle> c = new ArrayList<>();
        while(count<Size){
            
            if(i >= 5000){
                i = 23;
                j+=30;
            }
     String TYPE =MAIN_loop.R1_city1_Citizen.get(count).getCovidInfection_TypeType();
                 
            
            switch(TYPE){
                case "A":
                    circle = new Circle(i,j,15);
                    circle.setStroke(javafx.scene.paint.Color.BLACK);
                    circle.setFill(javafx.scene.paint.Color.RED);
                    break;
                case "B":
                    circle = new Circle(i,j,15);
                    circle.setStroke(javafx.scene.paint.Color.BLACK);
                    circle.setFill(javafx.scene.paint.Color.ORANGE);
                    break;                    
                case "C":
                    circle = new Circle(i,j,15);
                    circle.setStroke(javafx.scene.paint.Color.BLACK);
                    circle.setFill(javafx.scene.paint.Color.YELLOW);
                    break;                    
                case "Normal":
                    circle = new Circle(i,j,15);
                    circle.setStroke(javafx.scene.paint.Color.BLACK);
                    circle.setFill(javafx.scene.paint.Color.GREEN);
                    break;                    
                    
                   
            }

        anchorPane.getChildren().add(circle);
        c.add(circle);
        
        
        
        count++;
            i+=30;         
    }
        
        int NUM=0;
        for(Circle s:c){
            String HISTROY =MAIN_loop.R1_city1_Citizen.get(count).getHistory();
        s.addEventHandler(MouseEvent.MOUSE_MOVED,new EventHandler<MouseEvent>(){
            
                
         
             
             public void handle(MouseEvent mo){
             Tooltip.install(s, new Tooltip(HISTROY));
             }
             
         });  
        NUM=NUM+1;
        }   
        
    }    
    
}
