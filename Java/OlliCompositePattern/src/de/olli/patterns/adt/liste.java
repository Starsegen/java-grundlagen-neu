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
public class liste {

    element startElem = new element("Kopf");

    public liste() {
    }

    public void addLast(Object o) {
        element newElem = new element(o);
        element lastElem = getLastElem();
        lastElem.setNextElem(newElem);
    }

    public void insertAfter(Object prevItem, Object newItem) {
        element newElem, nextElem, pointerElem;
        pointerElem = startElem.getNextElem();
        while (pointerElem != null && !pointerElem.getObj().equals(prevItem)) {
            pointerElem = pointerElem.getNextElem();
        }
        newElem = new element(newItem);
        nextElem = pointerElem.getNextElem();
        pointerElem.setNextElem(newElem);
        newElem.setNextElem(nextElem);
    }

    public void delete(Object o) {
        element le = startElem;
        while (le.getNextElem() != null && !le.getObj().equals(o)) {
            if (le.getNextElem().getObj().equals(o)) {
                if (le.getNextElem().getNextElem() != null) {
                    le.setNextElem(le.getNextElem().getNextElem());
                } else {
                    le.setNextElem(null);
                    break;
                }
            }
            le = le.getNextElem();
        }
    }

    public boolean find(Object o) {
        element le = startElem;
        while (le != null) {
            if (le.getObj().equals(o)) {
                return true;
            }
            le = le.nextElem;
        }
        return false;
    }

    public element getFirstElem() {
        return startElem;
    }

    public element getLastElem() {
        element le = startElem;
        while (le.getNextElem() != null) {
            le = le.getNextElem();
        }
        return le;
    }

    public void writeList() {
        element le = startElem;
        while (le != null) {
            System.out.println(le.getObj());
            le = le.getNextElem();
        }
    }

}
