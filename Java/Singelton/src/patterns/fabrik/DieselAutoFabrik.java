/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.fabrik;

/**
 *
 * @author Oliver Stabenow <starsegen1987@hotmail.de>
 */
public class DieselAutoFabrik extends Fabrik{

    @Override
    public Fahrzeug erzeuge() {
    
        return new DieselAuto();
    
    }
    
}
