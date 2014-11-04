/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.olli.patterns.adt;

/**
 *
 * @author Oliver Stabenow <starsegen1987@hotmail.de>
 */
public class element {

    Object obj; 

    element nextElem; 

    public element(Object obj) { 
        this.obj = obj; 
        nextElem = null; 
    } 

    public void setNextElem(element nextElem) { 
        this.nextElem = nextElem; 
    } 

    public element getNextElem() { 
        return nextElem; 
    } 

    public Object getObj() { 
        return obj; 
    } 

}
