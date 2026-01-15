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
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Maarten Creemers, Kirsten Doucé & Manten Vaelen
 */
public class BoggleFXMLController implements Initializable {
    private Boggle model;
    private BoggleView view; 
    private int punten = 0;
    private int hoogstePunten;
    private MediaPlayer mediaPlayer;
    
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
    private Label lblHoogstePunten;

    @FXML
    private Label lblHoogsteScore;
    
    @FXML
    private Button btnControleer;
   
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        model = new Boggle();
        view  = new BoggleView(model);
        
        anpBord.getChildren().add(view);
        
        lblHoogsteScore.setLayoutY(380);
        lblHoogstePunten.setLayoutY(380);
        update();
    }    
    
    @FXML
    void geklikt(ActionEvent event) {
        if(hoogstePunten < punten) {
            hoogstePunten = punten;
            lblHoogstePunten.setText(punten + "");
        }
        model.resetGebruiktePaden();
        model.resetGeselecteerd();
        model.maakBord();
        model.setPunten(0);
        model.resetGebruiktePaden();
        punten = 0;
        lblPunten.setText(punten +"");  
        update();
    }
  
    @FXML
    void controleerWoord(ActionEvent event) {
        if (model.woordcontrole()) {
            punten += model.getPunten();
            lblPunten.setText(punten + "");

            // URL ophalen via chatgpt
            URL url = getClass().getResource(
                "/be/inf1/creemersdoucevaelen/right_buzzer.mp3"
            );
            mediaPlayer = new MediaPlayer(new Media(url.toString()));
            mediaPlayer.play();
        } else if(model.getGebruiktePaden().contains(model.getPad())) {
            // URL ophalen via chatgpt
            URL url = getClass().getResource(
                "/be/inf1/creemersdoucevaelen/WahFailSoundEffect.mp3"
            );
            mediaPlayer = new MediaPlayer(new Media(url.toString()));
            mediaPlayer.play();
            view.gebruiktWoord();
        } else {
            // URL ophalen via chatgpt
            URL url = getClass().getResource(
                "/be/inf1/creemersdoucevaelen/wrong_buzzer.mp3"
            );
            mediaPlayer = new MediaPlayer(new Media(url.toString()));
            mediaPlayer.play();
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