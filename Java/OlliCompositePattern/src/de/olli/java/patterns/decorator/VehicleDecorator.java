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
public abstract class VehicleDecorator implements Vehicle{

    
    //der Dekorierer kann entweder ein Car Objekt oder ein anderes Dekorierer Objekt 
    // referenzieren
    protected Vehicle vehicle = null;

    
    /**
     * Der Konstruktor bekommt als Pramenter das zu dekorierende Objekt übergeben
     * 
     * @param v etwas, das sich wie ein Vehicle verhält 
     */
    public VehicleDecorator(Vehicle v) {
        
        this.vehicle = v;
    }
    
    
    /**
     * Die Methode dekoriert nicht, sondern reicht den aufruf direkt an das
     * dekorierte Objekt weiter
     * 
     */
    @Override
    public void startEngine() {
    
        this.vehicle.startEngine();
    }

    @Override
    public void stopEngine() {
    
        this.vehicle.stopEngine();
    }

    
    @Override
    public void moveForward(int miles) {
    
        this.vehicle.moveForward(miles);
    }

    @Override
    public int getMileage() {
    
        return this.vehicle.getMileage();
    }

    @Override
    public int getDailyRate(int days) {
     
        return this.vehicle.getDailyRate(days);
    }

    @Override
    public String getManufacturer() {
    
        return this.vehicle.getManufacturer();
    }

    @Override
    public String getColor() {
    
        return this.vehicle.getColor();
    }

    @Override
    public int getMaxSpeed() {
    
        return this.vehicle.getMaxSpeed();
    }
    
    
    
}
