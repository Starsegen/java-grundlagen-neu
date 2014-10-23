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
public abstract class TableFactory {
    
    // hier werden die Erzeugungsmethoden für die Objekte der Objektfamilien
    //deklariert
    
    //eine Methode zum Erzeugen von Tabellen
    public abstract Table createTable();
    
    //eine Methode zum Erzeugen von Zeilen
    public abstract Row createRow();
    
    //eine Methode zum Erzeugen von Zellen
    public abstract Cell createCell(String c);
}
