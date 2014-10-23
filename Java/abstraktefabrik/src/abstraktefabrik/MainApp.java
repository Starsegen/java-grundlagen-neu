/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraktefabrik;

/**
 *
 * @author Oliver Stabenow <starsegen1987@hotmail.de>
 */
public class MainApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //letz test
       String[][] data = new String[8][2];
       
       data[0][0] = "1";
       data[0][1] = "Bohrfrau";
       data[1][0] = "2";
       data[1][1] = "Kocher";
       data[2][0] = "3";
       data[2][1] = "Bahr";
       data[3][0] = "4";
       data[3][1] = "Steinhagen";
       data[4][0] = "5";
       data[4][1] = "Hoppe";
       data[5][0] = "6";
       data[5][1] = "Uhlemann";
       data[6][0] = "7";
       data[6][1] = "Bertram";
       data[7][0] = "8";
       data[7][1] = "Stabenow";
       
       Client c = new Client(new HtmlTableFactory());
       
       c.showData(data);
        
    }

}
