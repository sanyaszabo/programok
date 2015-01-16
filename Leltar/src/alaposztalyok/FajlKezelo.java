/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alaposztalyok;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sandor
 */
public class FajlKezelo {

    private final static String CHAR_CODE = "UTF-8";
    private final static String path = "adat.dat"; // az adat a project mappája alatt található
    public static List<Adat> adatLista = new ArrayList<>();

    public void adatBeolvas() {
        FileInputStream ins = null;
        try {
            ins = new FileInputStream(new File(path));
            fajlbol(ins);
        } catch (FileNotFoundException ex) {
            System.err.println("A fájl nem található!");
        } finally {
            try {
                ins.close();
            } catch (IOException ex) {
                System.err.println("Nem lehet bezárni a fájlt.");
            }
        }
    }

    private void fajlbol(InputStream ins) {
        Scanner fajlScanner = new Scanner(ins, CHAR_CODE);
        String sor;
        while (fajlScanner.hasNextLine()) {
            sor = fajlScanner.nextLine();
            adatGeneral(sor);
        }
    }

    private void adatGeneral(String sor) {
        String[] adatok = sor.split(";");
        Adat adat;
        adat = new Adat(Integer.parseInt(adatok[0]), adatok[1], adatok[2], adatok[3], adatok[4], adatok[5], adatok[6], adatok[7], adatok[8], adatok[9], adatok[10], adatok[11]);
        adatLista.add(adat);
    }

    public static void fajlba() {
        PrintWriter writer = null;
        try {
            File f = new File(path);
            if (f.exists()) {
                f.delete();
            }
            writer = new PrintWriter(path, CHAR_CODE);
            for (Adat adat : adatLista) {
                writer.println(adat.toString());
            }
            writer.close();
            //TODO: Megcsinálni rendesen!!!
        } catch (FileNotFoundException ex) {
            System.err.println("A fájl nem található!");
        } catch (UnsupportedEncodingException ex) {
            System.err.println("Nem megfelelő kódolás!");
        } finally {
            writer.close();
        }
    }

    public static List<Adat> adatLeker() {
        return adatLista;
    }

    public static void adatHozzaAd(Adat adat) {
        Adat lastData = adatLista.get(adatLista.size() - 1);
        adat.setLeltariKod(lastData.getLeltariKod() + 1);
        adatLista.add(adat);
        fajlba();
    }

    public static void adatModosit(Adat adat) {
        fajlba();
    }

    public static void adatTorles(Adat adat) {
        adatLista.remove(adat);
        fajlba();
    }

    public static boolean isNew(Adat adat) {

        return !adatLista.contains(adat);
    }

}
