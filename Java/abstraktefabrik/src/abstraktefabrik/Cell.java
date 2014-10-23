/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraktefabrik;

/**
 *
 * @author Oliver Stabenow <starsegen1987@hotmail.de>
 */
public abstract class Cell {

    // wir wollen Textinformationen in der Zelle speichern
    protected String content = "";

    /**
     * der Konstruktor der Klasse wird mit Parameter aufgerufen
     *
     * @param c
     */
    public Cell(String c) {

        this.content = c;

    }

    public abstract void display();
}
