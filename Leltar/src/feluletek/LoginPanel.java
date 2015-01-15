/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feluletek;

import javax.swing.JOptionPane;

/**
 *
 * @author Sandor
 */
public class LoginPanel extends javax.swing.JPanel {

    private static final String felhasznalonev = "leltar";
    private static final String jelszo = "123";

    public LoginPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        felhasznaloLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        felhasznaloTxtField = new javax.swing.JTextField();
        jelszoTxtField = new javax.swing.JTextField();
        bejelentkezesBtn = new javax.swing.JButton();
        statusLbl = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(300, 200));

        felhasznaloLbl.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        felhasznaloLbl.setText("Felhasználó:");

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel1.setText("Jelszó:");

        felhasznaloTxtField.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        jelszoTxtField.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        bejelentkezesBtn.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        bejelentkezesBtn.setText("Bejelentkezés!");
        bejelentkezesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bejelentkezesBtnActionPerformed(evt);
            }
        });

        statusLbl.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        statusLbl.setText("jLabel2");
        statusLbl.setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(felhasznaloLbl)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(felhasznaloTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jelszoTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(bejelentkezesBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(statusLbl)
                .addGap(61, 61, 61))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(felhasznaloLbl)
                    .addComponent(felhasznaloTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jelszoTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bejelentkezesBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(statusLbl)
                .addContainerGap(42, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bejelentkezesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bejelentkezesBtnActionPerformed
        bejelentkezes();
    }//GEN-LAST:event_bejelentkezesBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bejelentkezesBtn;
    private javax.swing.JLabel felhasznaloLbl;
    private javax.swing.JTextField felhasznaloTxtField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jelszoTxtField;
    private javax.swing.JLabel statusLbl;
    // End of variables declaration//GEN-END:variables

    private void bejelentkezes() {

        if (felhasznaloTxtField.getText().equals(felhasznalonev)) {
            if (jelszoTxtField.getText().equals(jelszo)) {
                statusLbl.setVisible(false);
                //TODO: LoginFrame ablak bezárása!
                new vezerlo.MainFrame();
            } else {
                statusLbl.setText("Sikertelen bejelentkezés!");
                statusLbl.setVisible(true);
            }
        } else {
            statusLbl.setText("Sikertelen bejelentkezés!");
            statusLbl.setVisible(true);
        }
    }
}
