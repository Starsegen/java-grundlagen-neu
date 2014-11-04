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
public class Car implements Vehicle{

    private String manufactorer = "";
    private String color ="";
    
    private int maxSpeed = 0;
    
    private int mileage = 0;
    
    /**
     * Der Konstruktor
     */
    public Car(String m, String c, int s) {
        
        this.manufactorer = m;
        this.color = c;
        this.maxSpeed = s;
    }

    
    
    @Override
    public void startEngine() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void stopEngine() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void moveForward(int miles) {
    
        this.mileage += miles;
    }

    @Override
    public int getMileage() {
    
        return this.mileage;
    }

    @Override
    public int getDailyRate(int days) {
    
        int rate = 50;
        
        if(days <=7){
            rate = 65;
        }
        
        return rate;
    }

    @Override
    public String getManufacturer() {
    
        return this.manufactorer;
    }

    @Override
    public String getColor() {
    
           return this.color;
    }

    
    /**
     * Die Methode liefert den Max Speed zu einem Auto.
     * 
     * Diese Methode soll als Beispiel für den Dekorierer dienen
     * 
     * @return  Max Speed 
     */
    @Override
    public int getMaxSpeed() {
    
        return this.maxSpeed;
    }
    
}
