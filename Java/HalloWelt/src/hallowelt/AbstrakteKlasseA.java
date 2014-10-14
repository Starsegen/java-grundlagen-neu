/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hallowelt;

/**
 *
 * @author platz
 */
public abstract class AbstrakteKlasseA {
    
    protected int deineZahl;
    
    public AbstrakteKlasseA(int deineZahl){
        this.deineZahl = deineZahl;
    }
    
    abstract void ausgeben();
    
}
