/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autoaufgabe;

/**
 *
 * @author Oliver Stabenow <starsegen1987@hotmail.de>
 */
public class brokenCar extends Car{

    @Override
    public void startEngine() {
        
        System.out.println("geht nicht bin kaputt");
        stopEngine();
    }
    
    
    
    
}
