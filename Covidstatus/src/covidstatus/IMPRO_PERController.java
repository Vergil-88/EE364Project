/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package covidstatus;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ahmed
 */
public class IMPRO_PERController implements Initializable {

    @FXML
    private LineChart<String, Number> Chart;
    @FXML
    private Button BACK;
    @FXML
    private Label lbl;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
               ArrayList <String >  Dead1  =Covid.MAIN_loop.ALLDEAD_1;
               ArrayList <String >  Dead2  =Covid.MAIN_loop.ALLDEAD_2;
               
            XYChart.Series<String,Number> series = new XYChart.Series<String,Number>();
        XYChart.Series<String,Number> series2 = new XYChart.Series<String,Number>();
        for(int x = 0 ;x<Dead1.size(); x++) {
        double num1=Integer.parseInt(Dead1.get(x));
        double num2=Integer.parseInt(Dead2.get(x));
        double val=0; 
        
            System.out.println("NUM 1 :"+num1);
            System.out.println("NUM 2 :"+num2);

        if( ! (num1==0) ){
           val=  ( num1 / num2  ) ;  
        }
        else{
            val=0;
        }
          
            System.out.println(val);
            
            
            
            series.getData().add(new XYChart.Data<String,Number>(String.valueOf(Math.floor(val)),x));
        }
        Chart.getData().addAll(series);
        
        for(final LineChart.Data data: series.getData()) {
             data.getNode().addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                 public void handle(MouseEvent event) {
                     lbl.setText(data.getXValue()+"\n"+ String.valueOf(data.getYValue()));
                     Tooltip.install(data.getNode(), new Tooltip(data.getXValue()+"\n"+ String.valueOf(data.getYValue())));
                 }
             });
         }           
               
               
               
               
    }    

    @FXML
    private void BACK_ACT(ActionEvent event) {//Chart
                                              try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Chart.fxml"));
            Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        
        } catch (IOException io) {
            System.out.println("FXML Loading Error");
        }
    }
    
}
