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
    private static int konyvKeret;

    public VarosiKonyvtar(String konyvtarnev, String varos, int olvasoSzam, int konyvSzam, int konyvKeret) {
        this.konyvtarnev = konyvtarnev;
        this.varos = varos;
        this.olvasoSzam = olvasoSzam;
        this.konyvSzam = konyvSzam;
        this.konyvKeret = konyvKeret;
    }

    public static void setKonyvKeret(int konyvKeret) {
        VarosiKonyvtar.konyvKeret = konyvKeret;
    }

    public static int getKonyvKeret() {
        return konyvKeret;
    }

    public void finansziroz() {

    }

    public void vasarol() {

    }

    public void beiratkoz() {
        olvasoSzam = olvasoSzam + 1;
    }

    public void kiiratkoz() {
        olvasoSzam = olvasoSzam - 1;
    }
}
