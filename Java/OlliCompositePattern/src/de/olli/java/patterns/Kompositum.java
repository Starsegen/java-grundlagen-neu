/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.olli.java.patterns;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Oliver Stabenow <starsegen1987@hotmail.de>
 */
public class Kompositum extends AbstrakteKomponente{

    List<AbstrakteKomponente> kindKnoten = null;
    
    public Kompositum(){
        
        
        /**
         * durch den Konstruktor wird eine leere Liste die kindKnoten erzeugen
         */
        this.kindKnoten = new ArrayList<>();
    }
    
    
    /**
     * die Methode fügt neue Kindknoten hinzu
     * 
     * Kindknoten dürfen alle Objekte von Klassen sein, die von AbstraktenKomponenten
     * abgeleitet sind (Polymorphie)
     * 
     * k darf sein: DegubberEmail, DebuggerSMS, DebuggerLogfile ODER Kompositum
     * 
     * @param k 
     */
    public void hinzufuegen(AbstrakteKomponente k){
        
        this.kindKnoten.add(k);
    }
    
    
    /**
     * die Methode entfernt einen Kindknoten aus dem Kompositum
     * 
     * Todo: entfernen muss ggfs. auch die Unterknoten untersuchen
     * 
     * @param k 
     */
    public void entfernen(AbstrakteKomponente k){
       
        //fals keine Kindknoten da sind
        if(this.kindKnoten.isEmpty()){
            return;
        }
        
        this.kindKnoten.remove(k);
    }
    
    @Override
    public void methodeA() {
     
        //wir lassen **ALLE** abstrakten Komponenten die methodeA() ausführen
        //d.h.:     im Falle eines Degubbers folgt eine Ausgabe
        //          im Falle eines Kompositums lässt das dann wieder alle abstrakten
        //              die methodeA() ausführen
        for( AbstrakteKomponente k: this.kindKnoten){
            
            k.methodeA();
        }
    }
    
}
