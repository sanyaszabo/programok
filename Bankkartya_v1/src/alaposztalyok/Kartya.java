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
public interface Kartya {

    public String getKartyatipus();

    public int getKartyaszam();

    public String getTulajdonos();

    public int getEgyenleg();

    public void feltolt(int osszeg);

    public boolean vasarol(int osszeg);

}
