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
public class Hitelkartya extends Bankkartya implements Kartya {

    public static final String kartyatipus = "hitelkártya";
    private int hitelkeret;
    int hiteltartozas;

    public Hitelkartya(String tulajdonos, int kartyaszam, int pinkod, int egyenleg, int hitelkeret) {
        super(tulajdonos, kartyaszam, pinkod, egyenleg);
        this.hitelkeret = hitelkeret;
    }

    @Override
    public boolean vasarol(int osszeg) {
        if (osszeg > LIMIT || (osszeg > egyenleg + hitelkeret - hiteltartozas)) {
            return false;
        }
        if (egyenleg<osszeg){
            hiteltartozas+=-1*(egyenleg-osszeg);
            egyenleg=0;
        }else{
            egyenleg -= osszeg;
        }
        return true;
        
    }

    @Override
    public void feltolt(int osszeg) {
        if (hiteltartozas > 0 && hiteltartozas <= osszeg) {
            osszeg -= hiteltartozas;
            hiteltartozas = 0;
        } else if (hiteltartozas > 0 && hiteltartozas >= osszeg) {
            hiteltartozas -= osszeg;
            osszeg = 0;
        }
        super.feltolt(osszeg);
    }

    public boolean setHitelkeret(int hitelkeret) {
        if (hiteltartozas >= hitelkeret) {
            return false;
        }
        this.hitelkeret = hitelkeret;
        return true;
    }

    @Override
    public String getKartyatipus() {
        return kartyatipus;
    }

    @Override
    public int getHitelkeret() {
        return hitelkeret;
    }

    @Override
    public int getHiteltartozas() {
        return hiteltartozas;
    }
    
    

}
