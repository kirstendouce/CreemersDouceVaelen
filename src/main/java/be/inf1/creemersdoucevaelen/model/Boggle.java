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
    private ArrayList<Dobbelsteen> geselecteerdeDobbelstenen;
    private Dobbelsteen[][] bord;
    private Woorden woordUitBoek;
    private int punten;
    private int laatsteRij = -1;
    private int laatsteKolom = -1;
    private Dobbelsteen vorige;
    
    public Boggle(){
        woordUitBoek = new Woorden();
        geselecteerdeDobbelstenen = new ArrayList<>();
        maakBord();
    }
    
    public void maakBord() {
        //spelbord aanmaken
        bord = new Dobbelsteen[4][4];
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
               bord [i][j] = new Dobbelsteen(i,j);
            }
        }
    } 
    
    public Dobbelsteen[][] getBord() {
        return bord;
    } 

    public boolean magSelecteren(Dobbelsteen d) {
        if (vorige == null) {
            vorige = d;
            return true;
        } else {

            int eersteRij = vorige.getRij();
            int eersteKolom = vorige.getKolom();

            int tweedeRij = d.getRij();
            int tweedeKolom = d.getKolom();

            boolean aangrenzend =
                Math.abs(eersteRij - tweedeRij) <= 1 &&
                Math.abs(eersteKolom - tweedeKolom) <= 1;

            if (aangrenzend) {
                vorige = d;
                return true;
            } else {
                return false;
            }
        }
    }

    public void selecteer(Dobbelsteen d){
        if (!d.isGeselecteerd() && magSelecteren(d)){
            d.setGeselecteerd(true);
            geselecteerdeDobbelstenen.add(d);
            laatsteRij = d.getRij();
            laatsteKolom = d.getKolom();
        }
    }
    
    public void deselecteer(Dobbelsteen d) {
        d.setGeselecteerd(false);
        geselecteerdeDobbelstenen.remove(d);
        
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
    
    public ArrayList<Dobbelsteen> getGeselecteerdeDobbelstenen() {
        return geselecteerdeDobbelstenen;
    }
    
    public String getGeselecteerdWoord() {
        String woord = "";
        for(Dobbelsteen d: geselecteerdeDobbelstenen) {
            woord += d.getLetter();
        }
        return woord;
    }
    
    public boolean woordcontrole() {
        //Is het opgegeven woord een woord uit het woordenboek?
        System.out.println("Te controleren woord: '" + getGeselecteerdWoord() + "'");
        if(woordUitBoek.isGeldigWoord(getGeselecteerdWoord())) {
            setPunten(aantalPunten());
            return true;
        } else {
            return false; 
        }
    }
    
    public int aantalPunten() {
        //getGeselecteerdWoord();
        String woordLengte = getGeselecteerdWoord();
        switch(woordLengte.length()){
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
        for(Dobbelsteen d: geselecteerdeDobbelstenen) {
            d.setGeselecteerd(false);
        }
        geselecteerdeDobbelstenen.clear();
        laatsteRij = -1;
        laatsteKolom = -1;
        vorige = null;
    }
}
