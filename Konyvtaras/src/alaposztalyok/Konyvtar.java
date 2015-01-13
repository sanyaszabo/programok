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
public interface Konyvtar {

    public void beiratkoz();

    public boolean kiiratkoz();

    public int getOlvasoSzam();

    public String getKonyvtarnev();

    public String getVaros();

    public int getKonyvSzam();

    public int getOsszKonyvKeret();

    public void finansziroz(int finOsszeg);

}
