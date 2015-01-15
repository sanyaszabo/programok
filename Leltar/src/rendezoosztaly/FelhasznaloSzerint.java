/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rendezoosztaly;

import alaposztalyok.Adat;
import java.util.Comparator;

/**
 *
 * @author Sandor
 */
public class FelhasznaloSzerint implements Comparator<Adat> {

    @Override
    public int compare(Adat a, Adat a1) {
        return a.getFelhasznalo().compareTo(a1.getFelhasznalo());
    }

}
