/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alaposztalyok;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Date;
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
//        InputStream ins = this.getClass().getResourceAsStream(path);
            ins = new FileInputStream(new File(path));
            fajlbol(ins);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FajlKezelo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ins.close();
            } catch (IOException ex) {
                Logger.getLogger(FajlKezelo.class.getName()).log(Level.SEVERE, null, ex);
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

    public static void fajlba() throws IOException {
        File f = new File(path);
        if (f.exists()) {
            f.delete();
        }
        PrintWriter writer = new PrintWriter(path, CHAR_CODE);
        for (Adat adat : adatLista) {
            writer.println(adat.toString());
        }
        writer.close();
        //TODO: Megcsinálni rendesen!!!
    }

    public static List adatLeker() {
        return adatLista;
    }

    public static void adatHozzaAd(Adat adat) throws IOException {
        adatLista.add(adat);
        fajlba();
    }

    public static void adatModosit(Adat adat) throws IOException {
        int index = adatLista.indexOf(adat);
        adatLista.remove(index);
        adatLista.add(index, adat);
        fajlba();
    }

    public static void adatTorles(Adat adat) throws IOException {
        adatLista.remove(adat);
        fajlba();
    }
}
