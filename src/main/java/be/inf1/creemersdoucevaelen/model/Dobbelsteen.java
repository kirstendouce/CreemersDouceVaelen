/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package be.inf1.creemersdoucevaelen.model;

/**
 *
 * @author Kirsten Doucé
 */
public class Dobbelsteen {
    private Boggle letter;

   

    /**
     * constructor voor elke dobbelsteen
     * @param letter 
     */
    public Dobbelsteen(Boggle letter) {
        this.letter = letter;
    }

    /**
     * @return the letter
     */
    public Boggle getLetter() {
        return letter;
    }

    /**
     * @param letter the letter to set
     */
    public void setLetter(Boggle letter) {
        this.letter = letter;
    }
    
    
    
    
    }
    
    
    
    
    
    
    
}
