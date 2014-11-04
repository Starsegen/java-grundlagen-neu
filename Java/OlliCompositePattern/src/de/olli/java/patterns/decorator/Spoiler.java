/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.olli.java.patterns.decorator;

/**
 *
 * @author Oliver Stabenow <starsegen1987@hotmail.de>
 */
public class Spoiler extends VehicleDecorator{

    /**
     * Ein Spoiler muss an ein Car Objekt oder Dekorierer Objekt
     * 
     * @param v 
     */
    public Spoiler(Vehicle v) {
        
        super(v);
    }
    
    
    /**
     * Ein Spoiler lässt das Auto um 15 km/h schneller fahren.
     * 
     * @return 
     */
    @Override
    public int getMaxSpeed(){
        
        return this.vehicle.getMaxSpeed() +(this.vehicle.getMaxSpeed()/100*15);
    }
    
    
    /**
     * Ein Auto mit Spoiler kostet in der Vermietung 10 € mehr pro Tag
     * 
     * @param days
     * @return 
     */
    @Override
    public int getDailyRate(int days){
        
        return this.vehicle.getDailyRate(days) + 10;
    }
}
