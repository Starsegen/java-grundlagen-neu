/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singelton;

/**
 *
 * @author Oliver Stabenow <starsegen1987@hotmail.de>
 */
public class Singleton {
    
    private static Singleton instance = null;
    
    private Singleton(){
        
        
        
    }
    /**
     * Die Kopiermethode wird geschützt
     * 
     * @return 
     */
    @Override
    protected Object clone()throws CloneNotSupportedException {
        
        return new CloneNotSupportedException();
    }
    
    public static Singleton getInstance(){
       
        if(instance == null)
            instance = new Singleton();
        return instance;
    
    
    }
    
    
}
