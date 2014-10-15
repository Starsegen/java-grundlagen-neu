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
public class HashKlasse {
    
    @Override
    public int hashCode(){
        
        int startwert = 19;
        int faktor = 37;
        
        
        int result = faktor * startwert + this.attributA;
        
        
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
