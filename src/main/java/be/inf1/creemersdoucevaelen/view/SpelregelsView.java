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
       Rectangle regels = new Rectangle(220,400, Color.WHITE); 
       
             Text regel = new Text("Elk woord moet minstens 3 letters lang "
                     + "\n zijn."
               + "\n Je kan woorden enkel "
               + "\n vormen door horizontaal, "
               + "\n verticaal en diagonaal aangrenzende "
               + "\n letters aan te klikken. "
               + "\n Je kan elk woord maar 1 keer "
               + "\n opgeven voor punten."
               + "\n De puntentelling is als volgt: "
               + "\n 3 of 4 letters = 1 punt "
               + "\n 5 letters = 2 punten "
               + "\n 6 letters = 3 punten "
               + "\n 7 letters = 5 punten "
               + "\n 8 of meer letters = 11 punten");
       regel.setY(30);
       getChildren().addAll(regels, regel);
       
       //De regels enkel in het kader;
    }
}
