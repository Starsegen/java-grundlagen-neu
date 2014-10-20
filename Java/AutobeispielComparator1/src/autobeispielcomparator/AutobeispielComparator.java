/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autobeispielcomparator;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author Oliver Stabenow <starsegen1987@hotmail.de>
 */
public class AutobeispielComparator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        HoppeCar steini = new HoppeCar(0,0);
        System.out.println(steini);
    
     
        HoppeCar steve = new HoppeCar(1000,0);
        System.out.println(steve);
        
        
        TreeSet<HoppeCar> thcMileage = new TreeSet<> (new MileageComparator());
        
        thcMileage.add(new HoppeCar(0,0));
        thcMileage.add(new HoppeCar(10,40));
        thcMileage.add(new HoppeCar(20,30));
        thcMileage.add(new HoppeCar(30,20));
        thcMileage.add(new HoppeCar(40,10));
        
        for(HoppeCar hc : thcMileage){
            System.out.println(hc);
            
        }
        
        System.out.println("______Jetzt anders Rum_______");
        Iterator<HoppeCar> itHc = thcMileage.descendingIterator();
        
        while(itHc.hasNext()){
            System.out.println(itHc.next());
        }
        
        
        TreeSet<HoppeCar> thcHorsePower = new TreeSet<>(new HorsePowerComparator());
        
        thcHorsePower.add(new HoppeCar(100,500));
        thcHorsePower.add(new HoppeCar(200,400));
        thcHorsePower.add(new HoppeCar(300,300));
        thcHorsePower.add(new HoppeCar(400,200));
        thcHorsePower.add(new HoppeCar(500,100));
        
        for(HoppeCar hc : thcHorsePower){
            System.out.println(hc);
        }
        System.out.println(" Lets do this LEERRRROOOOOYYYYYYY JENNNNKKKKIIIIINNNNSSSS ");
        
        Iterator<HoppeCar> itHcA = thcHorsePower.descendingIterator();
        
        while(itHcA.hasNext()){
            System.out.println(itHcA.next());
        }
        
    }
    
    
    
}
