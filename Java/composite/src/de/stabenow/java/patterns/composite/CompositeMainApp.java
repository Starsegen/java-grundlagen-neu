/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.stabenow.java.patterns.composite;

/**
 *
 * @author Oliver Stabenow <starsegen1987@hotmail.de>
 */
public class CompositeMainApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Kompositum k = new Kompositum();
        
        // fügen einen DebuggerEmail hinzu
        k.hinzufuegen(new DebuggerEmail());
        
        // fügen einen DebuggerSMS hinzu
        k.hinzufuegen(new DebuggerSMS());
        
        // fügen einen DebuggerLogfile hinzu
        k.hinzufuegen(new DebuggerLogfile());
        
        
        //das "zusammengesetzte Debugger-Objekt betrachten wir nun im Ganzen
        
        k.methodeA();
    }
    
}
