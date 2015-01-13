/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alaposztalyok;

/**
 *
 * @author Sandor
 */
public class Konyv {

    private final String szerzo, cim;
    private final int ar;

    public Konyv(String szerzo, String cim, int ar) {
        this.szerzo = szerzo;
        this.cim = cim;
        this.ar = ar;
    }

    public String getSzerzo() {
        return szerzo;
    }

    public String getCim() {
        return cim;
    }

    public final int getAr() {
        return ar;
    }

    @Override
    public String toString() {
        return this.getSzerzo() + ", " + this.getCim() + ", " + this.getAr() + "Ft";
    }
}
