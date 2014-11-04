/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.olli.java.patterns.adapter;


/**
 *
 * @author Oliver Stabenow <starsegen1987@hotmail.de>
 */
public interface Vehicle {
    
    public void startEngine();
    
    public void stopEngine();
    
    public void moveForward(int miles);
    
    public int getMileage();
    
    public int getDailyRate(int days);
    
    public String getManufacturer();
    
    public String getColor();
    
    public int getMaxSpeed();
    
}
