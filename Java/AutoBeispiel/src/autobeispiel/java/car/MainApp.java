/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autobeispiel.java.car;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.logging.Logger;

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
        for (int i = 0; i < 20; i++) {

            carList.add(new Car((i % 2 == 0), i * 100));

        }

        // wir lassen alle Autos ausgeben
        for (Car a : carList) {
            System.out.println(a);
        }

        HashSet<Car> hashCar = new HashSet<>();

        hashCar.add(new Car(true, 0));
        hashCar.add(new Car(true, 0));

        hashCar.add(new Car(true, 1000));
        hashCar.add(new Car(false, 1000));

        System.out.println("im HashSet sind " + hashCar.size() + " Einträge");

        //Testen eines Strin-HashSet
        HashSet<String> hashString = new HashSet<>();

        hashString.add("Juten Tach");
        hashString.add("Binjure");
        hashString.add("Konishiwa");
        hashString.add("Servus");

        for (String s : hashString) {
            System.out.println(s + " HashCode: " + s.hashCode());

        }

        
        // wir setzen auf sortierte Kollektionen,TreeSet
        
        TreeSet<Integer> treeInt = new TreeSet<>();
        
        treeInt.add( 1000 );
        treeInt.add( 500 );
        treeInt.add( 250 );
        treeInt.add( 750 );
        treeInt.add( 875 );
        treeInt.add( 225 );
        
        for(Integer i: treeInt){
            
            System.out.println(i);
        }
        
        
        
        TreeSet<String> treeString = new TreeSet<>();
        
        treeString.add( "Georg" );
        treeString.add( "Anton" );
        treeString.add( "Zylinder" );
        treeString.add( "Paula" );
        treeString.add( "Berta" );
        treeString.add( "Cäsar" );
        treeString.add( "Ludwig" );
        treeString.add( "Aal" );
        
        for(String s: treeString){
            
            System.out.println(s);
        }
        
        TreeSet<Car> treeCar = new TreeSet<>();
        
        treeCar.add(new Car(true,500));
        treeCar.add(new Car(true,700));
        treeCar.add(new Car(true,400));
        treeCar.add(new Car(true,8000));
        treeCar.add(new Car(true,70000));
        
        for(Car c: treeCar){
            
            System.out.println(c);
        }
        
        
    }
    
    

}
