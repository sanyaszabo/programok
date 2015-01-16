/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alaposztalyok;

import java.text.SimpleDateFormat;
import java.util.Date;

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

    public Adat() {
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

    public void setLeltariKod(int leltariKod) {
        this.leltariKod = leltariKod;
    }

    public void setEszkoz(String eszkoz) {
        this.eszkoz = eszkoz;
    }

    public void setGyarto(String gyarto) {
        this.gyarto = gyarto;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public void setGyariSzam(String gyariSzam) {
        this.gyariSzam = gyariSzam;
    }

    public void setFelhasznalo(String felhasznalo) {
        this.felhasznalo = felhasznalo;
    }

    public void setOsztaly(String osztaly) {
        this.osztaly = osztaly;
    }

    public void setEpulet(String epulet) {
        this.epulet = epulet;
    }

    public void setSzoba(String szoba) {
        this.szoba = szoba;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setAdatKezelo(String adatKezelo) {
        this.adatKezelo = adatKezelo;
    }

//    public void setDatum(String datum) {
//        this.datum = datum;
//    }
    public void setDatum(Date datum) {
        this.datum = new SimpleDateFormat("yyyy-MM-dd").format(datum);
    }

    public String getEszkoz() {
        return eszkoz;
    }

    public String getGyarto() {
        return gyarto;
    }

    public String getTipus() {
        return tipus;
    }

    public String getOsztaly() {
        return osztaly;
    }

    public String getEpulet() {
        return epulet;
    }

    public String getSzoba() {
        return szoba;
    }

    public String getStatus() {
        return status;
    }

    public String getGyariSzam() {
        return gyariSzam;
    }

    public String getAdatKezelo() {
        return adatKezelo;
    }

}
