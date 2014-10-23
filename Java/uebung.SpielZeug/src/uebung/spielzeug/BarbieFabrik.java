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
public class BarbieFabrik extends Fabrik{

    @Override
    public Spielzeug fertigen() {
     
        return new Barbie();
    
    }
    
}
