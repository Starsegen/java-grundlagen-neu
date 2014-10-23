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
public class FabrikMethode {
    
    public Spielzeug fertigen(String art){
        
        Spielzeug s= null;
        switch(art){
            
            case "barbie":
                s = new Barbie();
                break;
                
            case"brummbaer":
                s = new Brummbaer();
                break;
            
            case "brummkreisel":
                s = new Brummkreisel();
                break;
                
            case "pistole":
                s = new Pistole();
                break;
        }
        return s;
    }
    
    
}
