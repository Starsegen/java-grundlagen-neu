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
public class Breitreifen extends VehicleDecorator{

    public Breitreifen(Vehicle v) {
        super(v);
    }
    
    @Override
    public int getMaxSpeed(){
        
        return this.vehicle.getMaxSpeed() - 5;
    }
    
    @Override
    public int getDailyRate(int days){
        
        return this.vehicle.getDailyRate(days) + 10;
        
    }
    
}
