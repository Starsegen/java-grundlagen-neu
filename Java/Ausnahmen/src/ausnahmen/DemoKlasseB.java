/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ausnahmen;

import java.io.IOException;

/**
 *
 * @author Oliver Stabenow <starsegen1987@hotmail.de>
 */
public class DemoKlasseB  {
    
    public void ichWerfeWas() throws Exception, IOException{
        
        String s = new String("Do wath you wand");
        
        if(s==null)
            throw new Exception("Ta Da");
        
        throw new IOException("Nur mal ein Test");
        
    }
    
    
    
    
    
    
    
}
