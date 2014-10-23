/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uebung.spielzeug;

/**
 *
 * @author Oliver Stabenow <starsegen1987@hotmail.de>
 */
public class MainApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        
        Fabrik f = new BarbieFabrik();
        
        Spielzeug sp = f.fertigen();
        
        sp.spielen();
        
        
        
        FabrikMethode fm = new FabrikMethode();
        
        
        sp= fm.fertigen("pistole");
        
        sp.spielen();
        
        
        
        
    }
    
}
