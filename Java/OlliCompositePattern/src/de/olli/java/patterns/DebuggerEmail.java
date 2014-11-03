/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.olli.java.patterns;

public class DebuggerEmail extends AbstrakteKomponente{

    @Override
    public void methodeA() {
    
        // hier "versenden" wir dann die Email
        System.out.println("Email an den Chef von:  " + this.getClass().getSimpleName());
    }
    
}
