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
public class VarosiKonyvtar implements Konyvtar {

    private final String konyvtarnev;
    private final String varos;
    private int olvasoSzam;
    private int konyvSzam;
    private static int defaultKonyvKeret;
    private int osszKonyvKeret;

    public VarosiKonyvtar(String konyvtarnev, String varos, int konyvSzam, int osszKonyvKeret) {
        this.konyvtarnev = konyvtarnev;
        this.varos = varos;
        this.konyvSzam = konyvSzam;
        this.osszKonyvKeret = osszKonyvKeret;
    }

    @Override
    public String getKonyvtarnev() {
        return konyvtarnev;
    }

    @Override
    public String getVaros() {
        return varos;
    }

    @Override
    public int getKonyvSzam() {
        return konyvSzam;
    }

    public static void setDefaultKonyvKeret(int defaultKonyvKeret) {
        VarosiKonyvtar.defaultKonyvKeret = defaultKonyvKeret;
    }

    @Override
    public String toString() {
        return "" + konyvtarnev + "," + varos + "";
    }

    @Override
    public int getOsszKonyvKeret() {
        return osszKonyvKeret;
    }

    public void setOsszKonyvKeret(int osszKonyvKeret) {
        this.osszKonyvKeret = osszKonyvKeret;
    }

    @Override
    public int getOlvasoSzam() {
        return olvasoSzam;
    }

    public static int getDefaultKonyvKeret() {
        return defaultKonyvKeret;
    }

    @Override
    public void finansziroz(int finOsszeg) {
        osszKonyvKeret = osszKonyvKeret + finOsszeg;
    }

    public void vasarol() {

    }

    @Override
    public void beiratkoz() {
        olvasoSzam = olvasoSzam + 1;
    }

    @Override
    public boolean kiiratkoz() {
        if (olvasoSzam <= 0) {
            return false;
        }
        olvasoSzam = olvasoSzam - 1;
        return true;
    }

}
