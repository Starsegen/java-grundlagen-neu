/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.olli.java.patterns.beobachter;

/**
 *
 * @author Oliver Stabenow <starsegen1987@hotmail.de>
 */
public interface Observable {
    
    
    /**
     * Beobachter können sich registrieren.
     * 
     * @param o
     */
    public void attach(Observer o);
    
    
    /**
     * Beobachter können sich abmelden.
     * 
     * @param o 
     */
    public void detach(Observer o);
    
    
    /**
     * Beobachter werden informiert.
     * 
     */
    public void inform();
    
}
