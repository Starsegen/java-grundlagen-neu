/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionmaps;

/**
 *
 * @author Oliver Stabenow <starsegen1987@hotmail.de>
 */
public class Car {
    
    private int id;
    private int mileage;
    private int horsePower;

    public Car() {
    }

    public Car(int id, int mileage, int horsePower) {
        this.id = id;
        this.mileage = mileage;
        this.horsePower = horsePower;
    }
    
    
    public int getId(){
        
        return this.id;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + this.id + " (km:" + this.mileage + " ps:" + this.horsePower + ")";
    }
    
    
    
    
}
