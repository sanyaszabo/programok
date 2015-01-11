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

    public EgyetemiKonyvtar(String konyvtarnev, String varos, int olvasoSzam, int konyvSzam, int konyvKeret, String egyetem, int fejkvota) {
        super(konyvtarnev, varos, olvasoSzam, konyvSzam, konyvKeret);
        this.egyetem = egyetem;
        this.fejkvotaSzorzo = fejkvotaSzorzo;
    }

    public static void setFejkvotaSzorzo(int fejkvotaSzorzo) {
        EgyetemiKonyvtar.fejkvotaSzorzo = fejkvotaSzorzo;
    }

    public static int getFejkvotaSzorzo() {
        return fejkvotaSzorzo;
    }

}
