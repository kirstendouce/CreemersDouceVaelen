/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package be.inf1.creemersdoucevaelen.view;

import be.inf1.creemersdoucevaelen.model.Boggle;
import be.inf1.creemersdoucevaelen.model.Dobbelsteen;
import java.util.ArrayList;
import javafx.scene.layout.Region;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author Kirsten Doucé
 */
public class BoggleView extends Region {
    private Boggle model;

    public BoggleView(Boggle model) {
        this.model = model;
        update();
    }
    
    public void update()
    {
        getChildren().clear();
        ArrayList<Dobbelsteen> dobbelstenen = model.getDobbelstenen();
        for(Dobbelsteen d : dobbelstenen) {
            DobbelsteenView dv = new DobbelsteenView(d);
            getChildren().add(dv);
        }
        
        
    }
    
    
}
