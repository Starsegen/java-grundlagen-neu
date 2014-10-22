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
public class KlasseB {
    
    
    private KlasseA a = null;

    
    /**
     * stellt die Beziehung zum Objekt der KlasseA her
     * und fordert das Objekt der KlasseA auf, sich selbst
     * 
     * @param objA 
     */
    
    public void setLink(KlasseA objA) {
    
        
        
        if(a == null){
            this.a = objA;
            a.setLink(this);
        }
        
        
    }
}
