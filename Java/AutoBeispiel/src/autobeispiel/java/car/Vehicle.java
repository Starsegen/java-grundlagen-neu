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
public interface Vehicle {
    
    public void startEngine();
    
    public void stopEngine();
    
    public void move(int distance);    
}
