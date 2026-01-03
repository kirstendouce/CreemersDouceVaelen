/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package be.inf1.creemersdoucevaelen;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import be.inf1.creemersdoucevaelen.model.Boggle;
import be.inf1.creemersdoucevaelen.view.BoggleView;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author Maarten Creemers, Kirsten Doucé & Manten Vaelen
 */
public class BoggleFXMLController implements Initializable {
    
    private Boggle model;
    private BoggleView view; 
    
    @FXML
    private AnchorPane anpBord;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        model = new Boggle();
        view  = new BoggleView(model);
        
        anpBord.getChildren().add(view);
        
        update();
    }    
    
    public void update() {
        view.update();
    }
}
