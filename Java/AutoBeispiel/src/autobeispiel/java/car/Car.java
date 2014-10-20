/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autobeispiel.java.car;

import java.util.Comparator;

/**
 *
 * @author Oliver Stabenow <starsegen1987@hotmail.de>
 */
public class Car implements Vehicle, Comparator<Car>, Comparable<Car> {

    private boolean engineStatus;
    public int milage;

    public Car() {

        this.engineStatus = false;
        this.milage = 0;

    }

    public Car(boolean engineStatus, int milage) {

        this.engineStatus = engineStatus;
        this.milage = milage;

    }

    @Override
    public void startEngine() {
        this.engineStatus = true;
    }

    @Override
    public void stopEngine() {
        this.engineStatus = false;
    }

    @Override
    public void move(int distance) {
        if (!this.engineStatus) {
            this.engineStatus = true;
        }

        // ungültige Werte abfangen
        if (distance < 0) {
            // throw new FerrisMachtBlauException("so nicht!");
        }

        this.milage += distance;

    }

    @Override
    public String toString() {

        return this.getClass().getSimpleName() + ":" + this.milage;
    }

    @Override
    public boolean equals(Object obj) {

        //Reflexivilität
        if (this == obj) {
            return true;
        }

        //mit NIchts vergleichen muss immer False ergeben
        if (obj == null) {
            return false;
        }

        //Prüfen auf Vergleichbarkeit
        if (this.getClass() != obj.getClass()) {
            return false;
        }

        // prüfen aller AAttribute auf gleichwertigkeit
        if (this.milage != ((Car) obj).milage) {
            return false;
        }

        if (this.engineStatus != ((Car) obj).engineStatus) {
            return false;
        }
        
        return true;
    }

    @Override
    public int hashCode() {

        //int-Werte direkt verarbeiten
        int result = 37 *  19 + ((this.engineStatus)?1:0);
        
        result = 37 * result + this.milage;
        
        

        //ggfs. negative Zahlen ausmaskieren 
        return result & 0x7fffffff;
        
    }

    @Override
    public int compare(Car o1, Car o2) {
        if(o1.milage == o2.milage){
            return 0;
        }
        
        if(o1.milage > o2.milage){
            return 1;
        }
        
        return -1;
    }

    @Override
    public int compareTo(Car o) {
   if(this.milage == ((Car)o).milage){
       return 0;
   }
   
   if(this.milage >  ((Car) o).milage){
        return 1;
    }
        return -1;
       
       }
    
}
