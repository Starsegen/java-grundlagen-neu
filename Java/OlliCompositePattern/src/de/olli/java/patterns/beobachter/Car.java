/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.olli.java.patterns.beobachter;

import de.olli.java.patterns.decorator.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Oliver Stabenow <starsegen1987@hotmail.de>
 */
public class Car implements Observable, Vehicle {

    private String manufactorer = "";
    private String color = "";

    private int maxSpeed = 0;

    private int mileage = 0;

    //Wir benötigen eine struktur, um mögliche Obersver zu verwalten
    Set<Observer> stalker = new TreeSet<>(new ObserverComparator());

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

    
    /**
     * Beim Aufruf der Methode bewegt sich das Fahrzeug
     * 
     * Die Beobachter werden über die Änderung des Kilometerstandes informiert.
     * 
     * @param miles 
     */
    @Override
    public void moveForward(int miles) {

        this.mileage += miles;
        
        this.inform();
    }

    @Override
    public int getMileage() {

        return this.mileage;
    }

    @Override
    public int getDailyRate(int days) {

        int rate = 50;

        if (days <= 7) {
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
     * @return Max Speed
     */
    @Override
    public int getMaxSpeed() {

        return this.maxSpeed;
    }

    /**
     * Die Methoden des Interface Observable
     *
     */
    @Override
    public void attach(Observer o) {

        if (null == o) {
            return;
        }
        // füge den Observer zu Menge der Beobachter hinzu
        this.stalker.add(o);

    }

    @Override
    public void detach(Observer o) {

        if (null == o) {
            return;
        }

        //entferne den Stalker aus der Menge der Beobachter
        this.stalker.remove(o);

    }

    @Override
    public void inform() {

        // informiere alle Beobachter, dass sich der Zustand des Objektes geändert hat.
        
        Iterator<Observer> itr = this.stalker.iterator();
        List<Observer> lo = new ArrayList<>();
        
        while (itr.hasNext()) {

            lo.add((Observer)itr.next());
           
        }
        // und aktualisieren die Observer de ArrayList
        for(Observer o : lo){
            
            o.update(this);
        }
        
    }

}
