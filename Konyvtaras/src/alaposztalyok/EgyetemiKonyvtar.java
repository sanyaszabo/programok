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
public class EgyetemiKonyvtar extends VarosiKonyvtar implements Konyvtar {

    private final String egyetem;
    private static int fejkvotaSzorzo;

    public EgyetemiKonyvtar(String konyvtarnev, String varos, int konyvSzam, int osszKonyvKeret, String egyetem) {
        super(konyvtarnev, varos, konyvSzam, osszKonyvKeret);
        this.egyetem = egyetem;
    }

    @Override
    public String toString() {
        return getKonyvtarnev() + "," + getVaros() + "," + egyetem;
    }

    public String getEgyetem() {
        return egyetem;
    }

    public static void setFejkvotaSzorzo(int fejkvotaSzorzo) {
        EgyetemiKonyvtar.fejkvotaSzorzo = fejkvotaSzorzo;
    }

    public static int getFejkvotaSzorzo() {
        return fejkvotaSzorzo;
    }

    @Override
    public void finansziroz(int finOsszeg) {
        int konyvkeret;
        konyvkeret = getOsszKonyvKeret() + finOsszeg + (fejkvotaSzorzo * getOlvasoSzam());
        setOsszKonyvKeret(konyvkeret);
    }

}
