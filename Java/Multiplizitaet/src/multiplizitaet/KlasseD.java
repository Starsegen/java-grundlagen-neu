/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplizitaet;

/**
 *
 * @author Oliver Stabenow <starsegen1987@hotmail.de>
 */
public class KlasseD {

    private static int nummer;
    private int id;

    public KlasseD() {
        this.id = KlasseD.nummer;
        KlasseD.nummer++;
    }

    @Override
    public String toString() {
        return this.getClass() + ": " + this.id;

    }

}
