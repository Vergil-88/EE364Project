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
import javafx.scene.chart.LineChart;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.util.ArrayList;
import javafx.event.EventHandler;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author ahmed
 */
public class ChartController implements Initializable {

    @FXML
    private LineChart<String , Number> Chart;
    @FXML
    private Button BACK;
    @FXML
    private LineChart<String, Number> Chart1;
    @FXML
    private Label lbl;
    @FXML
    private Button Improvement;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    
       ArrayList <String >  Dead1  =Covid.MAIN_loop.ALLDEAD_1;
       ArrayList <String >  Dead2  =Covid.MAIN_loop.ALLDEAD_2;
        System.out.println(Dead1);
                System.out.println(Dead2);

    
        XYChart.Series<String,Number> series = new XYChart.Series<String,Number>();
        XYChart.Series<String,Number> series2 = new XYChart.Series<String,Number>();
        for(int x = 0 ;x<Dead1.size(); x++) {
             series.getData().add(new XYChart.Data<String,Number>(Dead1.get(x),x));
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
        for(int x = 0 ;x<Dead2.size(); x++) {
             series2.getData().add(new XYChart.Data<String,Number>(Dead2.get(x),x));
             }
        Chart1.getData().addAll(series2);
       for(final LineChart.Data data1: series2.getData()) {
             data1.getNode().addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                 public void handle(MouseEvent event) {
                     lbl.setText(data1.getXValue()+"\n"+ String.valueOf(data1.getYValue()));
                     Tooltip.install(data1.getNode(), new Tooltip(data1.getXValue()+"\n"+ String.valueOf(data1.getYValue())));
                 }
             });
        
        
         
       }  
    
    }
    
        
        
       

    @FXML
    private void BACK_act(ActionEvent event) {
                              try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Covidstatus.fxml"));
            Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        
        } catch (IOException io) {
            System.out.println("FXML Loading Error");
        }
    }

    @FXML
    private void Improvement_act(ActionEvent event) {
                                      try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("IMPRO_PER.fxml"));
            Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
        
        } catch (IOException io) {
            System.out.println("FXML Loading Error");
        }
        
    }
    
}
