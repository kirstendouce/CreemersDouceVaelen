/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package be.inf1.creemersdoucevaelen.view;

import be.inf1.creemersdoucevaelen.model.Dobbelsteen;
import static javafx.print.PrintColor.COLOR;
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
       
    
    public  DobbelsteenView(Dobbelsteen dobbelsteen){
        Rectangle achterkant = new Rectangle(90,90);
        achterkant.setFill(Color.BEIGE);
        achterkant.setStroke(Color.BLACK); 
        
        Text tekst = new Text(dobbelsteen.getLetter());
        
        tekst.setX(45);
        tekst.setY(45);
        
        getChildren().addAll(achterkant, tekst);
    } 
    }

    
