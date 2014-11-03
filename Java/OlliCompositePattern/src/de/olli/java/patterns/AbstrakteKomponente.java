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
public abstract class AbstrakteKomponente {
    
    
    /**
     * diese Methode muss in den konkreten Komponentklassen und im Kompositum überschrieben werden
     * 
     * (a) in den konkreten Komponentklassen führt dies zur Ausgabe
     * (b) im Kompositum führt dies zur "Durchforstung" der Kindknoten
     */
    public abstract void methodeA();
    
}
