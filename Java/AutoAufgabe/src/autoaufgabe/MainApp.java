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
public class MainApp  extends Car{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    for(int a = 0;a < 20;a++){
     int distance = (int) ((Math.random()*500000)+1);
        System.out.println(a + "Kilometerstand" + distance);
     
        int t = (int) ((Math.random()*10));
        
        switch(t){
             
        case 0:
            Car marke[a] = new Car;
        break;    
        
        }
        
        
     
     this.startEngine();
     if(distance > 400000){
         Car this.Car = new brokenCar();
         System.out.println( a + "ist jetzt kaputt");
     }
    }
    
    
        
    
    
    }
    
}
