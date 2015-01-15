/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alaposztalyok;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Date;

/**
 *
 * @author Sandor
 */
public class FajlKezelo {

    private final static String CHAR_CODE = "UTF-8";
    private final static String path = "/adatok/adat.dat";
    public static List<Adat> adatLista = new ArrayList<>();

    public void adatBeolvas() {
        InputStream ins = this.getClass().getResourceAsStream(path);
        fajlbol(ins);
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

    public void fajlba() throws IOException {
        File f = new File(path);
        while (f.exists()) {
            f.delete();
        }
        FileWriter writer = new FileWriter(path);
        for (Adat adat : adatLista) {
            writer.write(adat.toString());
        }
        writer.close();
        //TODO: Megcsinálni rendesen!!!
    }

    public static List listaLeker() {
        return adatLista;
    }

}
