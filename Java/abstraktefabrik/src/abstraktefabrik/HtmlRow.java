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
public class HtmlRow extends Row {

    @Override
    public void display() {

        System.out.println("\t<tr>");

        for (Cell c : this.cells) {

            c.display();
        }

        System.out.println("\t</tr>");
    }

}
