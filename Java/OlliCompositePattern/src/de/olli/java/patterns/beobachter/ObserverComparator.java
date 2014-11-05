/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.olli.java.patterns.beobachter;

import java.util.Comparator;

/**
 * Die Observer müssen vergleichbar sein, damit sie in dem TreeSet gespeichert werden können.
 * 
 * @author Oliver Stabenow <starsegen1987@hotmail.de>
 */
public class ObserverComparator implements Comparator<Observer>{

    @Override
    public int compare(Observer o1, Observer o2) {
    
        return o1.hashCode() - o2.hashCode();
    }
    
}
