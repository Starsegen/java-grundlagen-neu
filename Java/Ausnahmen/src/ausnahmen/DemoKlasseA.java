/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ausnahmen;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Oliver Stabenow <starsegen1987@hotmail.de>
 */
public class DemoKlasseA {
    
    public void etwasKritisches(){
        
        // das Erzeugen eines neuen PrintWriter Objektes ist kritisch,
        //da unter Umständen die zu öffnende Datei nicht existiert
        
        PrintWriter ausgabe = null;
        
        try {
        ausgabe = new PrintWriter( new FileWriter("outfile.txt"));
        
        for(int i=0;i<10;i++){
            ausgabe.println("Das ist die Ausgabezeile" + i);
        }
        
        
        }
        
        catch( IOException e ){
            //IO-Fehler
            System.err.println(e.getMessage()); 
        }
        catch( Exception e ){
            //Allgemeine-Fehler
            System.err.println(e.getMessage());
        }
        
        finally{
            
            if(ausgabe != null ){
                ausgabe.close();
        }
        }
    }
}
