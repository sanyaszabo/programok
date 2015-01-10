/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feluletek;

import alaposztalyok.Kartya;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Sandor
 */
public class Bank extends JPanel {

    private final JScrollPane scrollpane;
    private final JTable tablazat;
    private final JLabel teljesOsszeg;
    private static List<Kartya> adatok = new ArrayList<>();
    private String tulajdonos;
    private int kartyaszam;
    private int egyenleg;
    private int hitel;

    public Bank() {
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        c.gridx = 0;
        c.gridy = 0;
        add(new JLabel("Kimutatás"), c);

        c.gridx = 0;
        c.gridy = 1;
        tablazat = new JTable(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null}},
                new String[]{
                    "Tulajdonos", "Sorszám", "Egyenleg", "Hitel"
                }
        ));
        add(tablazat, c);
        tablazat.setPreferredScrollableViewportSize(new Dimension(350, 100));

        scrollpane = new javax.swing.JScrollPane();
        scrollpane.setViewportView(tablazat);

        add(scrollpane, c);

        c.gridy = 3;

        final JRadioButton nevSzerintBtn = new JRadioButton("Név szerint");
        add(nevSzerintBtn, c);
        nevSzerintBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                nevszerint();
            }

        });

        c.gridy = 4;

        final JRadioButton egyenlegSzerintBtn = new JRadioButton("Egyenleg szerint");
        add(egyenlegSzerintBtn, c);
        egyenlegSzerintBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                egyenlegszerint();
            }

        });

        c.gridy = 5;

        final JRadioButton hitelSzerintBtn = new JRadioButton("Hitel szerint");
        add(hitelSzerintBtn, c);
        hitelSzerintBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                hitelszerint();
            }

        });

        c.gridx = 0;
        c.gridy = 2;
        teljesOsszeg = new JLabel();
        add(teljesOsszeg, c);
        teljesOsszeg.setText("Teljes összeg:");

    }

    private void nevszerint() {
        for (Kartya kartya : adatok) {
            tulajdonos = kartya.getTulajdonos();
            kartyaszam = kartya.getKartyaszam();
            egyenleg = kartya.getEgyenleg() - kartya.getHiteltartozas();
            hitel = kartya.getHiteltartozas();
            Object[] row = {tulajdonos, kartyaszam, egyenleg, hitel};
            DefaultTableModel model;
            model = (DefaultTableModel) tablazat.getModel();
            model.addRow(row);
            model.fireTableDataChanged();
        }
    }

    private void egyenlegszerint() {
    }

    private void hitelszerint() {
    }

}
