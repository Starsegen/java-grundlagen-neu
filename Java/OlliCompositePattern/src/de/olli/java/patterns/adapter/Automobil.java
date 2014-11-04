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
public class Automobil {
    
    private int kilometerstand = 0;
    
    private String farbe = "";
    
    private String hersteller = "";
    
    private int hoechstGeschwindigkeit = 0; 
            
            
    public Automobil(String h, String f, int k, int vmax){
        
        this.hersteller = h;
        this.farbe = f;
        this.kilometerstand = k;
        this.hoechstGeschwindigkeit = vmax;
        
    }
    
    public int getKilometerstand(){
        
        return this.kilometerstand;
    }
    
    public String getHersteller(){
        
        return this.hersteller;
        
    }
    
    public String getFarbe(){
        
        
           return this.farbe;
        
    }
    
    public int getHoechstgeschwindigkeit(){
        
        return this.hoechstGeschwindigkeit;
    }
    
}
