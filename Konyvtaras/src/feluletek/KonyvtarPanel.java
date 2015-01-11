/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feluletek;

/**
 *
 * @author Sandor
 */
import alaposztalyok.Konyvtar;
import alaposztalyok.VarosiKonyvtar;
import alaposztalyok.EgyetemiKonyvtar;
import java.io.InputStream;
import java.util.Scanner;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class KonyvtarPanel extends javax.swing.JPanel {

    private final static String CHAR_CODE = "UTF-8";
    private DefaultListModel<Konyvtar> konyvtarModel = new DefaultListModel<>();

    public KonyvtarPanel() {
        initComponents();
        tab1KonyvtarLst.setModel(konyvtarModel);
        tab2KonyvtarLst.setModel(konyvtarModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        konyvtarasTabbedPane = new javax.swing.JTabbedPane();
        tab1Panel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tab1KonyvtarLst = new javax.swing.JList();
        tab1KonyvtarLbl = new javax.swing.JLabel();
        tab1BeiratkozBtn = new javax.swing.JButton();
        tab1KiiratkozBtn = new javax.swing.JButton();
        tab1StatusLbl = new javax.swing.JLabel();
        tab2Panel = new javax.swing.JPanel();
        tab2KonyvtarLbl = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tab2KonyvtarLst = new javax.swing.JList();
        tab2FinanszirozasBtn = new javax.swing.JButton();
        tab2OsszKtsgVetesLbl = new javax.swing.JLabel();
        tab2EgyetemKtsgVetesLbl = new javax.swing.JLabel();
        tab2LegGazdagabbakBtn = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tab2LeggazdagabbLst = new javax.swing.JList();
        tab3Panel = new javax.swing.JPanel();
        tab3KimutatasLbl = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tab3KimutatasTbl = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setPreferredSize(new java.awt.Dimension(400, 300));

        tab1KonyvtarLst.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(tab1KonyvtarLst);

        tab1KonyvtarLbl.setText("Könyvtárak");

        tab1BeiratkozBtn.setText("Beiratkoz");
        tab1BeiratkozBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tab1BeiratkozBtnActionPerformed(evt);
            }
        });

        tab1KiiratkozBtn.setText("Kiiratkoz");
        tab1KiiratkozBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tab1KiiratkozBtnActionPerformed(evt);
            }
        });

        tab1StatusLbl.setText("jLabel1");
        tab1StatusLbl.setVisible(false);

        javax.swing.GroupLayout tab1PanelLayout = new javax.swing.GroupLayout(tab1Panel);
        tab1Panel.setLayout(tab1PanelLayout);
        tab1PanelLayout.setHorizontalGroup(
            tab1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab1PanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(tab1KonyvtarLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(tab1PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(tab1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tab1PanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tab1StatusLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tab1PanelLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(tab1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tab1KiiratkozBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tab1BeiratkozBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(100, 100, 100))
        );
        tab1PanelLayout.setVerticalGroup(
            tab1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab1PanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(tab1KonyvtarLbl)
                .addGroup(tab1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(tab1PanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tab1PanelLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(tab1BeiratkozBtn)
                        .addGap(30, 30, 30)
                        .addComponent(tab1KiiratkozBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tab1StatusLbl)))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        konyvtarasTabbedPane.addTab("Olvasók", tab1Panel);

        tab2KonyvtarLbl.setText("Könyvtárak");

        tab2KonyvtarLst.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(tab2KonyvtarLst);

        tab2FinanszirozasBtn.setText("Finanszírozás");

        tab2OsszKtsgVetesLbl.setText("jLabel1");

        tab2EgyetemKtsgVetesLbl.setText("jLabel1");

        tab2LegGazdagabbakBtn.setText("Leggazdagabbak");

        tab2LeggazdagabbLst.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(tab2LeggazdagabbLst);

        javax.swing.GroupLayout tab2PanelLayout = new javax.swing.GroupLayout(tab2Panel);
        tab2Panel.setLayout(tab2PanelLayout);
        tab2PanelLayout.setHorizontalGroup(
            tab2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab2PanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(tab2KonyvtarLbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(tab2PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(tab2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tab2PanelLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(tab2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tab2EgyetemKtsgVetesLbl)
                            .addComponent(tab2OsszKtsgVetesLbl)))
                    .addGroup(tab2PanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addGroup(tab2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab2PanelLayout.createSequentialGroup()
                                .addGroup(tab2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tab2FinanszirozasBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tab2LegGazdagabbakBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(85, 85, 85)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tab2PanelLayout.setVerticalGroup(
            tab2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab2PanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(tab2KonyvtarLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tab2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tab2PanelLayout.createSequentialGroup()
                        .addComponent(tab2FinanszirozasBtn)
                        .addGap(18, 18, 18)
                        .addComponent(tab2OsszKtsgVetesLbl)
                        .addGap(18, 18, 18)
                        .addComponent(tab2EgyetemKtsgVetesLbl)
                        .addGap(18, 18, 18)
                        .addComponent(tab2LegGazdagabbakBtn)
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        konyvtarasTabbedPane.addTab("Működtetés", tab2Panel);

        tab3KimutatasLbl.setText("Kimutatás");

        tab3KimutatasTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Név", "Város", "Egyetem", "Olvasószám"
            }
        ));
        jScrollPane5.setViewportView(tab3KimutatasTbl);

        javax.swing.GroupLayout tab3PanelLayout = new javax.swing.GroupLayout(tab3Panel);
        tab3Panel.setLayout(tab3PanelLayout);
        tab3PanelLayout.setHorizontalGroup(
            tab3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab3PanelLayout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(tab3KimutatasLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab3PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        tab3PanelLayout.setVerticalGroup(
            tab3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab3PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tab3KimutatasLbl)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                .addContainerGap())
        );

        konyvtarasTabbedPane.addTab("Kimutatás", tab3Panel);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 396, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 301, Short.MAX_VALUE)
        );

        konyvtarasTabbedPane.addTab("Könyv vásárlás", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(konyvtarasTabbedPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(konyvtarasTabbedPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tab1BeiratkozBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tab1BeiratkozBtnActionPerformed
        if (!tab1KonyvtarLst.isSelectionEmpty()) {
            Konyvtar konyvtar = (VarosiKonyvtar) tab1KonyvtarLst.getSelectedValue();
            konyvtar.beiratkoz();
            tab1StatusLbl.setText("Sikeres beiratkozás. Olvasók száma: " + konyvtar.getOlvasoSzam());
            tab1StatusLbl.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Nem választott ki senkit.");
        }
    }//GEN-LAST:event_tab1BeiratkozBtnActionPerformed

    private void tab1KiiratkozBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tab1KiiratkozBtnActionPerformed
        if (!tab1KonyvtarLst.isSelectionEmpty()) {
            Konyvtar konyvtar = (VarosiKonyvtar) tab1KonyvtarLst.getSelectedValue();
            boolean sikeres = konyvtar.kiiratkoz();
            if (sikeres) {
                tab1StatusLbl.setText("Sikeres kiiratkozás. Olvasók száma: " + konyvtar.getOlvasoSzam());
                tab1StatusLbl.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Nincs olvasója a könyvtárnak.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Nem választott ki senkit.");
        }
    }//GEN-LAST:event_tab1KiiratkozBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane konyvtarasTabbedPane;
    private javax.swing.JButton tab1BeiratkozBtn;
    private javax.swing.JButton tab1KiiratkozBtn;
    private javax.swing.JLabel tab1KonyvtarLbl;
    private javax.swing.JList tab1KonyvtarLst;
    private javax.swing.JPanel tab1Panel;
    private javax.swing.JLabel tab1StatusLbl;
    private javax.swing.JLabel tab2EgyetemKtsgVetesLbl;
    private javax.swing.JButton tab2FinanszirozasBtn;
    private javax.swing.JLabel tab2KonyvtarLbl;
    private javax.swing.JList tab2KonyvtarLst;
    private javax.swing.JButton tab2LegGazdagabbakBtn;
    private javax.swing.JList tab2LeggazdagabbLst;
    private javax.swing.JLabel tab2OsszKtsgVetesLbl;
    private javax.swing.JPanel tab2Panel;
    private javax.swing.JLabel tab3KimutatasLbl;
    private javax.swing.JTable tab3KimutatasTbl;
    private javax.swing.JPanel tab3Panel;
    // End of variables declaration//GEN-END:variables

    public void beolvas() throws Exception {
        InputStream ins = this.getClass().getResourceAsStream("/adatok/konyvtarak.txt");
        fajlbol(ins);
    }

    private void fajlbol(InputStream ins) {
        Scanner fajlScanner = new Scanner(ins, CHAR_CODE);
        String sor;
        while (fajlScanner.hasNextLine()) {
            sor = fajlScanner.nextLine();
            feldolgoz(sor);
        }
    }

    private void feldolgoz(String sor) {
        String[] adatok = sor.split(";");
        Konyvtar konyvtar;
        if (adatok[3].isEmpty()) {
            konyvtar = new VarosiKonyvtar(adatok[0], adatok[1], olvasoSzamGen(), Integer.parseInt(adatok[2]), VarosiKonyvtar.getKonyvKeret());
        } else {
            konyvtar = new EgyetemiKonyvtar(adatok[0], adatok[1], olvasoSzamGen(), Integer.parseInt(adatok[2]), VarosiKonyvtar.getKonyvKeret(), adatok[3], EgyetemiKonyvtar.getFejkvotaSzorzo());
        }
        konyvtarModel.addElement(konyvtar);
    }

    public int olvasoSzamGen() {
        int random = (int) (Math.random() * 4000) + 1000;
        for (int i = 0; i < random; i++) {

        }
        return 0;
    }
}
