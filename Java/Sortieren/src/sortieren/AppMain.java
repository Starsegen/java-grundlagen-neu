/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortieren;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 *
 * @author Oliver Stabenow <starsegen1987@hotmail.de>
 */
public class AppMain {
        // Aufgabe A) Array erzeugen
    static int[] zahlenFeld = {8, 3, 5, 6, 2, 1, 7, 0, 9, 4};
    

    public static void main(String[] args) {
        PrintWriter ausgabe = null;
    
        
    
        try {
        ausgabe = new PrintWriter( new FileWriter("unsorted.txt"));
        
       
            ausgabe.println(Arrays.toString(zahlenFeld));
        
        
        }
        
        catch( IOException e ){
            //IO-Fehler
            System.err.println(e.getMessage()); 
        }
        catch( Exception e ){
            //Allgemeine-Fehler
            System.err.println(e.getMessage());
        }
        
        finally{
            
            if(ausgabe != null ){
                ausgabe.close();
        }
        System.out.println("Die Unsortierten Zahlen sind:" + Arrays.toString(zahlenFeld));
        
        // Aufgabe B) Sortieren
        BubbleSort.sortieren(zahlenFeld);

        // Aufgabe C) .ausgeben
        System.out.println("Die Sortierten Zahlen sind:" + Arrays.toString(zahlenFeld));
        }
        
        try {
        ausgabe = new PrintWriter( new FileWriter("sorted.txt"));
        
       
            ausgabe.println(Arrays.toString(zahlenFeld));
        
        
        }
        
        catch( IOException e ){
            //IO-Fehler
            System.err.println(e.getMessage()); 
        }
        catch( Exception e ){
            //Allgemeine-Fehler
            System.err.println(e.getMessage());
        }
        
        finally{
            
            if(ausgabe != null ){
                ausgabe.close();
        }
        
        
        
    }
}
}
