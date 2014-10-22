/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.uebung.wohnung;

/**
 *
 * @author Oliver Stabenow <starsegen1987@hotmail.de>
 */
public class KlasseA {
    
    private KlasseB b = null;
    
    
    /**
     * stellt die Beziehung zum Objekt der KlasseB her und
     * fordert das Objekt derr KlasseB auf, eine Beziehung
     * zum sich (this) herzustellen
     * 
     * @param objB
     * 
    */
    public void setLink( KlasseB objB){
        
        
        
        if(b == null){
            this.b = objB;
            b.setLink(this);
        }
        
        
        
    }
    
}
