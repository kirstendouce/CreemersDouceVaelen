/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package be.inf1.creemersdoucevaelen.model;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Maarten Creemers, Kirsten Doucé & Manten Vaelen
 */

public class Woorden {

    private ArrayList<String> woorden;

    public Woorden() {
        woorden = new ArrayList<>();
        leesWoorden();
    }

    private void leesWoorden() {
        try {
            InputStream is = getClass().getResourceAsStream("/be.inf1.creemersdoucevaelen/wordlist.txt");

            if (is == null) {
                System.out.println("wordlist.txt niet gevonden");
                return;
            }

            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String regel;

            while ((regel = reader.readLine()) != null) {
                woorden.add(regel.trim().toUpperCase());
            }

            reader.close();

        } catch (Exception e) {
            System.out.println("Fout bij inlezen woordenbestand");
        }
    }

    public boolean isGeldigWoord(String woord) {
        if (woord == null || woord.length() < 3) {
            return false;
        }
        
        return woorden.contains(woord.trim().toUpperCase());
    }
}
