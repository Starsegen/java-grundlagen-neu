/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eigeneausnahmeklasse;

/**
 *
 * @author Oliver Stabenow <starsegen1987@hotmail.de>
 */
public class MainApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
        try
        {
            if(!true)
                throw new NoDataFoundException("keine daten gefunden");
            else
                throw new FileNotFoundException("datei xyz nicht gefunden");
        }
        catch( NoDataFoundException e)
        {
        }
        catch(FileNotFoundException e)
        {
        }
        catch( Exception e )
        {
        }
    }
    
}
