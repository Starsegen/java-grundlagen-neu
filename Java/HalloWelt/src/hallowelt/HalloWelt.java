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
public class HalloWelt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 0; i < 10; i++) {
            System.out.println("Hallo Welt!");
        }

        MeinErsteKlasse.willkommen();
        
        KlasseB kb = new KlasseB(100);
        
        kb.ausgeben();
    }

}
