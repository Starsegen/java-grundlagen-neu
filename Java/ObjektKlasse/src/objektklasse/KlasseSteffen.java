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

    @Override
    public boolean equals(Object obj) {
        // reflexivität
        
        if(this == obj)
            return true;
        
        //der Vergleich mit null mus FALSE liefern
        
        if(obj == null)
            return false;
        
        // Test auf Vergleichbarkeit(Objekt müssen von der gleichen Klasse sein)
        
        if(this.getClass() != obj.getClass())
            return false;
        
        //Test aller Attribute
        
        if( this.meinWert != ((KlasseSteffen)obj).meinWert )
            return false;
        
        //nach dem Test aller Attribute steht die Gleicheit fest
        return true;
    }
    
    
    
    

}
