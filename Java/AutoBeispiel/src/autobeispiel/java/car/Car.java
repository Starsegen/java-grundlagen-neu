/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autobeispiel.java.car;

/**
 *
 * @author Oliver Stabenow <starsegen1987@hotmail.de>
 */
public class Car implements Vehicle {
    
    private boolean engineStatus;
    private int milage;
    
    public Car(){
        
        this.engineStatus=false;
        this.milage=0;
        
    }
    
    public Car(boolean engineStatus, int milage){
        
        this.engineStatus=false;
        this.milage=milage;
        
    }
    
    

    @Override
    public void startEngine() {
   this.engineStatus=true;
           }

    @Override
    public void stopEngine() {
    this.engineStatus=false;
    }

    @Override
    public void move(int distance) {
        if(!this.engineStatus){
            this.engineStatus=true;
        }
        
        // ungültige Werte abfangen
        if(distance < 0){
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
        if(this == obj ){
            return true;
        }
        
        //mit NIchts vergleichen muss immer False ergeben
        if(obj == null){
            return false;
        }
        
        //Prüfen auf Vergleichbarkeit
        if(this.getClass() != obj.getClass()){
            return false;
        }
        
        // prüfen aller AAttribute auf gleichwertigkeit
        if(this.milage != ((Car) obj).milage){
            return false;
        }
        
        return true;
    }

    @Override
    public int hashCode() {
        
        //int-Werte direkt verarbeiten
        int result = 37 * 19 + this.milage;
        
        
        //ggfs. negative Zahlen ausmaskieren 
        return result & 0x7fffffff;
    }   
}
