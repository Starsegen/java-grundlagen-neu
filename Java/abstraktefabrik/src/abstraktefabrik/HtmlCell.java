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
public class HtmlCell extends Cell{

    /**
     * der Konstruktor der Klasse reicht den Wert für den Zellinhalt direct an den
     * Konstrucktor der Cell-Klasse weiter
     * 
     * @param c 
     */
    public HtmlCell(String c) {
        super(c);
    }

    
    
    
    @Override
    public void display() {
    
        System.out.println("\t\t<td>" + this.content + "</td>");
    }
    
}
