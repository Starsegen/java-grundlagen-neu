/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

/**
 *
 * @author Oliver Stabenow <starsegen1987@hotmail.de>
 */
public class EineAndereBox 
{
    /**eine generische Methode, deren Typparameter auf die Parameter der Mthode angewendet wird
    *
    * Damit wird sichergestellt, dass die beiden Parameter der Methode den gleichen generischen
    * Typ verwenden und damit die private Attribute von "MeineBox" den gleichen Datentyp besitzen
    * und vergleichbar sind
    *
    * @param <T>
    * @param mb1
    * @param mb2
    * @return
    */
    
    
    
    public static <T> boolean vergleiche(MeineBox<T> mb1, MeineBox<T> mb2)
    {
        return mb1.get().equals(mb2.get());
    }
}
