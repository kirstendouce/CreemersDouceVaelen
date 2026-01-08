/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package be.inf1.creemersdoucevaelen.model;

import be.inf1.creemersdoucevaelen.view.DobbelsteenView;
import java.util.ArrayList;

/**
 *
 * @author Maarten Creemers, Kirsten Doucé & Manten Vaelen
 */
public class Boggle {
    private ArrayList<Dobbelsteen> dobbelstenen;
    private Dobbelsteen[][] bord;
    private Dobbelsteen dobbelsteen;
    private Woorden woordUitBoek;
    private String woord;
    private int punten;
    private int laatsteRij = -1;
    private int laatsteKolom = -1;
    
    public Boggle(){
        woordUitBoek = new Woorden();
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
    
    public Dobbelsteen[][] getBord() {
        return bord;
    } 
    
    public boolean magSelecteren(int rij, int kolom) {
    // Eerste klik: 
    if (laatsteRij == -1){
        return true;
    }

    int dr = Math.abs(rij - laatsteRij);
    int dk = Math.abs(kolom - laatsteKolom);

    return dr <= 1 && dk <= 1;
}
    
    public void selecteer(int rij, int kolom){
        Dobbelsteen d = bord[rij][kolom];
       
        if (!d.isGeselecteerd() && magSelecteren(rij, kolom)){
            d.setGeselecteerd(true);
            laatsteRij = rij;
            laatsteKolom = kolom;
        }
    }
    
    public void selecteerCoor(Dobbelsteen d){
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(bord[i][j] == d){
                    selecteer(i,j);
                    return;
                }
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
    
    public String getGeslecteerdWoord() {
        woord = "";
        for(Dobbelsteen d: dobbelstenen) {
            if(d.isGeselecteerd()) {
                woord += d.getLetter();
            }
        }
        return woord;
    }
    
    public boolean woordcontrole() {
        //Is het opgegeven woord een woord uit het woordenboek?
        if(woordUitBoek.isGeldigWoord(getGeslecteerdWoord())) {
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
    
    public void resetGeselecteerd() {
        for(Dobbelsteen d: dobbelstenen) {
            d.setGeselecteerd(false);
        }
    }
}

