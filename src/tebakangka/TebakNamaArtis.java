/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tebakangka;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class TebakNamaArtis extends javax.swing.JFrame {

    String[] nama = {"Fattah Aamin", "Afgan",
        "Dedy Corbuzier", "Raditya Dika",
        "Christian Sugiono", "Hamish Daud"};
    //  String soal = ;
    String kataAcak = generateArtis();
    String soalNama;
    String soal;

    public TebakNamaArtis() { // construction
        initComponents();
        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jLabel1 = new javax.swing.JLabel();
        mulaiButton = new javax.swing.JButton();
        petunjukLabel = new javax.swing.JLabel();
        inputNamaTextField = new javax.swing.JTextField();
        cekNamaButton = new javax.swing.JButton();
        jawabanLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        petunjuk2Label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tebakangka/namaartis.jpg"))); // NOI18N

        mulaiButton.setText("Mulai");
        mulaiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mulaiButtonActionPerformed(evt);
            }
        });

        petunjukLabel.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        petunjukLabel.setText("Nama Artizzzz");

        inputNamaTextField.setEnabled(false);
        inputNamaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNamaTextFieldActionPerformed(evt);
            }
        });

        cekNamaButton.setText("Are you sure??");
        cekNamaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cekNamaButtonActionPerformed(evt);
            }
        });

        jawabanLabel.setText("---");

        petunjuk2Label.setText("Klik Tombol Mulai!!!");
        petunjuk2Label.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(71, 265, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(170, 170, 170))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(petunjukLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(85, 85, 85)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(149, 149, 149)
                            .addComponent(cekNamaButton)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(inputNamaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(99, 99, 99)
                            .addComponent(mulaiButton))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jawabanLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(petunjuk2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(mulaiButton)
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(petunjukLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(petunjuk2Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputNamaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cekNamaButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jawabanLabel)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void mulaiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mulaiButtonActionPerformed
        petunjukLabel.setText(generateArtis());
        petunjuk2Label.setText("Masukkan nama artis sesuai dengan huruf acak di atas!");
        jawabanLabel.setText("---");
        inputNamaTextField.setEnabled(true);
        mulaiButton.setEnabled(false);
        cekNamaButton.setEnabled(true);
        //soalNama = soalNama();
        // TODO add your handling code here:
    }//GEN-LAST:event_mulaiButtonActionPerformed

    private void cekNamaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cekNamaButtonActionPerformed
        try {
        String tebakan = inputNamaTextField.getText();

        if (tebakan.equalsIgnoreCase(soal)) {
            jawabanLabel.setText("###Selamat!!!! Anda Benar###");
            inputNamaTextField.setEnabled(false);
            cekNamaButton.setEnabled(false);
            inputNamaTextField.setText(" ");
            mulaiButton.setEnabled(true);
        } else {
            jawabanLabel.setText("Salah. Coba lagi.");
          //  petunjukLabel.setText(generateArtis());
        }    
          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Masukin Nama yg benar!!!");
        }
        
    }//GEN-LAST:event_cekNamaButtonActionPerformed

    private void inputNamaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNamaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNamaTextFieldActionPerformed

    private String generateArtis() { // nama yg sudah di acak

        double acak = Math.random() * 6;
        double floor = Math.floor(acak);
        int ambilNama = (int) floor;
        soal = nama[ambilNama];

        soal = soal.toUpperCase();
        char[] artis = soal.toCharArray();
        Arrays.sort(artis);
        String soalNamaArtis = new String(artis);
        return soalNamaArtis;
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TebakNamaArtis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TebakNamaArtis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TebakNamaArtis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TebakNamaArtis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TebakNamaArtis().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cekNamaButton;
    private javax.swing.JTextField inputNamaTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JLabel jawabanLabel;
    private javax.swing.JButton mulaiButton;
    private javax.swing.JLabel petunjuk2Label;
    private javax.swing.JLabel petunjukLabel;
    // End of variables declaration//GEN-END:variables
}