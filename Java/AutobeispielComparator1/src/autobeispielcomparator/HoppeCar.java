package autobeispielcomparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Oliver Stabenow <starsegen1987@hotmail.de>
 */
public class HoppeCar {

    private int horsePower;
    private int mileage;

    public HoppeCar() {
        this.horsePower = 0;
        this.mileage = 0;
    }
    
    
    public HoppeCar(int horsePower, int milage) {
        this.horsePower = horsePower;
        this.mileage = milage;
    }

    @Override
    public String toString() {
       return this.getClass().getSimpleName() + " km: " + this.mileage + " ps: " + this.horsePower;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public int getMileage() {
        return mileage;
    }

    

    
    
    
}
