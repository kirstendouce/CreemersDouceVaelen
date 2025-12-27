/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package be.inf1.creemersdoucevaelen.view;

import be.inf1.creemersdoucevaelen.model.Dobbelsteen;
import javafx.scene.layout.Region;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author Kirsten Doucé
 */
public class BordView extends Region {
    private Dobbelsteen model;

    public BordView(Dobbelsteen model) {
        this.model = model;
        update();
    }
    
    public void update()
    {
        Rectangle achterkant = new Rectangle(40,40);
        
        
    }
    
    
}
