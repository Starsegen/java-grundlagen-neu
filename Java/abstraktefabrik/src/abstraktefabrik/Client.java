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
public class Client {

    private TableFactory factory = null;

    /**
     * Konstruktor bekommt die zu verwendende augabefabric injiziert
     *
     * @param t
     */
    public Client(TableFactory t) {

        this.factory = t;
    }

    public void showData(String[][] data) {

        // es soll eine Tabelle ausgegeben werden also brauchen wir die Tabelle
        //zum Erzeugen der Tabelle benutzen wir die abstrakten Methoden
        //der abstrakten Fabrik .. erst zur Luafzeit des Programms
        //steht fest, was es dann für eine Tabelle sein soll
        Table t = this.factory.createTable();

        // jetzr analysieren wir die übergebenen Daten des zweidimensionalen Felds
        //und erzeugen aus der 1. Dimension des Felds die Zeilen, aus der 2.Dimension
        // die Zellen der Tabelle
        for (int i = 0; i < data.length; i++) {

            Row r = this.factory.createRow();
            t.addRow(r);

            for (int j = 0; j < data[i].length; j++) {

                Cell c = this.factory.createCell(data[i][j]);
                
                r.addCell(c);

            }
        }
        
        // die Daten sind vollständig verarbeitet worden
        t.display();
    }
}
