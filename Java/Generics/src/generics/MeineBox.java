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
public class MeineBox<T> 
{
    // der Typparameter wird verwendet, um den Datentyp von value noch offen zu halten
    private T value;
    
    //die Setter.Methode verwendet ebenfals den Typparameter
    public void set(T wert)
    {
        this.value = wert;
    }
    //die Getter-Methode verwendet den Typparameter für den Rückgabewert
    public T get()
    {
        return this.value;
    }
    
}
