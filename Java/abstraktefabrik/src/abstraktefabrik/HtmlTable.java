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
public class HtmlTable extends Table {

    @Override
    public void display() {

        //die Startmarkierung der Tabelle
        System.out.println("<table>");

        for (Row r : this.rows) {

            r.display();
        }
        System.out.println("</table>");

    }

}
