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
public class Bankkartya implements Kartya {

    public static final String kartyatipus = "bankkártya";
    private final String tulajdonos;
    private final int kartyaszam;
    private int pinkod;
    protected int egyenleg;
    protected static int LIMIT;

    public Bankkartya(String tulajdonos, int kartyaszam, int pinkod, int egyenleg) {
        this.tulajdonos = tulajdonos;
        this.kartyaszam = kartyaszam;
        this.pinkod = pinkod;
        this.egyenleg = egyenleg;
    }

    public static void setLIMIT(int LIMIT) {
        Bankkartya.LIMIT = LIMIT;
    }

    @Override
    public void feltolt(int osszeg) {
        egyenleg += osszeg;
    }

    @Override
    public boolean vasarol(int osszeg) {
        if (osszeg > egyenleg || osszeg > LIMIT) {
            return false;
        }
        egyenleg -= osszeg;
        return true;
    }

    @Override
    public String toString() {
        return "Tulajdonos= " + tulajdonos + ", kartyaszam=" + kartyaszam + ", pinkod=" + pinkod + ", egyenleg=" + egyenleg + " vasarlasi limit= " + LIMIT;
    }

    @Override
    public int getKartyaszam() {
        return kartyaszam;
    }

    @Override
    public String getKartyatipus() {
        return kartyatipus;
    }

    @Override
    public String getTulajdonos() {
        return tulajdonos;
    }

    @Override
    public int getEgyenleg() {
        return egyenleg;
    }

}
