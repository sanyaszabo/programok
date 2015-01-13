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
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class KonyvtarPanel extends javax.swing.JPanel {

    private final static String CHAR_CODE = "UTF-8";
    private DefaultListModel<Konyvtar> konyvtarModel = new DefaultListModel<>();
    private DefaultListModel<Konyvtar> gazdagKonyvtarak = new DefaultListModel<>();
    private static List<Konyvtar> konyvtarak = new ArrayList<>();
    private DefaultTableModel tablaModell;

    public KonyvtarPanel() {
        initComponents();
        tab1KonyvtarLst.setModel(konyvtarModel);
        tab2KonyvtarLst.setModel(konyvtarModel);
        tab2LeggazdagabbLst.setModel(gazdagKonyvtarak);
        tab3KimutatasTbl.setShowGrid(true);
        tablaModell = (DefaultTableModel) tab3KimutatasTbl.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        konyvtarTabbedPane = new javax.swing.JTabbedPane();
        tab1Panel = new javax.swing.JPanel();
        tab1KonyvtarLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab1KonyvtarLst = new javax.swing.JList();
        tab1BeiratkozBtn = new javax.swing.JButton();
        tab1KiiratkozBtn = new javax.swing.JButton();
        tab1StatusLbl = new javax.swing.JLabel();
        mukodtetesPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tab2KonyvtarLst = new javax.swing.JList();
        tab2KonyvtarLbl = new javax.swing.JLabel();
        tab2FinanszirozBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tab2LeggazdagabbLst = new javax.swing.JList();
        tab2LeggazdagabbakBtn = new javax.swing.JButton();
        tab2TeljesKtsgLbl = new javax.swing.JLabel();
        tab2EgyetemiKtsgLbl = new javax.swing.JLabel();
        kimutatasPanel = new javax.swing.JPanel();
        tab3KimutatasLbl = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tab3KimutatasTbl = new javax.swing.JTable();
        tab3GeneralBtn = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(600, 400));

        tab1KonyvtarLbl.setText("Könyvtárak");

        tab1KonyvtarLst.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tab1KonyvtarLst);

        tab1BeiratkozBtn.setText("Beiratkoz!");
        tab1BeiratkozBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tab1BeiratkozBtnActionPerformed(evt);
            }
        });

        tab1KiiratkozBtn.setText("Kiiratkoz!");
        tab1KiiratkozBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tab1KiiratkozBtnActionPerformed(evt);
            }
        });

        tab1StatusLbl.setText("tab2KonyvtarLbl");
        tab1StatusLbl.setVisible(false);

        javax.swing.GroupLayout tab1PanelLayout = new javax.swing.GroupLayout(tab1Panel);
        tab1Panel.setLayout(tab1PanelLayout);
        tab1PanelLayout.setHorizontalGroup(
            tab1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab1PanelLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addGroup(tab1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tab1BeiratkozBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(tab1KiiratkozBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tab1StatusLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(77, 77, 77))
            .addGroup(tab1PanelLayout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(tab1KonyvtarLbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tab1PanelLayout.setVerticalGroup(
            tab1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab1PanelLayout.createSequentialGroup()
                .addGroup(tab1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tab1PanelLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(tab1KonyvtarLbl)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tab1PanelLayout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(tab1BeiratkozBtn)
                        .addGap(53, 53, 53)
                        .addComponent(tab1KiiratkozBtn)
                        .addGap(44, 44, 44)
                        .addComponent(tab1StatusLbl)))
                .addContainerGap(150, Short.MAX_VALUE))
        );

        konyvtarTabbedPane.addTab("Beiratkozas", tab1Panel);

        tab2KonyvtarLst.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(tab2KonyvtarLst);

        tab2KonyvtarLbl.setText("Könyvtárak");

        tab2FinanszirozBtn.setText("Finanszíroz!");
        tab2FinanszirozBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tab2FinanszirozBtnActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(tab2LeggazdagabbLst);

        tab2LeggazdagabbakBtn.setText("Leggazdagabbak");
        tab2LeggazdagabbakBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tab2LeggazdagabbakBtnActionPerformed(evt);
            }
        });

        tab2TeljesKtsgLbl.setText("jLabel2");
        tab2TeljesKtsgLbl.setVisible(false);

        tab2EgyetemiKtsgLbl.setText("jLabel3");
        tab2EgyetemiKtsgLbl.setVisible(false);

        javax.swing.GroupLayout mukodtetesPanelLayout = new javax.swing.GroupLayout(mukodtetesPanel);
        mukodtetesPanel.setLayout(mukodtetesPanelLayout);
        mukodtetesPanelLayout.setHorizontalGroup(
            mukodtetesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mukodtetesPanelLayout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(tab2KonyvtarLbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(mukodtetesPanelLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(mukodtetesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mukodtetesPanelLayout.createSequentialGroup()
                        .addGroup(mukodtetesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tab2TeljesKtsgLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                            .addComponent(tab2EgyetemiKtsgLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mukodtetesPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(mukodtetesPanelLayout.createSequentialGroup()
                        .addGroup(mukodtetesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tab2FinanszirozBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tab2LeggazdagabbakBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        mukodtetesPanelLayout.setVerticalGroup(
            mukodtetesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mukodtetesPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(tab2KonyvtarLbl)
                .addGap(18, 18, 18)
                .addGroup(mukodtetesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mukodtetesPanelLayout.createSequentialGroup()
                        .addComponent(tab2FinanszirozBtn)
                        .addGap(29, 29, 29)
                        .addComponent(tab2TeljesKtsgLbl)
                        .addGap(18, 18, 18)
                        .addComponent(tab2EgyetemiKtsgLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tab2LeggazdagabbakBtn)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(mukodtetesPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))))
        );

        konyvtarTabbedPane.addTab("Működtetés", mukodtetesPanel);

        tab3KimutatasLbl.setText("Kimutatás");

        tab3KimutatasTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Név", "Város", "Egyetem", "Olvasószám"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tab3KimutatasTbl);
        if (tab3KimutatasTbl.getColumnModel().getColumnCount() > 0) {
            tab3KimutatasTbl.getColumnModel().getColumn(0).setResizable(false);
            tab3KimutatasTbl.getColumnModel().getColumn(1).setResizable(false);
            tab3KimutatasTbl.getColumnModel().getColumn(2).setResizable(false);
            tab3KimutatasTbl.getColumnModel().getColumn(3).setResizable(false);
        }

        tab3GeneralBtn.setText("Kimutatás Generálása");
        tab3GeneralBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tab3GeneralBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kimutatasPanelLayout = new javax.swing.GroupLayout(kimutatasPanel);
        kimutatasPanel.setLayout(kimutatasPanelLayout);
        kimutatasPanelLayout.setHorizontalGroup(
            kimutatasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kimutatasPanelLayout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(tab3KimutatasLbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kimutatasPanelLayout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(kimutatasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kimutatasPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kimutatasPanelLayout.createSequentialGroup()
                        .addComponent(tab3GeneralBtn)
                        .addGap(225, 225, 225))))
        );
        kimutatasPanelLayout.setVerticalGroup(
            kimutatasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kimutatasPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(tab3KimutatasLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(tab3GeneralBtn)
                .addContainerGap(161, Short.MAX_VALUE))
        );

        konyvtarTabbedPane.addTab("Kimutatás", kimutatasPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(konyvtarTabbedPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(konyvtarTabbedPane)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tab1BeiratkozBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tab1BeiratkozBtnActionPerformed
        if (!tab1KonyvtarLst.isSelectionEmpty()) {
            Konyvtar konyvtar = (Konyvtar) tab1KonyvtarLst.getSelectedValue();
            konyvtar.beiratkoz();
            tab1StatusLbl.setText("Sikeres beiratkozás. Olvasók száma: " + konyvtar.getOlvasoSzam());
            tab1StatusLbl.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Nem választott ki könyvtárat.");
        }
    }//GEN-LAST:event_tab1BeiratkozBtnActionPerformed

    private void tab1KiiratkozBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tab1KiiratkozBtnActionPerformed
        if (!tab1KonyvtarLst.isSelectionEmpty()) {
            Konyvtar konyvtar = (Konyvtar) tab1KonyvtarLst.getSelectedValue();
            boolean sikeres = konyvtar.kiiratkoz();
            if (sikeres) {
                tab1StatusLbl.setText("Sikeres kiiratkozás. Olvasók száma: " + konyvtar.getOlvasoSzam());
                tab1StatusLbl.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Nincs olvasója a könyvtárnak.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Nem választott ki könyvtárat.");
        }
    }//GEN-LAST:event_tab1KiiratkozBtnActionPerformed

    private void tab2FinanszirozBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tab2FinanszirozBtnActionPerformed
        int teljesOsszeg = 0;
        int egyetemiOsszeg = 0;
        for (Konyvtar konyvtar : konyvtarak) {
            int finOsszeg = finOsszegGen();
            konyvtar.finansziroz(finOsszeg);
            teljesOsszeg += konyvtar.getOsszKonyvKeret();
            //TODO: Egyetemi költséget elkészíteni.
        }
        tab2TeljesKtsgLbl.setText("A konyvtarak teljes koltsegvetese: " + teljesOsszeg + " HUF");
        tab2TeljesKtsgLbl.setVisible(true);
        tab2EgyetemiKtsgLbl.setText("Ebbol egyetemi koltsegvetes: " + egyetemiOsszeg + " HUF");
        tab2EgyetemiKtsgLbl.setVisible(true);
    }//GEN-LAST:event_tab2FinanszirozBtnActionPerformed

    private void tab2LeggazdagabbakBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tab2LeggazdagabbakBtnActionPerformed
        int ujmax = 0;
        gazdagKonyvtarak.clear();
        for (Konyvtar konyvtar : konyvtarak) {
            int max = konyvtarak.get(0).getOsszKonyvKeret();
            if (max < konyvtar.getOsszKonyvKeret()) {
                ujmax = konyvtar.getOsszKonyvKeret();
            } else {
                ujmax = konyvtarak.get(0).getOsszKonyvKeret();
            }
        }
        for (Konyvtar konyvtar2 : konyvtarak) {
            if (konyvtar2.getOsszKonyvKeret() == ujmax) {
                System.out.println(konyvtar2);
                gazdagKonyvtarak.addElement(konyvtar2);
            }
        }
    }//GEN-LAST:event_tab2LeggazdagabbakBtnActionPerformed

    private void tab3GeneralBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tab3GeneralBtnActionPerformed
        int n = this.tablaModell.getRowCount();
        for (int i = n - 1; i >= 0; i--) {
            this.tablaModell.removeRow(i);
        }
        for (Konyvtar konyvtar : konyvtarak) {
            Object[] tablaSor = {konyvtar.getKonyvtarnev(), konyvtar.getVaros(), ((EgyetemiKonyvtar) konyvtar).getEgyetem(), konyvtar.getOlvasoSzam()};
            this.tablaModell.addRow(tablaSor);
        }
    }//GEN-LAST:event_tab3GeneralBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel kimutatasPanel;
    private javax.swing.JTabbedPane konyvtarTabbedPane;
    private javax.swing.JPanel mukodtetesPanel;
    private javax.swing.JButton tab1BeiratkozBtn;
    private javax.swing.JButton tab1KiiratkozBtn;
    private javax.swing.JLabel tab1KonyvtarLbl;
    private javax.swing.JList tab1KonyvtarLst;
    private javax.swing.JPanel tab1Panel;
    private javax.swing.JLabel tab1StatusLbl;
    private javax.swing.JLabel tab2EgyetemiKtsgLbl;
    private javax.swing.JButton tab2FinanszirozBtn;
    private javax.swing.JLabel tab2KonyvtarLbl;
    private javax.swing.JList tab2KonyvtarLst;
    private javax.swing.JList tab2LeggazdagabbLst;
    private javax.swing.JButton tab2LeggazdagabbakBtn;
    private javax.swing.JLabel tab2TeljesKtsgLbl;
    private javax.swing.JButton tab3GeneralBtn;
    private javax.swing.JLabel tab3KimutatasLbl;
    private javax.swing.JTable tab3KimutatasTbl;
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
        if (adatok.length == 3) {
            konyvtar = new VarosiKonyvtar(adatok[0], adatok[1], Integer.parseInt(adatok[2]), VarosiKonyvtar.getDefaultKonyvKeret());
            int olvasoSzam = olvasoSzamGen();
            for (int j = 0; j < olvasoSzam; j++) {
                konyvtar.beiratkoz();
            }
        } else {
            konyvtar = new EgyetemiKonyvtar(adatok[0], adatok[1], Integer.parseInt(adatok[2]), VarosiKonyvtar.getDefaultKonyvKeret(), adatok[3]);
            int olvasoSzam = olvasoSzamGen();
            for (int j = 0; j < olvasoSzam; j++) {
                konyvtar.beiratkoz();
            }

        }
        konyvtarak.add(konyvtar);
        konyvtarModel.addElement(konyvtar);
    }

    public int olvasoSzamGen() {
        int random = (int) (Math.random() * 4000) + 1000;
        return random;
    }

    public int finOsszegGen() {
        int random = (int) (Math.random() * 5000) + 5000;
        return random;
    }

}
