/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package be.inf1.creemersdoucevaelen.model;

import java.util.ArrayList;

/**
 *
 * @author Maarten Creemers, Kirsten Doucé & Manten Vaelen
 */
public class Boggle {
    private ArrayList<Dobbelsteen> dobbelstenen;
    private Dobbelsteen dobbelsteen;
    private Dobbelsteen[][] bord;
    private Woorden woordUitBoek;
    private String woord;
    private int punten;
    
    public Boggle(){
        maakBord();
    }
    
    public void maakBord() {
        //spelbord aanmaken
        bord = new Dobbelsteen[4][4];
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
               bord [i][j] = new Dobbelsteen();
            }
        }
    } 
    
    public ArrayList<Dobbelsteen> getDobbelstenen() {
        dobbelstenen = new ArrayList<>();
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
               dobbelstenen.add(bord[i][j]);
            }
        }
        return dobbelstenen;
    }
    
    public boolean woordcontrole() {
        //Is het opgegeven woord een woord uit het woordenboek?
        if(woordUitBoek.isGeldigWoord(woord)) {
            setPunten(aantalPunten());
            return true;
        } else {
            return false; 
        }
    }
    
    public int aantalPunten() {
        switch(woord.length()){
            case 3:
            case 4:
                punten = 1;
                break;
            case 5:
                punten = 2;
                break;
            case 6:
                punten = 3;
                break;
            case 7:
                punten = 5;
                break;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:    
                punten = 11;
                break;
            default: 
                punten = 0;
                break;
        }
        return punten;
    }
    
    public void setPunten(int punten) {
        this.punten = punten;
    }
    
    public int getPunten() {
        return punten;
    }
}

