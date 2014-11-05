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
public class Baum {
    
    public Ast wurzel;

	public Baum() {
		// Konstruktor erzeugt leeren Baum
		wurzel = null;
	}

	public void einfügen(Ast neu) {
		// fügt Knoten neu an die richtige Stelle ein

		// 1. Fall: Baum ist noch leer
		if (wurzel == null) {
			wurzel = neu;
		} else {
			// sonst rekursiv durch
			einfügen(wurzel, neu);
		}
	}

	private void einfügen(Ast spitze, Ast neu) {
		// fügt Knoten neu an die richtige Stelle unter Teilbaum spitze ein

		if (spitze.daten > neu.daten) {
			// links einfügen
			if (spitze.links == null) {
				// neu einfach anhängen
				spitze.links = neu;
			} else {
				// neu im linken Unterbaum unterbringen
				einfügen(spitze.links, neu);
			}
		} else {
			// rechts einfügen
			if (spitze.rechts == null) {
				// neu einfach anhängen
				spitze.rechts = neu;
			} else {
				// neu im rechten Unterbaum unterbringen
				einfügen(spitze.rechts, neu);
			}
		}
	}

	public String toString() {
		if (wurzel != null) {
			return toString(wurzel);
		} else {
			return "<leerer Baum>";
		}
	}

	private String toString(Ast b) {
		String s = "";

		if (b.links != null) {
			s += toString(b.links);
		}
		s += b.daten + "\n";
		if (b.rechts != null) {
			s += toString(b.rechts);
		}
		return s;
	}

    
    
}
