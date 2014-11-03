/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.olli.java.patterns;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DebuggerLogfile extends AbstrakteKomponente{

    @Override
    public void methodeA() {
    
        // hier wird die Debugmeldung in eine Datei geschrieben
        
        System.out.println("Eintrag ins Logfile: " + this.getClass().getSimpleName());
        
        
    }
    
    DebuggerLogfile(String n){
        
        PrintWriter ausgabe = null;
        try {
            ausgabe = new PrintWriter(new FileWriter(n));
            
            ausgabe.println("Eintrag ins Logfile:" + this.getClass().getSimpleName());
            
        } catch (IOException ex) {
            Logger.getLogger(DebuggerLogfile.class.getName()).log(Level.SEVERE, null, ex);
            
        } finally {
            if( ausgabe != null) {
                ausgabe.close();
            }
        }
        
       
        
       
        
        
    }
    
}
