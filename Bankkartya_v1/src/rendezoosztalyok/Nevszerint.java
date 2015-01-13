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
public class Nevszerint implements Comparator<Kartya> {

    @Override
    public int compare(Kartya k, Kartya k1) {
        return ((Kartya) k).getTulajdonos().compareTo(((Kartya) k1).getTulajdonos());
    }

}
