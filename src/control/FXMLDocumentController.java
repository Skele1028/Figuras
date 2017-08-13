package control;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;

/**
 *
 * @author HOGAR
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Canvas canva2;
    
    
    
    @FXML
    public void CrearCirculoBt(ActionEvent event) {
        GraphicsContext gc = canva2.getGraphicsContext2D();
        gc.strokeOval(20, 200, 100, 100);
        gc.setFill(Color.BLUE);
    }
    
      @FXML
    public void PintarCirculoBt(ActionEvent event) {
        GraphicsContext gc = canva2.getGraphicsContext2D();
        gc.fillOval(20, 200, 100, 100);
        gc.setFill(Color.color(Math.random(), Math.random(), Math.random()));
    } 
    
    @FXML
    public void CrearCuadradoBt(ActionEvent event) {
       GraphicsContext gc = canva2.getGraphicsContext2D();
       gc.strokeRect(100, 100, 100, 100);
    }
    
    @FXML
    public void PintarCuadradoBt(ActionEvent event) {
        GraphicsContext gc = canva2.getGraphicsContext2D();
        gc.fillRect(100, 100, 100, 100);
        gc.setFill(Color.color(Math.random(), Math.random(), Math.random()));
    } 
    
    @FXML
    public void CrearTrianguloBt(ActionEvent event) {
        GraphicsContext gc = canva2.getGraphicsContext2D();
        gc.beginPath();
        gc.moveTo(0,100);
        gc.lineTo(0,0);
        gc.lineTo(100,100);
        gc.closePath(); 
        gc.stroke();
    }
    
    @FXML
    public void PintarTrianguloBt(ActionEvent event) {
        GraphicsContext gc = canva2.getGraphicsContext2D();
        gc.moveTo(0,100);
        gc.lineTo(0,0);
        gc.lineTo(100,100);
        gc.closePath();
        gc.fill();
        gc.setFill(Color.color(Math.random(), Math.random(), Math.random()));
    }
    
    @FXML
    public void CrearLineaBt(ActionEvent event) {
        GraphicsContext gc = canva2.getGraphicsContext2D();
        gc.strokeLine(400, 400, 200, 200); 
    }
    
    @FXML
    public void PintarColorBt(ActionEvent event) {
        GraphicsContext gc = canva2.getGraphicsContext2D();
        gc.strokeLine(400, 400, 200,200);
        gc.setStroke(Color.color(Math.random(), Math.random(), Math.random()));  
    }
      
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       System.out.println("inicio");
    }    
    
}
