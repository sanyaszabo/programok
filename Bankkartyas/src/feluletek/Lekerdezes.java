/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feluletek;

import alaposztalyok.Bankkartya;
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
public class Lekerdezes extends JPanel {

    private final JTextField kartyaszam;
    private final JLabel tulajdonos;
    private final JLabel kartyatipus;
    private final JLabel egyenleg;
    private final JLabel hitelkeret;
    private final JLabel hiteltartozas;

    public Lekerdezes() {
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        c.gridx = 0;
        c.gridy = 0;
        add(new JLabel("Kártyaszám: "), c);

        c.gridx = 1;
        kartyaszam = new JTextField(10);
        add(kartyaszam, c);

        c.gridx = 2;
        final JButton lekerdezButton = new JButton("Lekérdezés");
        add(lekerdezButton, c);
        lekerdezButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                lekerdez();
            }

        });
        c.gridx = 0;
        c.gridy = 1;
        tulajdonos = new JLabel();
        add(tulajdonos, c);
        tulajdonos.setVisible(false);

        c.gridy = 2;
        kartyatipus = new JLabel();
        add(kartyatipus, c);
        kartyatipus.setVisible(false);

        c.gridy = 3;
        egyenleg = new JLabel();
        add(egyenleg, c);
        egyenleg.setVisible(false);
        
        c.gridy = 4;
        hitelkeret = new JLabel();
        add(hitelkeret, c);
        hitelkeret.setVisible(false);
        
        c.gridy = 5;
        hiteltartozas = new JLabel();
        add(hiteltartozas, c);
        hiteltartozas.setVisible(false);
        
    }

    private void lekerdez() {
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
        if(kartya.getKartyatipus().equals("bankkártya")){
        tulajdonos.setText("Tulajdonos: " + kartya.getTulajdonos());
        tulajdonos.setVisible(true);
        
        kartyatipus.setText("Kártyatípus: " + kartya.getKartyatipus());
        kartyatipus.setVisible(true);
        
        egyenleg.setText("Egyenleg: " + kartya.getEgyenleg());
        egyenleg.setVisible(true);
        }
        
        tulajdonos.setText("Tulajdonos: " + kartya.getTulajdonos());
        tulajdonos.setVisible(true);
        
        kartyatipus.setText("Kártyatípus: " + kartya.getKartyatipus());
        kartyatipus.setVisible(true);
        
        egyenleg.setText("Egyenleg: " + kartya.getEgyenleg());
        egyenleg.setVisible(true);
        
        hitelkeret.setText("Hitelkeret: " + kartya.getHitelkeret());
        hitelkeret.setVisible(true);
        
        hiteltartozas.setText("Hiteltartozás: " + kartya.getHiteltartozas());
        hiteltartozas.setVisible(true);
    }

}
