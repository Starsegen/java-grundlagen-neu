/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.olli.java.patterns;

import de.olli.java.patterns.*;
import de.olli.java.patterns.beobachter.Car;
import de.olli.java.patterns.beobachter.Erstinspektion;
import de.olli.java.patterns.beobachter.IntervallInspektion;
import de.olli.java.patterns.bibaum.*;
import de.olli.patterns.adt.liste;
import java.io.IOException;
import java.util.Stack;
import static jdk.nashorn.internal.objects.NativeArray.push;

/**
 *
 * @author Oliver Stabenow <starsegen1987@hotmail.de>
 */
public class composite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        Kompositum k = new Kompositum();
//
//        Kompositum k2 = new Kompositum();
//
//        // fügen einen DebuggerLogfile hinzu
//        k2.hinzufuegen(21, new DebuggerLogfile("a.txt"));
//        k2.hinzufuegen(22, new DebuggerLogfile("b.txt"));
//
//        k.hinzufuegen(2, k2);
//
//        Kompositum k3 = new Kompositum();
//
//        k3.hinzufuegen(31, new DebuggerEmail());
//        k3.hinzufuegen(32, new DebuggerSMS());
//
//        k2.hinzufuegen(3, k3);
//
//        // fügen einen DebuggerEmail hinzu
//        k.hinzufuegen(11, new DebuggerEmail());
//
//        // fügen einen DebuggerSMS hinzu
//        k.hinzufuegen(12, new DebuggerSMS());
//
//        k.entfernen(32);
//        //das "zusammengesetzte Debugger-Objekt betrachten wir nun im Ganzen
//
//        k.methodeA();
        
        
        /**
         * Test unserer Oberserver.Patterns
         *
         */
        Car auto = new Car("BMW", "rot", 250);

        auto.attach(new Erstinspektion());
        auto.attach(new IntervallInspektion(3500, 2500));

        auto.moveForward(1200);
        auto.moveForward(3800);
        auto.moveForward(5000);
        auto.moveForward(5000);
        auto.moveForward(5000);
        

        
        
        
        int[] anzahl = { 200, 100, 750, 150, 225, 42 };

		// starte mit leerem Baum
		Baum sortierBaum = new Baum();

		// fülle den Baum mit dem int-Array anzahl
		for (int i = 0; i < anzahl.length; i++) {
			Ast neu = new Ast(anzahl[i]);
			sortierBaum.einfügen(neu);
		}

		// gib den Baum aus
		System.out.println(sortierBaum);
	}
    }


