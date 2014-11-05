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
public class Erstinspektion implements Observer{

    @Override
    public void update(Observable o) {
    
        //Erstinspektion bei 1000 km
        if( ((Car)o).getMileage() >= 1000){
        
            System.out.println("Erstinspektion");
            // nach Erstinspektion wird das Auto nicht mehr beobachtet.
        o.detach(this);
        }
    
    }
    
}
