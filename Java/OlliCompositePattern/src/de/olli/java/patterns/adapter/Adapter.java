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
public class Adapter implements Vehicle {

    private String hersteller = "";
    private String farbe = "";
    private int kilometerstand = 0;
    private int hoechstGeschwindigkeit = 0;

    private Adapter(String h, String f, int k, int vmax) {

        this.hersteller = h;
        this.farbe = f;
        this.kilometerstand = k;
        this.hoechstGeschwindigkeit = vmax;

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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getMileage() {

        return this.kilometerstand;
    }

    @Override
    public int getDailyRate(int days) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getManufacturer() {

        return this.hersteller;
    }

    @Override
    public String getColor() {

        return this.farbe;
    }

    @Override
    public int getMaxSpeed() {

        return this.hoechstGeschwindigkeit;
    }

}
