/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package be.inf1.creemersdoucevaelen.model;

/**
 *
 * @author Maarten Creemers, Kirsten Doucé & Manten Vaelen
 */
public class Dobbelsteen {
    private double nummer;
    private String letter;
    private boolean geselecteerd;
 
    /**
     * constructor voor elke dobbelsteen
     */
    public Dobbelsteen() {
        nummer =(Math.random()*100)/4;
        
        switch( (int) Math.round(nummer)) {
            case 0: 
                letter = "A";
                break;
            case 1: 
                letter = "B";
                break;
            case 2: 
                letter = "C";
                break;
            case 3: 
                letter = "D";
                break;
            case 4: 
                letter = "E";
                break;
            case 5: 
                letter = "F";
                break;
            case 6: 
                letter = "G";
                break;
            case 7: 
                letter = "H";
                break;
            case 8: 
                letter = "I";
                break;
            case 9: 
                letter = "J";
                break;    
            case 10: 
                letter = "K";
                break;    
            case 11: 
                letter = "L";
                break;
            case 12: 
                letter = "M";
                break;
            case 13: 
                letter = "N";
                break;
            case 14: 
                letter = "O";
                break;
            case 15: 
                letter = "P";
                break;
            case 16: 
                letter = "Q";
                break;
            case 17: 
                letter = "R";
                break;
            case 18: 
                letter = "S";
                break;
            case 19: 
                letter = "T";
                break;
            case 20: 
                letter = "U";
                break;
            case 21: 
                letter = "V";
                break;
            case 22: 
                letter = "W";
                break;
            case 23: 
                letter = "X";
                break;
            case 24: 
                letter = "Y";
                break;
            case 25: 
                letter = "Z";
                break;
            default: 
                letter = "A";
                break;
        }
        
    }

    /**
     * @return the letter
     */
    public String getLetter() {
        return letter;
    }
    
    public boolean isGeselecteerd(){
        return geselecteerd;
    }
    
    public void setGeselecteerd(boolean geselecteerd){
        this.geselecteerd = geselecteerd;
    }

}
    
    
    
    
    
    
    
