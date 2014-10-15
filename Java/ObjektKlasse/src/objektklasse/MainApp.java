/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objektklasse;

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

        int x = 100;

        Integer objInt = new Integer(200);

        // hier wird der primitive Datentyp in einem Zeichenkontext
        // verwendet und dessen wert muss als Zeichenkette bereitgestellt
        //werden -> int wird geboxt zu Integer (Klasse)
        //für die Klasse Integer kann die Methode toString() aufgerufen werden
        //-> wird der wert des primitiven Datentyps nicht mehr als Zeichenketten
        //benötigt, dann wird automatisch "zurück" geboxt
        //Autoboxing "Alles ist ein Objekt, aber nur wenn es inbedingt sein muss"
        System.out.println("Der Wert von x = " + x);

        System.out.println("Der Wert bon objInt = " + objInt);

        KlasseSteffen ks = new KlasseSteffen(200);

        System.out.println(ks);

        //_______________________________________________________
        int y = 100;

        if (x == y) {
            System.out.println("De Werte sind gleich");
        } else {
            System.out.println("die Werte sind ungleich");
        }

        String s1 = new String("Hallo Welt!");
        String s2 = new String("Hallo Welt!");

        if (s1 == s2) {
            System.out.println("Die Werte sind gleich");
        } else {
            System.out.println("Die Werte sind ungleich");
        }

        if (s1.equals(s2)) {
            System.out.println("De Werte sind gleich");
        } else {
            System.out.println("die Werte sind ungleich");
        }

        String meiner = "Hallo Welt!";

        StringBuffer sb1 = new StringBuffer(meiner);
        StringBuffer sb2 = new StringBuffer(meiner);

        if (sb1.equals(sb2)) {
            System.out.println("De Werte sind gleich");
        } else {
            System.out.println("die Werte sind ungleich");
        }

        KlasseSteffen ks1 = new KlasseSteffen(1000);
        KlasseSteffen ks2 = new KlasseSteffen(1000);
        KlasseSteffen ks3 = new KlasseSteffen(1000);

        if (ks1 == ks2) {
            System.out.println("Die Werte sind gleich");
        } else {
            System.out.println("Die Werte sind ungleich");
        }

        if (ks1.equals(ks2)) {
            System.out.println("De Werte sind gleich");
        } else {
            System.out.println("die Werte sind ungleich");
        }
        
        if (ks1.equals(ks3)) {
            System.out.println("De Werte sind gleich");
        } else {
            System.out.println("die Werte sind ungleich");
        }
        
        if (ks2.equals(ks3)) {
            System.out.println("De Werte sind gleich");
        } else {
            System.out.println("die Werte sind ungleich");
        }

    }
    
    
    
}
