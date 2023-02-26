/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package covidstatus;

import Covid.Human;
import Covid.MAIN_loop;
import static covidstatus.Jeddah_travelController.NUM;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Tooltip;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;

/**
 * FXML Controller class
 *
 * @author ahmed
 */
public class Makkah_deadController implements Initializable {
Circle circle;
static int NUM=0;
    @FXML
    private AnchorPane anchorPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
                        ArrayList <Human > Array = MAIN_loop.R2_city2_DeadCitizen; 
        
        int Size=Array.size()-1;
        
        int count = 0;
        int i=23;
        int j=23;
        ArrayList <Circle> c = new ArrayList<>();
        while(count<Size){
            
            if(i >= 5000){
                i = 23;
                j+=30;
            }
     String TYPE =Array.get(count).getCovidInfection_TypeType();
            System.out.println(TYPE);
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
        
        
        for(Circle s:c){
            String HISTROY =Array.get(NUM).getHistory();
            System.out.println(HISTROY);
        s.addEventHandler(MouseEvent.MOUSE_MOVED,new EventHandler<MouseEvent>(){
            
                
         
             
             public void handle(MouseEvent mo){
                
                 
                 
             Tooltip.install(s, new Tooltip(HISTROY));
             
             }
             
         });  
       NUM++;
        }
    }    
    
}
