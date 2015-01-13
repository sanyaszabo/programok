/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rendezoosztalyok;

import alaposztalyok.Kartya;
import java.util.Comparator;

/**
 *
 * @author Sandor
 */
public class Egyenlegszerint implements Comparator<Kartya> {

    @Override
    public int compare(Kartya k1, Kartya k2) {
        final Integer k1I = k1.getEgyenleg();
        final Integer k2I = k2.getEgyenleg();
        return k1I.compareTo(k2I);
    }
}
