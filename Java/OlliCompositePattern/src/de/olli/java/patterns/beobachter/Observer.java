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
public interface Observer {
    
    
    /**
     * Beobachter müssen informiert werden können von dem beobachteten Objekt.
     * 
     * @param o
     */
    public void update(Observable o);
    
    
}
