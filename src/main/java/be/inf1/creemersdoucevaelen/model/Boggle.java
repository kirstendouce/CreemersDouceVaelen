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
    
    public Boggle(){
        dobbelstenen = new ArrayList<>();
        for (int i = 0; i < 16; i++){
            dobbelstenen.add(new Dobbelsteen());
        }
    }
    public ArrayList<Dobbelsteen> getDobbelstenen() {
        return dobbelstenen;
    }
    
    public void bord() {
        //spelbord aanmaken
    }
    
    
    public void opnieuw() {
        //OPnieuw spelbord klaarmaken
    }

    
        
    }

