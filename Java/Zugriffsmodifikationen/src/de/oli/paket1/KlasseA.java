/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.oli.paket1;

/**
 *
 * @author Oliver Stabenow <starsegen1987@hotmail.de>
 */
public class KlasseA {
    
    static int [] zahlenFeld ={8,3,5,6,2,1,7,0,9,4};
    
    void sortieren(int [] x){
        for (int i=x.length; i>1; i--)
          {
              for (int j=0; j<i-1;j++)
             {
                  if (x[j] > x[j+1])
                 {
                      int temp =x[j];
                      x[j]=x[j+1];
                          x[j+1]= temp;
                 }
              } 
         }       
    }
}
