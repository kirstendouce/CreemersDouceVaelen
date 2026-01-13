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
import be.inf1.creemersdoucevaelen.model.Dobbelsteen;
import be.inf1.creemersdoucevaelen.view.BoggleView;
import be.inf1.creemersdoucevaelen.view.DobbelsteenView;
import be.inf1.creemersdoucevaelen.view.SpelregelsView;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author Maarten Creemers, Kirsten Doucé & Manten Vaelen
 */
public class BoggleFXMLController implements Initializable {
    
    private Boggle model;
    private BoggleView view; 
    private SpelregelsView viewRegels;
    private int punten = 1;
    
    
    @FXML
    private AnchorPane anpBord;
    
    @FXML
    private AnchorPane anpRegels;
    
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
        anpRegels.getChildren().add(viewRegels);
        update();
    }    
    
    @FXML
    void geklikt(ActionEvent event) {
        model.maakBord();
        update();
    }
    
    @FXML
    void controleerWoord(ActionEvent event) {
        punten += model.getPunten();
       if(model.woordcontrole()) {
           lblPunten.setText(punten + "" );
       } else {
           view.foutWoord();
       }
       model.resetGeselecteerd();
       update();
    }
    
    public void update() {
        view.update();
    }
}
    
  







    
