/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraktefabrik;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Oliver Stabenow <starsegen1987@hotmail.de>
 */
public abstract class Row {

    protected List<Cell> cells = new ArrayList<>();

    /**
     * eine Methode um beliebig viele Zellen zu einer Zeile hinzuzufügen
     *
     * @param c die hinzuzufügende Zelle
     */
    public void addCell(Cell c) {

        this.cells.add(c);

    }

    public abstract void display();
}
