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
public class Car implements Vehicle{
    
    public int distance = (int) ((Math.random()*500000)+1);
    
    public boolean broken = false;
    

    
    
    @Override
    public void startEngine(){
    
        if(distance > 400000 ){
            stopEngine();
           
                    
        }
        
    
    }
    
    @Override
    public void stopEngine(){
    
    
    
    
    }
    
    
    @Override
    public void move (int distance ){
    
      
    
     System.out.println("Distanz ist" + distance);    
    
    }

    

    
    
    
}
