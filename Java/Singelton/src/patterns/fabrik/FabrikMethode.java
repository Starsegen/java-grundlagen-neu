/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.fabrik;

/**
 *
 * @author Oliver Stabenow <starsegen1987@hotmail.de>
 */
public class FabrikMethode {
    
    public Fahrzeug erzeuge(String art){
        
        Fahrzeug fzg= null;
        switch(art){
            
            case "solar":
                fzg = new SolarAuto();
                break;
                
            case"diesel":
                fzg = new DieselAuto();
                break;
            
            case "tret":
                fzg = new TretAuto();
                break;
        }
        return fzg;
    }
    
    
}
