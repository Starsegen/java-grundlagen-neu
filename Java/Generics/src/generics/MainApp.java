/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

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
        
        
        //die generische Klasse MeineBox wird als RAW-Type verwendet
        // RAW-Type: wir lassen den Typ-Parameter bei der Instanziirung weg
        MeineBox mb = new MeineBox();
        
        mb.set( 100 );
        
        System.out.println(mb.get());
        
        mb.set("Halloo");
        
        System.out.println(mb.get());
        
        
        // die generische Klasse MeineBox wid mit Typparameter verwendet
        
        MeineBox<String> mbString = new MeineBox<String>();
        
        mbString.set("Hallo");
        System.out.println(mbString.get());
        
        
        
        // mbString.set(100); 
        //führt zu einem Fehler, da die mbString-Box nur noch Zeichenketten akzeptiert
        // System.out.println(mbString.get());
        
        //seit Java 7 ist es möglich, den Diamond-Operator zu verwenden
        //der Diamond-Operator erlaubt es, den Typ-Parameter beim Aufruf des Konstrucktors wegzulassen 
        MeineBox<Integer> mbInt = new MeineBox<>();
        
        //Stolperstein beim Mischen von Instanzen mit Typ-Parameter und RAW-ype-Verwendungen
        MeineBox rawBox = mbInt;    // ok
        
        MeineBox mbA = new MeineBox();
        MeineBox<Integer> mbIntA = mbA;
        
        mbA.set(100);
        mbA.set("Hallo");
        
        
        //Test der statischen Vergleichsmethode
        
        MeineBox<Integer> mBoxA = new MeineBox<>();
        MeineBox<Integer> mBoxB = new MeineBox<>();
        MeineBox<String> mBoxC = new MeineBox<>();
        
        mBoxA.set(100);
        mBoxB.set(100);
        mBoxC.set("100");
        
        //.. alles bestens, weil der <Integer>-Parameter mit den Typ-Parametern von mBoxA und B übereinstimmen
        System.out.println(EineAndereBox.<Integer>vergleiche(mBoxA, mBoxB));
        
        // geht net weil BoxC ist String
        // System.out.println(EineAndereBox.<Integer>vergleiche(mBoxB, mBoxC));
        
        
        
        NochEineAndereBox<Integer> neabi = new NochEineAndereBox<>();
        
        NochEineAndereBox<Byte> neabb = new NochEineAndereBox<>();
        
        
       //das funktioniert nicht, weil String nix Zahl 
      //  NochEineAndereBox<String> neabs = new NochEineAndereBox<>();
        
        
        neabi.set(new Integer(10));
        neabb.set( new Byte("10"));
        
        neabi.untersuche(new Integer(2000));
        neabb.untersuche(new Byte("20"));
        
        
    }
    
    
}
