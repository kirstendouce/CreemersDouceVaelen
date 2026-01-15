/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package be.inf1.creemersdoucevaelen.view;

import be.inf1.creemersdoucevaelen.model.Boggle;
import be.inf1.creemersdoucevaelen.model.Dobbelsteen;
import java.util.ArrayList;
import javafx.scene.control.Alert;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author Maarten Creemers, Kirsten Doucé & Manten Vaelen
 */
public class BoggleView extends Region {
    private Boggle model;

    public BoggleView(Boggle model) {
        this.model = model;
        update();
    }
    
    public void update() {
        getChildren().clear();
        
        Dobbelsteen [][]  bord = model.getBord();
        ArrayList<Dobbelsteen> dobbelstenen = model.getDobbelstenen();
        int getal = 0 ;
        int lengte = 0 ;
        int beginX = 160;
        int beginY = 50;
        for(Dobbelsteen d : dobbelstenen) {
            DobbelsteenView dv = new DobbelsteenView(d, model);
            dv.setTranslateX(beginX + 80 * getal);
            dv.setTranslateY(beginY + 80 * lengte);
            
            getChildren().add(dv);
            
            getal++;
            if (getal == 4) {
                getal = 0;
                lengte++;
            }
        }
    }
    
    public void foutWoord() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Geen woord");
        alert.setContentText("Sorry, maar het opgegeven woord klopt niet. Probeer een ander woord!");
        alert.showAndWait();
    }
    
    public void gebruiktWoord() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Gebruikt woord");
        alert.setContentText("Sorry, maar het opgegeven woord is al eens gebruikt! Probeer een nieuw pad!");
        alert.showAndWait();
    }
}