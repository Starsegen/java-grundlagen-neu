/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.olli.java.patterns.beobachter;

/**
 *
 * @author Oliver Stabenow <starsegen1987@hotmail.de>
 */
public class IntervallInspektion implements Observer {

    private int nextInspectionAt;
    private int intervall;

    /**
     * Wir geben an, wann die erste Intervallinspektion fällig ist und
     * anschließend: in welchem km-Intervall wiederkehrend die Inspektion
     * erfolgen sollen.
     *
     *
     * @param nextInspectionAt
     * @param intervall
     */
    public IntervallInspektion(int nextInspectionAt, int intervall) {

        this.nextInspectionAt = nextInspectionAt;
        this.intervall = intervall;
    }

    @Override
    public void update(Observable o) {

        if( ((Car) o).getMileage() >= this.nextInspectionAt) {

            System.out.println("Intervallinspektion bei: " + this.nextInspectionAt + " km");
            this.nextInspectionAt += intervall;

        }
    }

}
