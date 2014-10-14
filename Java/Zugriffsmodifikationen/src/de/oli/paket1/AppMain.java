/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.oli.paket1;

import java.util.Arrays;

/**
 *
 * @author Oliver Stabenow <starsegen1987@hotmail.de>
 */
public class AppMain {
    // Aufgabe A) Array erzeugen
    static int[] zahlenFeld = {8, 3, 5, 6, 2, 1, 7, 0, 9, 4};

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Die Unsortierten Zahlen sind:" + Arrays.toString(zahlenFeld));
        // TODO code application logic here
        KlasseA ka = new KlasseA();
        // Aufgabe B) Sortieren
        ka.sortieren(zahlenFeld);

    // Aufgabe C) .ausgeben
        System.out.println("Die Sortierten Zahlen sind:" + Arrays.toString(zahlenFeld));

    }
}
