/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vezerles;

import alaposztalyok.Bankkartya;
import alaposztalyok.Hitelkartya;
import alaposztalyok.Kartya;
import feluletek.BankkartyaPanel;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Sandor
 */
public class Vezerles {

    private String path = "/adatok/kartyak.txt";
    public static List<Kartya> kartyak = new ArrayList<>();

    public void start() {
        adatBeolvas();
    }

    private void adatBeolvas() {
        try (InputStream ins = this.getClass().getResourceAsStream(path);
                Scanner fScanner = new Scanner(ins)) {
            String sor;
            while (fScanner.hasNextLine()) {
                sor = fScanner.nextLine();
                if (!sor.isEmpty()) {
                    kartyaGeneral(sor);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void kartyaGeneral(String sor) {
        String[] adatok = sor.split(";");
        Kartya kartya = null;
        if (adatok.length == 2) {
            kartya = new Bankkartya(adatok[0], kartyak.size() + 1, pinkodGen(), Integer.parseInt(adatok[1]));
        } else {
            kartya = new Hitelkartya(adatok[0], kartyak.size() + 1, pinkodGen(), Integer.parseInt(adatok[1]), Integer.parseInt(adatok[2]));
        }
        kartyak.add(kartya);

    }

    public static Kartya szerzodesKotes(String tulajdonos, String kartyatipus, Integer hitelkeret) {
        Kartya kartya = null;
        int egyenleg = 0;
        switch (kartyatipus) {
            case Bankkartya.kartyatipus:
                kartya = new Bankkartya(tulajdonos, kartyak.size() + 1, pinkodGen(), egyenleg);
                break;

            case Hitelkartya.kartyatipus:
                kartya = new Hitelkartya(tulajdonos, kartyak.size() + 1, pinkodGen(), egyenleg, hitelkeret);
                break;

            default:
                throw new IllegalArgumentException("Kártyatípus nem megfelelő.");
        }

        kartyak.add(kartya);
        return kartya;
    }

    public static Kartya getKartya(int kartyaszam) {
        for (Kartya kartya : kartyak) {
            if (kartya.getKartyaszam() == kartyaszam) {
                return kartya;
            }

        }
        return null;
    }

    private static int pinkodGen() {
        int randomPIN = (int) (Math.random() * 9000) + 1000;
        return randomPIN;

    }

}
