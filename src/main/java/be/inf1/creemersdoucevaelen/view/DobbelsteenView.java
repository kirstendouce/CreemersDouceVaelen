/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package be.inf1.creemersdoucevaelen.view;

import be.inf1.creemersdoucevaelen.model.Boggle;
import be.inf1.creemersdoucevaelen.model.Dobbelsteen;
import java.util.ArrayList;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

/**
 *
 * @author Maarten Creemers, Kirsten Doucé & Manten Vaelen
 */
public class DobbelsteenView extends Region {
    private Dobbelsteen model;
    private Boggle boggle;
    private Rectangle achterkant;
     
    public  DobbelsteenView(Dobbelsteen model, Boggle boggle){
        this.model = model;
        this.boggle = boggle;
       
        achterkant = new Rectangle(70,70);
        achterkant.setFill(Color.BEIGE);
        achterkant.setStroke(Color.BLACK); 
        
        Text tekst = new Text(model.getLetter());
        
        tekst.setX(30);
        tekst.setY(40);
        
        getChildren().addAll(achterkant, tekst);
        
        setOnMouseClicked(e -> {
            if(model.isGeselecteerd()) {
                boggle.deselecteer(model);
            } else if(!model.isGeselecteerd()){
                boggle.selecteer(model);
            }
        
            update();
        });
    }
            
    public Dobbelsteen getModel() {
        return model;
    }
    
    public void update(){
        if(model.isGeselecteerd()){
            achterkant.setFill(Color.CHOCOLATE);     
        } else {
            achterkant.setFill(Color.BEIGE); 
        }
    }
}


    
