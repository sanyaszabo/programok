/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feluletek;

import alaposztalyok.Kartya;
import bankkartyas.Vezerles;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Sandor
 */
public class Feltoltes extends JPanel {

    private final JTextField kartyaszam;
    private final JTextField feltoltOsszeg;

    public Feltoltes() {
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        c.gridx = 0;
        c.gridy = 0;
        add(new JLabel("Kártyaszám"), c);

        c.gridy = 1;
        kartyaszam = new JTextField(10);
        add(kartyaszam, c);

        c.gridx = 1;
        c.gridy = 0;
        add(new JLabel("Feltölteni kívánt összeg"), c);

        c.gridy = 1;
        feltoltOsszeg = new JTextField(10);
        add(feltoltOsszeg, c);

        c.gridx = 0;
        c.gridy = 2;
        final JButton feltoltesButton = new JButton("Feltöltés");
        add(feltoltesButton, c);
        feltoltesButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                feltoltes();
            }

        });

    }

    private void feltoltes() {
        String kszam = kartyaszam.getText();
        if (kszam.isEmpty()) {
            new UzenetAblak("Adjon meg kártyaszámot!");
            return;
        }
        Integer kszamInt;
        try {
            kszamInt = Integer.valueOf(kszam);
        } catch (NumberFormatException nfe) {
            new UzenetAblak("Kérem számot adjon meg a kártyaszám mezőbe!");
            return;
        }
        Kartya kartya = Vezerles.getKartya(kszamInt);
        if (kartya == null) {
            new UzenetAblak("Kérem adjon meg érvényes kártyaszámot!");
            return;
        }

        String osszeg = feltoltOsszeg.getText();

        if (osszeg.isEmpty()) {
            new UzenetAblak("Adjon meg összeget!");
            return;
        }
        Integer osszegInt;
        try{
            osszegInt = Integer.valueOf(osszeg);
        }catch (NumberFormatException nfe) {
            new UzenetAblak("Kérem számot adjon meg a feltöltési összeg mezőbe!");
            return;
        }
        if (osszegInt<=0){
            new UzenetAblak("Kérem pozitív összeget adjon meg!");
            return;
        }
        kartya.feltolt(osszegInt);
        new UzenetAblak("Sikeres feltöltés!");
        
        feltoltOsszeg.setText(null);
        kartyaszam.setText(null);
    }
    
}