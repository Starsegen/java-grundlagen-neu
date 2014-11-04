/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.olli.java.patterns;

import de.olli.java.patterns.*;
import de.olli.patterns.adt.liste;
import java.io.IOException;

/**
 *
 * @author Oliver Stabenow <starsegen1987@hotmail.de>
 */
public class composite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        // TODO code application logic here
        
        Kompositum k = new Kompositum();
        
        Kompositum k2 = new Kompositum();
        
        
        
        // fügen einen DebuggerLogfile hinzu
        k2.hinzufuegen(21,new DebuggerLogfile("a.txt"));
        k2.hinzufuegen(22,new DebuggerLogfile("b.txt"));
         
        k.hinzufuegen(2,k2);
        
        Kompositum k3 = new Kompositum();
        
        k3.hinzufuegen(31,new DebuggerEmail());
        k3.hinzufuegen(32,new DebuggerSMS());
        
        k2.hinzufuegen(3,k3);
        
        
        // fügen einen DebuggerEmail hinzu
        k.hinzufuegen(11,new DebuggerEmail());
        
        // fügen einen DebuggerSMS hinzu
        k.hinzufuegen(12,new DebuggerSMS());
        
        
        k.entfernen(32);
        //das "zusammengesetzte Debugger-Objekt betrachten wir nun im Ganzen
      
        k.methodeA();
        
        
        
        
        
        liste list = new liste(); 
        list.addLast("1"); 
        list.addLast("2"); 
        list.addLast("3"); 
        list.addLast("4"); 
        list.addLast("5"); 
        list.insertAfter("2", "neu"); 
        list.delete("3"); 
        list.writeList(); 
        System.out.println("erstes Element: " + list.getFirstElem().getObj()); 
        System.out.println("ist '3' enthalten? " + list.find("3")); 
        System.out.println("ist '5' enthalten? " + list.find("5")); 
        System.out.println("letztes Element: " + list.getLastElem().getObj()); 
        
        
    }
    
    
    
    
    
    
}
