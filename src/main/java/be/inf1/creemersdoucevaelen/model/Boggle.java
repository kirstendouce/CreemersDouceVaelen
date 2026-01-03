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
    
    public Boggle(){
        maakBord();
    }
    
    public void maakBord() {
        //spelbord aanmaken
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
               bord [i][j] = new Dobbelsteen();
            }
        }
    } 
    
    public Dobbelsteen getDobbelsteen(int x, int y) {
        return bord[x][y];
    }
}

