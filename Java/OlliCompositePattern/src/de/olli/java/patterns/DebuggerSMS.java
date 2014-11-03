/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.olli.java.patterns;

/**
 *
 * @author Oliver Stabenow <starsegen1987@hotmail.de>
 */
public class DebuggerSMS extends AbstrakteKomponente {

    @Override
    public void methodeA() {
    
        // hier wird die SMS versendet
        
        System.out.println("SMS an den Programmierer von: " + this.getClass().getSimpleName());
    }
    
}
