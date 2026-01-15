/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package be.inf1.creemersdoucevaelen;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import be.inf1.creemersdoucevaelen.model.Boggle;
import be.inf1.creemersdoucevaelen.view.BoggleView;
import be.inf1.creemersdoucevaelen.view.SpelregelsView;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Maarten Creemers, Kirsten Doucé & Manten Vaelen
 */
public class BoggleFXMLController implements Initializable {
    
    private Boggle model;
    private BoggleView view; 
    private SpelregelsView viewRegels;
    private int punten = 0;
    
    
    @FXML
    private AnchorPane anpBord;
    
    @FXML
    private Button btnSpelregels;
    
    @FXML
    private Button btnBord;

    @FXML
    private Label lblPunten;

    @FXML
    private Label lblScore;
    
    @FXML
    private Button btnControleer;
  
     
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        model = new Boggle();
        view  = new BoggleView(model);
        viewRegels = new SpelregelsView();
        
        anpBord.getChildren().add(view);
        
        
        update();
    }    
    
    @FXML
    void geklikt(ActionEvent event) {
        model.maakBord();
        model.setPunten(0);
        punten = 0;
        lblPunten.setText(punten +"");
        update();
    }
    
    @FXML
    void controleerWoord(ActionEvent event) {
       if(model.woordcontrole()) {
           punten += model.getPunten();
           lblPunten.setText(punten + "" );
       } else {
           view.foutWoord();
       }
       model.resetGeselecteerd();
       update();
    }
    
    @FXML
    void toonSpelregels(ActionEvent event) {
        Stage spelregelsStage = new Stage();
    
        SpelregelsView regelsView = new SpelregelsView();

        Scene scene = new Scene(regelsView, 600, 400);
        spelregelsStage.setScene(scene);
        spelregelsStage.show();    
    }
    
    public void update() {
        view.update();
    }   
}
    
  







    
