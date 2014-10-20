/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autobeispiel.java.car;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Oliver Stabenow <starsegen1987@hotmail.de>
 */
public class MainApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<Car> carList = new ArrayList<>();
        
        
        // wir erzeugen einige Autos
        for(int i=0;i<20;i++){
            
            carList.add(new Car((i%2==0),i*100));
            
        }
          
        // wir lassen alle Autos ausgeben
        for( Car a: carList){
            System.out.println( a );
        }
        
    }
    
}
