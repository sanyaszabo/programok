/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alaposztalyok;

import alaposztalyok.Adat;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Date;

/**
 *
 * @author Sandor
 */
public class FajlKezelo {

    private String path = "/adatok/adat.dat";
    private static List<Adat> adatLista = new ArrayList<>();

    private void adatBeolvas() {
        try (InputStream ins = this.getClass().getResourceAsStream(path);
                Scanner fScanner = new Scanner(ins)) {
            String sor;
            while (fScanner.hasNextLine()) {
                sor = fScanner.nextLine();
                if (!sor.isEmpty()) {
                    adatGeneral(sor);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void adatGeneral(String sor) {
        String[] adatok = sor.split(";");
        Adat adat;
        adat = new Adat(Integer.parseInt(adatok[0]), adatok[1], adatok[2], adatok[3], adatok[4], adatok[5], adatok[6], adatok[7], adatok[8], adatok[9], adatok[10]);
        adatLista.add(adat);
    }

    public void listaFrissites() {

    }

}
