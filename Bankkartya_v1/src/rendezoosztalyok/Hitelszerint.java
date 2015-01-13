/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rendezoosztalyok;

import alaposztalyok.Hitelkartya;
import java.util.Comparator;

/**
 *
 * @author Sandor
 */
public class Hitelszerint implements Comparator<Hitelkartya> {

    @Override
    public int compare(Hitelkartya k1, Hitelkartya k2) {
        final Integer k1I = k1.getHiteltartozas();
        final Integer k2I = k2.getHiteltartozas();
        return k2I.compareTo(k1I);
    }
}
