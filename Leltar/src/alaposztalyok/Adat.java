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
public class Adat {

    private int leltariKod;
    private String eszkoz;
    private String gyarto;
    private String tipus;
    private String gyariSzam;
    private String felhasznalo;
    private String osztaly;
    private String epulet;
    private String szoba;
    private String status;
    private String adatKezelo;
    private String datum;

    public Adat(int leltariKod, String eszkoz, String gyarto, String tipus, String gyariSzam, String felhasznalo, String osztaly, String epulet, String szoba, String status, String adatKezelo, String datum) {
        this.leltariKod = leltariKod;
        this.eszkoz = eszkoz;
        this.gyarto = gyarto;
        this.tipus = tipus;
        this.gyariSzam = gyariSzam;
        this.felhasznalo = felhasznalo;
        this.osztaly = osztaly;
        this.epulet = epulet;
        this.szoba = szoba;
        this.status = status;
        this.adatKezelo = adatKezelo;
        this.datum = datum;
    }

    @Override
    public String toString() {
        return "" + leltariKod + ";" + eszkoz + ";" + gyarto + ";" + tipus + ";" + gyariSzam + ";" + felhasznalo + ";" + osztaly + ";" + epulet + ";" + szoba + ";" + status + ";" + adatKezelo + ";" + datum + ";";
    }

    public String getFelhasznalo() {
        return felhasznalo;
    }

    public String getDatum() {
        return datum;
    }

    public int getLeltariKod() {
        return leltariKod;
    }

    public String getGyariSzam() {
        return gyariSzam;
    }

    public String getAdatKezelo() {
        return adatKezelo;
    }

}
