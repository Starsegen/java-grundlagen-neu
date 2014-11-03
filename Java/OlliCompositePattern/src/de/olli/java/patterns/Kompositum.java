/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.olli.java.patterns;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Oliver Stabenow <starsegen1987@hotmail.de>
 */
public class Kompositum extends AbstrakteKomponente {

    Map<Integer, AbstrakteKomponente> kindKnoten = null;
    

    public Kompositum() {

        /**
         * durch den Konstruktor wird eine leere Liste die kindKnoten erzeugen
         */
        this.kindKnoten = new TreeMap<>();
    }

    /**
     * die Methode fügt neue Kindknoten hinzu
     *
     * Kindknoten dürfen alle Objekte von Klassen sein, die von
     * AbstraktenKomponenten abgeleitet sind (Polymorphie)
     *
     * k darf sein: DegubberEmail, DebuggerSMS, DebuggerLogfile ODER Kompositum
     *
     * @param i
     * @param k
     */
    public void hinzufuegen(int i, AbstrakteKomponente k) {

        this.kindKnoten.put(i, k);
    }

    /**
     * die Methode entfernt einen Kindknoten aus dem Kompositum
     *
     * Todo: entfernen muss ggfs. auch die Unterknoten untersuchen
     *
     * @param key
     * @return 
     */
    public boolean entfernen(Integer key) {

        //fals keine Kindknoten da sind
        if (this.kindKnoten.containsKey(key)) {
            this.kindKnoten.remove(key);
            return true;
        } else {
            Set<Integer> keySet = this.kindKnoten.keySet();

            for (Integer i : keySet) {
                if (this.getClass() == this.kindKnoten.get(i).getClass()) {

                    Kompositum k = (Kompositum) this.kindKnoten.get(i);

                    if (k.entfernen(key)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    @Override
    public void methodeA() {
        Set<Integer> keySet = this.kindKnoten.keySet();
        //wir lassen **ALLE** abstrakten Komponenten die methodeA() ausführen
        //d.h.:     im Falle eines Degubbers folgt eine Ausgabe
        //          im Falle eines Kompositums lässt das dann wieder alle abstrakten
        //              die methodeA() ausführen
        for (Integer i : keySet) {

            this.kindKnoten.get(i).methodeA();
        }

    }
}
