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
public class MainApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        
        
        Kurs k = new Kurs();
        
        
        Schueler s = new Schueler("Hoppe");
        Schueler d = new Schueler("Berti");
        Schueler f = new Schueler("Manu");
        Schueler g = new Schueler("Steini");
        
        
        k.einschreiben(s);
        k.einschreiben(d);
        k.einschreiben(f);
        k.einschreiben(g);
        
        k.auflisten();
    }
    
}
