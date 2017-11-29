/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tebakangka;

import javax.swing.JOptionPane;

public class TebakAngkaWindow extends javax.swing.JFrame {

    int angkaSoal;

    public TebakAngkaWindow() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        mulaiButton = new javax.swing.JButton();
        petunjukLabel1 = new javax.swing.JLabel();
        areYouSureButton = new javax.swing.JButton();
        inputAngkaTextField = new javax.swing.JTextField();
        tambahanLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tebakangka/tebakangka.png"))); // NOI18N

        mulaiButton.setText("Mulai");
        mulaiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mulaiButtonActionPerformed(evt);
            }
        });

        petunjukLabel1.setText("Klik Tombol Mulai");

        areYouSureButton.setText("Are you sure?");
        areYouSureButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areYouSureButtonActionPerformed(evt);
            }
        });

        inputAngkaTextField.setEnabled(false);

        tambahanLabel.setText("Fighting!!!!!!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mulaiButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(petunjukLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(inputAngkaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(78, 78, 78)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(132, 132, 132)
                            .addComponent(areYouSureButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(90, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(tambahanLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mulaiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(petunjukLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(inputAngkaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(areYouSureButton)
                .addGap(18, 18, 18)
                .addComponent(tambahanLabel)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mulaiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mulaiButtonActionPerformed
        angkaSoal = generateAngka();
        petunjukLabel1.setText("Masukkan angka 1-100!");
        inputAngkaTextField.setEnabled(true);

// TODO add your handling code here:

    }//GEN-LAST:event_mulaiButtonActionPerformed

    private void areYouSureButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areYouSureButtonActionPerformed

        try { // logic yg berpotensi error

            String tebakString = inputAngkaTextField.getText();
            int tebakan = Integer.parseInt(tebakString); // jika masukkan string bukan int, pake exeption handling
            if (tebakan == angkaSoal) {
                petunjukLabel1.setText("Brilliant!!!!");
                inputAngkaTextField.setEnabled(false);
                mulaiButton.setEnabled(true); // kalo true bisa diklik kembali buttonnya.
            } else {
                String message;
                if (tebakan < angkaSoal) {
                    message = "Angka terlalu kecil. Coba lagi yaa!";
                } else {
                    message = "Angka terlalu besar. Coba lagi yaa!";
                }
                petunjukLabel1.setText(message);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Masukkan angka. Ngerti angka nggak?!!!");
        } // di sini ditankap error/ masalahnya    }// di sini ditankap error/ masalahnya

        // TODO add your handling code here:
    }//GEN-LAST:event_areYouSureButtonActionPerformed
    private int generateAngka() {
        double random = Math.random() * 100;
        double ceilValue = Math.ceil(random);
        int generatedAngkaSoal = (int) ceilValue;
        return generatedAngkaSoal;
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
            java.util.logging.Logger.getLogger(TebakAngkaWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TebakAngkaWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TebakAngkaWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TebakAngkaWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TebakAngkaWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton areYouSureButton;
    private javax.swing.JTextField inputAngkaTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton mulaiButton;
    private javax.swing.JLabel petunjukLabel1;
    private javax.swing.JLabel tambahanLabel;
    // End of variables declaration//GEN-END:variables
}
