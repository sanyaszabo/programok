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
public class MainPanel extends javax.swing.JPanel {

    /**
     * Creates new form MainPanel
     */
    public MainPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leltarLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mainLst = new javax.swing.JList();
        adatModositoLbl = new javax.swing.JLabel();
        ujAdatBtn = new javax.swing.JButton();
        adatModositoBtn = new javax.swing.JButton();
        adatTorloBtn = new javax.swing.JButton();
        kilepoBtn = new javax.swing.JButton();
        adatModositoLbl1 = new javax.swing.JLabel();
        szuresCmbBox = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        szuroLst = new javax.swing.JList();
        szurBtn = new javax.swing.JButton();
        keresesLbl = new javax.swing.JLabel();
        keresesLbl1 = new javax.swing.JLabel();
        keresoFelhasznLbl = new javax.swing.JLabel();
        keresoGySzLbl = new javax.swing.JLabel();
        keresoLKLbl1 = new javax.swing.JLabel();
        keresoAKLbl = new javax.swing.JLabel();
        keresoDatumLbl = new javax.swing.JLabel();
        keresoGySzTextField = new javax.swing.JTextField();
        keresoFelhasznTextField1 = new javax.swing.JTextField();
        keresoLKTextField = new javax.swing.JTextField();
        keresoDatumTextField = new javax.swing.JTextField();
        keresoAKTextField1 = new javax.swing.JTextField();
        rendezBtn = new javax.swing.JButton();
        rendezesCmbBox = new javax.swing.JComboBox();
        keresBtn = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1000, 650));

        leltarLbl.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        leltarLbl.setText("Leltár");

        mainLst.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        mainLst.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(mainLst);

        adatModositoLbl.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        adatModositoLbl.setText("Adatmódosító műveletek");

        ujAdatBtn.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        ujAdatBtn.setText("Új eszköz felvitele");

        adatModositoBtn.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        adatModositoBtn.setText("Eszköz módosítása");

        adatTorloBtn.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        adatTorloBtn.setText("Eszköz törlése");

        kilepoBtn.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        kilepoBtn.setText("Kilépés");

        adatModositoLbl1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        adatModositoLbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adatModositoLbl1.setText("Adatszűrés");

        szuresCmbBox.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        szuresCmbBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Válasszon", "Eszköz", "Osztály", "Épület", "Státusz" }));

        szuroLst.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        szuroLst.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(szuroLst);

        szurBtn.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        szurBtn.setText("Szűr!");

        keresesLbl.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        keresesLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        keresesLbl.setText("Keresés");

        keresesLbl1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        keresesLbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        keresesLbl1.setText("Rendezés");

        keresoFelhasznLbl.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        keresoFelhasznLbl.setText("Felhasználó:");

        keresoGySzLbl.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        keresoGySzLbl.setText("Gyártói szám:");

        keresoLKLbl1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        keresoLKLbl1.setText("Leltári Kód:");

        keresoAKLbl.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        keresoAKLbl.setText("Adatkezelő:");

        keresoDatumLbl.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        keresoDatumLbl.setText("Dátum");

        keresoGySzTextField.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N

        keresoFelhasznTextField1.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N

        keresoLKTextField.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N

        keresoDatumTextField.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N

        keresoAKTextField1.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N

        rendezBtn.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        rendezBtn.setText("Rendez!");

        rendezesCmbBox.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        rendezesCmbBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Válasszon", "Név", "Dátum" }));

        keresBtn.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        keresBtn.setText("Keres!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(leltarLbl)
                                .addGap(391, 391, 391)
                                .addComponent(kilepoBtn))
                            .addComponent(jScrollPane1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(adatModositoLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ujAdatBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(adatModositoBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(adatTorloBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(szuresCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(szurBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(keresoAKLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(39, 39, 39)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(keresoGySzLbl)
                                                        .addComponent(keresoFelhasznLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(keresoLKLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(keresoDatumLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(keresoFelhasznTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                            .addComponent(keresoGySzTextField)
                                            .addComponent(keresoLKTextField)
                                            .addComponent(keresoDatumTextField)
                                            .addComponent(keresoAKTextField1)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(87, 87, 87)
                                        .addComponent(keresBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addComponent(adatModositoLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(149, 149, 149)
                                .addComponent(keresesLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(keresesLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(rendezesCmbBox, 0, 128, Short.MAX_VALUE)
                                    .addComponent(rendezBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(30, 30, 30)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(leltarLbl)
                    .addComponent(kilepoBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adatModositoLbl)
                    .addComponent(adatModositoLbl1)
                    .addComponent(keresesLbl)
                    .addComponent(keresesLbl1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(szuresCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ujAdatBtn))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(adatModositoBtn)
                                    .addComponent(szurBtn))
                                .addGap(28, 28, 28)
                                .addComponent(adatTorloBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(keresoFelhasznLbl)
                                    .addComponent(keresoFelhasznTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rendezesCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(keresoGySzLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(keresoGySzTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(keresoLKLbl1)
                                            .addComponent(keresoLKTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(rendezBtn)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(keresoAKTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(keresoAKLbl, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(keresoDatumLbl)
                                    .addComponent(keresoDatumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(keresBtn)
                        .addGap(0, 15, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adatModositoBtn;
    private javax.swing.JLabel adatModositoLbl;
    private javax.swing.JLabel adatModositoLbl1;
    private javax.swing.JButton adatTorloBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton keresBtn;
    private javax.swing.JLabel keresesLbl;
    private javax.swing.JLabel keresesLbl1;
    private javax.swing.JLabel keresoAKLbl;
    private javax.swing.JTextField keresoAKTextField1;
    private javax.swing.JLabel keresoDatumLbl;
    private javax.swing.JTextField keresoDatumTextField;
    private javax.swing.JLabel keresoFelhasznLbl;
    private javax.swing.JTextField keresoFelhasznTextField1;
    private javax.swing.JLabel keresoGySzLbl;
    private javax.swing.JTextField keresoGySzTextField;
    private javax.swing.JLabel keresoLKLbl1;
    private javax.swing.JTextField keresoLKTextField;
    private javax.swing.JButton kilepoBtn;
    private javax.swing.JLabel leltarLbl;
    private javax.swing.JList mainLst;
    private javax.swing.JButton rendezBtn;
    private javax.swing.JComboBox rendezesCmbBox;
    private javax.swing.JButton szurBtn;
    private javax.swing.JComboBox szuresCmbBox;
    private javax.swing.JList szuroLst;
    private javax.swing.JButton ujAdatBtn;
    // End of variables declaration//GEN-END:variables
}