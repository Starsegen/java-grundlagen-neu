/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kursschueler;

import java.util.TreeMap;

/**
 *
 * @author Oliver Stabenow <starsegen1987@hotmail.de>
 */
public class Kurs {
    
    private TreeMap<Integer, Schueler> teilnehmer;
    
    public Kurs() {
        teilnehmer = new TreeMap<>();
    }

    /**
     * Ein Schüler schreibt sich ein
     *
     * @param s
     */
    public void einschreiben(Schueler s) {
        this.teilnehmer.put(s.getId(), s);
        
    }    
    
    public void ausschreiben(Schueler s) {
        
        this.teilnehmer.remove(s.getId());
    }
    
    public void auflisten() {
        
        for (Integer a : teilnehmer.keySet()) {
            
            System.out.println(a + " " + this.teilnehmer.get(a));
        }
    }
}
