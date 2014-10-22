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
public class MainApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    
         KlasseC c = new KlasseC();
    
         c.setLink(new KlasseD());
         c.setLink(new KlasseD());
         c.setLink(new KlasseD());
         c.setLink(new KlasseD());
         c.setLink(new KlasseD());
    
    
          for(KlasseD objD : c.getAllLinks()){
        
                 System.out.println(objD);
        }
    
    }   
}
