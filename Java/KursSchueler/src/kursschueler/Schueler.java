/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kursschueler;

/**
 *
 * @author Oliver Stabenow <starsegen1987@hotmail.de>
 */
public class Schueler {

    public static int number = 0;
    public int id = 0;

    public String name;

    public Schueler(String n) {

        Schueler.number++;

        this.id = Schueler.number;
        this.name = n;

    }

    @Override
    public String toString() {
        return this.getClass() + ": " + this.id + ". " + this.name;
    }

    int getId() {

        return this.id;
    }

}
