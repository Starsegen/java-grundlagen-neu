/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.olli.java.patterns.bibaum;

/**
 *
 * @author Oliver Stabenow <starsegen1987@hotmail.de>
 */
public class Ast {

    public int daten;
	public Ast links;
	public Ast rechts;

	// einfacher Konstruktor
	public Ast(int n) {
		daten = n;
		// hat noch keinen linken oder rechten Partner
		links = null;
		rechts = null;
	}

	// Konstruktor mit Zielen
	public Ast(int n, Ast l, Ast r) {
		daten = n;
		links = l;
		rechts = r;
	}

    
    
}
