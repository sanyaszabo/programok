/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rendezoosztaly;

import alaposztalyok.Konyvtar;
import java.util.Comparator;

/**
 *
 * @author Sandor
 */
public class OlvasoSzerint implements Comparator<Konyvtar> {

    @Override
    public int compare(Konyvtar k1, Konyvtar k2) {
        final Integer k1I = k1.getOlvasoSzam();
        final Integer k2I = k2.getOlvasoSzam();
        return k1I.compareTo(k2I);
    }

}
