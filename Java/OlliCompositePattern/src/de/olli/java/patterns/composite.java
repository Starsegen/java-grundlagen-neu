/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.olli.java.patterns;

import java.io.IOException;

/**
 *
 * @author Oliver Stabenow <starsegen1987@hotmail.de>
 */
public class composite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        Kompositum k = new Kompositum();
        
        Kompositum k2 = new Kompositum();
        
        
        
        // fügen einen DebuggerLogfile hinzu
        k2.hinzufuegen(new DebuggerLogfile("a.txt"));
        k2.hinzufuegen(new DebuggerLogfile("b.txt"));
         
        k.hinzufuegen(k2);
        
        Kompositum k3 = new Kompositum();
        
        k3.hinzufuegen(new DebuggerEmail());
        k3.hinzufuegen(new DebuggerSMS());
        
        k2.hinzufuegen(k3);
        
        
        // fügen einen DebuggerEmail hinzu
        k.hinzufuegen(new DebuggerEmail());
        
        // fügen einen DebuggerSMS hinzu
        k.hinzufuegen(new DebuggerSMS());
        
        
        
        //das "zusammengesetzte Debugger-Objekt betrachten wir nun im Ganzen
        
        
        
        k.methodeA();
    }
    
}
