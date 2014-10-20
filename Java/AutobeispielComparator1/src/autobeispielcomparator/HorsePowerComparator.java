package autobeispielcomparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import autobeispielcomparator.HoppeCar;
import java.util.Comparator;

/**
 *
 * @author Oliver Stabenow <starsegen1987@hotmail.de>
 */
public class HorsePowerComparator implements Comparator<HoppeCar>{

    @Override
    public int compare(HoppeCar o1, HoppeCar o2) {
        return o1.getHorsePower() - o2.getHorsePower();
    }
    
}
