/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singelton;

import patterns.fabrik.*;

/**
 *
 * @author Oliver Stabenow <starsegen1987@hotmail.de>
 */
public class MainApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Singleton s =  Singleton.getInstance();
        Singleton b =  Singleton.getInstance();
        
        
        // wir bauen ganz viele Autos
        
        Fabrik f = new TretAutoFabrik();
        
        Fahrzeug fzg = f.erzeuge();
        
        fzg.move();
        
        
        
        // NIX MACHEN DAS DA
        // konkrete Fabrik
        DieselAutoFabrik sf = new DieselAutoFabrik();
        
        DieselAuto sFzg = (DieselAuto)sf.erzeuge();
        
        sFzg.move();
        
        //die FabrikMethode
        
        
        FabrikMethode fm = new FabrikMethode();
        
        
        fzg= fm.erzeuge("solar");
        
        fzg.move();
        
        
    }
    
}
