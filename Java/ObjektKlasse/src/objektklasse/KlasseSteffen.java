/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objektklasse;

/**
 *
 * @author Oliver Stabenow <starsegen1987@hotmail.de>
 */
public class KlasseSteffen {
    
    private int meinWert;
    
    public KlasseSteffen(){
        
        this.meinWert = 0;
    }
    
    public KlasseSteffen(int meinWert){
        
        this.meinWert = meinWert;
    }
    
    // da und die Ausgabe via Object.toString() missfällt, ÜBERSCHREIBEN wir sie

    @Override
    public String toString() {
        
        return "Die Klasse " + this.getClass().getSimpleName() + " sagt " + this.meinWert;
    }
    
    

}
