/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autobeispiel.java.car;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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

    }

}
