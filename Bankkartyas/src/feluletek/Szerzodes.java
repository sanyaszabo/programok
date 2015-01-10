/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feluletek;

import alaposztalyok.Bankkartya;
import alaposztalyok.Hitelkartya;
import alaposztalyok.Kartya;
import bankkartyas.Vezerles;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Sandor
 */
public class Szerzodes extends JPanel {

    private final JComboBox<String> kartyatipus;
    private final JTextField ugyfelnev;
    private final JTextField hitelkeret;
    private final JLabel hitelkeretCimke;
    private final JLabel kartyaszam;

    public Szerzodes() {
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        c.gridx = 0;
        c.gridy = 0;
        add(new JLabel("Az ügyfél neve:"), c);

        c.gridx = 1;
        ugyfelnev = new JTextField(10);
        add(ugyfelnev, c);

        c.gridx = 0;
        c.gridy = 1;
        add(new JLabel("Kártyatípus:"), c);

        c.gridx = 1;
        kartyatipus = new JComboBox<String>();
        add(kartyatipus, c);
        kartyatipus.addItem("válasszon");
        kartyatipus.addItem(Hitelkartya.kartyatipus);
        kartyatipus.addItem(Bankkartya.kartyatipus);
        kartyatipus.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (kartyatipus.getSelectedItem().equals(Hitelkartya.kartyatipus)) {
                    hitelkeretCimke.setVisible(true);
                    hitelkeret.setVisible(true);
                    hitelkeret.setText(null);
                } else {
                    hitelkeretCimke.setVisible(false);
                    hitelkeret.setVisible(false);
                    hitelkeret.setText(null);
                }
            }
        });

        c.gridx = 0;
        c.gridy = 2;
        hitelkeretCimke = new JLabel("Hitelkeret:");
        add(hitelkeretCimke, c);
        hitelkeretCimke.setVisible(false);

        c.gridx = 1;
        hitelkeret = new JTextField(10);
        add(hitelkeret, c);
        hitelkeret.setVisible(false);

        c.gridx = 0;
        c.gridy = 4;
        final JButton szerzodeskotesButton = new JButton("Szerződéskötés");
        add(szerzodeskotesButton, c);
        szerzodeskotesButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                szerzodeskotes();
            }
        });

        c.gridx = 1;
        kartyaszam = new JLabel();
        add(kartyaszam, c);
        kartyaszam.setVisible(false);
        
    }

    public void szerzodeskotes() {

        String nev = ugyfelnev.getText();
        if (nev.isEmpty()) {
            new UzenetAblak("Név megadása kötelező!");
            return;
        }
        if (kartyatipus.getSelectedIndex() == 0) {
            new UzenetAblak("Kérem válassza ki a kártyatípust!");
            return;
        }
        String tipus = (String) kartyatipus.getSelectedItem();
        Integer keret = null;
        if (tipus.equals(Hitelkartya.kartyatipus)) {
            if (hitelkeret.getText().isEmpty()) {
                new UzenetAblak("Adjon meg hitelkeretet!");
                return;
            }
            try {
                keret = Integer.valueOf(hitelkeret.getText());
            } catch (NumberFormatException nfe) {
                new UzenetAblak("Kérem számot adjon meg a hitelkeret mezőbe!");
                return;
            }
            if (keret<=0){
                new UzenetAblak("Kérem nullánál nagyobb összeget adjon meg!");
                return;
            }

        }
        final Kartya kartya = Vezerles.szerzodesKotes(nev, tipus, keret);
        kartyaszam.setText("Kártyaszám: " + kartya.getKartyaszam());
        kartyaszam.setVisible(true);
        ugyfelnev.setText(null);
        kartyatipus.setSelectedIndex(0);
        hitelkeret.setText(null);
        
    }
}
