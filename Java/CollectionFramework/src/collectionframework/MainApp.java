/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionframework;

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
        // TODO code application logic here
        
        List<Integer> intListe = new ArrayList<>();
        
        for(int i=0; i<20; i++)
        {
            intListe.add((int)  (Math.random() * 100));
        }
        
        // in einer Art foreach-Schleife wollen wir die Listenelemente ausgeben
        for( Integer element: intListe )
        {
            System.out.println(element);
        }
        
        System.out.println("Die liste ist leer:" + intListe.isEmpty() );
        
        intListe.add(10);
        System.out.println("Die Liste enthält den Wert 10: " + intListe.contains(10));
        
        System.out.println("Die Liste hat" + intListe.size() + " Zahlen");
        
        intListe.remove(0);
        
       System.out.println("Die Liste hat" + intListe.size() + " Zahlen");
       
       List<Integer> subList = intListe.subList(0,5);
       
       for(Integer element: subList)
               {
                   System.out.println(element);
               
               }
       
        
    }
    
}
