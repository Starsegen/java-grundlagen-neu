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
public abstract class Table {

    /**
     * eine Datenstrucktur, die die beliebig viele Zeilen einer Tabelle
     * speichert
     */
    protected List<Row> rows = new ArrayList<>();
    
    
    /**
     * die Methode fügt eine Tabellenzeile zur Tabelle hinzu
     * 
     * @param r die hinzuzufügende Zeile 
     */
    public void addRow( Row r){
        
        this.rows.add(r);
        
    }
    public abstract void display();
}
