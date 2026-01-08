/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package be.inf1.creemersdoucevaelen.view;

import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

/**
 *
 * @author Maarten Creemers, Kirsten Doucé & Manten Vaelen
 */
public class SpelregelsView extends Region {
    
    public SpelregelsView() {
       Rectangle regels = new Rectangle(230,410, Color.WHITE); 
       
             Text regel = new Text("SPELREGELS \n"
               + "\n1) Elk woord moet minstens 3 letters lang zijn."
               + "\n2) Je kan woorden enkel vormen door "
               + "\nhorizontaal,verticaal en diagonaal "
               + "\naangrenzende letters aan te klikken. "
               + "\n3) Je kan elk woord maar 1 keer "
               + "\nopgeven voor punten."
               + "\n4) De puntentelling is als volgt: "
               + "\n3 of 4 letters = 1 punt "
               + "\n5 letters = 2 punten "
               + "\n6 letters = 3 punten "
               + "\n7 letters = 5 punten "
               + "\n8 of meer letters = 11 punten");
       regel.setY(30);
       getChildren().addAll(regels, regel);
       
       //De regels enkel in het kader;
    }
}
