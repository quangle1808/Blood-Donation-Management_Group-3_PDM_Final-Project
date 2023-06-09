
package pdm_project.admin;

import java.awt.Color;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import pdm_project.donor.DatabaseDonor;
import pdm_project.main.BloodStock;
import pdm_project.main.Donor;
import pdm_project.model.BloodStock_admin;
import pdm_project.model.Donor_admin;


public class BloodStockForm extends javax.swing.JFrame {

    /**
     * Creates new form BloodStock
     */
    public BloodStockForm() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtBid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtInput_date = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtBlood_type = new javax.swing.JTextField();
        tbnReset = new javax.swing.JButton();
        tbnSave = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtVolume = new javax.swing.JTextField();
        buttonback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("BLOOD STOCK");

        jLabel2.setText("Donnor ID:");

        jLabel3.setText("Blood bank ID:");

        jLabel4.setText("Input date:");

        jLabel5.setText("Blood type:");

        tbnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Actions-document-edit-icon-16.png"))); // NOI18N
        tbnReset.setText("Reset");
        tbnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnResetActionPerformed(evt);
            }
        });

        tbnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Save-icon.png"))); // NOI18N
        tbnSave.setText("Save");
        tbnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnSaveActionPerformed(evt);
            }
        });

        jLabel6.setText("Volume:");

        buttonback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logout-icon-16.png"))); // NOI18N
        buttonback.setText("Back");
        buttonback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonback, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(140, 140, 140))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtVolume, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBlood_type, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtInput_date, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDid, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBid, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(tbnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tbnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(buttonback, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtDid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtBid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtInput_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtBlood_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtVolume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(74, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tbnSave)
                            .addComponent(tbnReset))
                        .addGap(22, 22, 22))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnResetActionPerformed
        // TODO add your handling code here:
        //txtAddr.setText("");
        txtDid.setText("");
        txtBid.setText("");
        txtBlood_type.setText("");
        txtInput_date.setText("");
        txtVolume.setText("");
    }//GEN-LAST:event_tbnResetActionPerformed

    private void tbnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnSaveActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();
        if (txtDid.getText().equals("") || txtBid.getText().equals("")){
            sb.append("Error");
            txtDid.setBackground(Color.red);
            txtBid.setBackground(Color.red);
        } else {
            txtDid.setBackground(Color.white);
            txtBid.setBackground(Color.white);
        }
        if(sb.length()>0){
            JOptionPane.showMessageDialog(this, sb);
            return;
        }
        
        try {
            BloodStock_admin bs = new BloodStock_admin();
            
            bs.setDid(txtDid.getText());
            bs.setBid(txtBid.getText());
            bs.setBlood_type(txtBlood_type.getText());
                        
            //set date 
            String txtd = txtInput_date.getText();
            Date d = Date.valueOf(txtd);
            bs.setInput_date(d);
            
            
            // set Age
            String txtvol = txtVolume.getText();
            int vol = Integer.parseInt(txtvol);
            bs.setVolume(vol);
            
            // Compare entered blood type is as the same as the donor's blood type
            String inputBloodType = txtBlood_type.getText();
            String donorBloodType = null;
            String sqlCheckDonor = "select blood_type from Donor where did = ?;";
            
            Connection con = DatabaseDonor.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sqlCheckDonor);
            pstmt.setString(1, txtDid.getText());
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                donorBloodType = rs.getString("blood_type");
            }
            
            if (!inputBloodType.equals(donorBloodType)) {
                JOptionPane.showMessageDialog(this, "The incompatibility between the entered blood type and the donor's blood type occurs!");
            }
            else {
                JOptionPane.showMessageDialog(this, "Succesfully!");
                BloodStock bst = new BloodStock();
                bst.insert(bs);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            e.printStackTrace();
        }
    }                                       

    private void txtdobActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    @SuppressWarnings("empty-statement")
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tbnSaveActionPerformed

    private void buttonbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonbackActionPerformed
        // TODO add your handling code here:
        AdminUI adm = new AdminUI();
        adm.setVisible(true);
        adm.setLocationRelativeTo(null);
        adm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        System.out.println();

    }//GEN-LAST:event_buttonbackActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(BloodStockForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BloodStockForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BloodStockForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BloodStockForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BloodStockForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonback;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton tbnReset;
    private javax.swing.JButton tbnSave;
    private javax.swing.JTextField txtBid;
    private javax.swing.JTextField txtBlood_type;
    private javax.swing.JTextField txtDid;
    private javax.swing.JTextField txtInput_date;
    private javax.swing.JTextField txtVolume;
    // End of variables declaration//GEN-END:variables
}
