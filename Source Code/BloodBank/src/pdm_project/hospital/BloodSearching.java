/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdm_project.hospital;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class BloodSearching extends javax.swing.JFrame {
    private DefaultTableModel tblModel;
    private int orderAll = -1;
    
    /**
     * Creates new form BloodSearching
     */
    
    public BloodSearching(String ID) {
        initComponents();
        
        initTableModel();
        BloodSearching(ID);
    }
    
     private void BloodSearching(String ID){
        try {
            String bdUrl = "jdbc:sqlserver://localhost:1433;databaseName=PDMProject;user=sa;password=sa;encrypt=true;trustServerCertificate=true;";
            Connection conn = DriverManager.getConnection(bdUrl);
            String sql = "select * from Hospital where hid = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, ID);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                txtHid.setText(rs.getString("hid"));  
            }
            rs.close();
            ps.close();
            conn.close ();        
        } catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
            e.printStackTrace();
        }
     }
    
    public BloodSearching() {
        initComponents();
        
        initTableModel();
    }
    
    private void initTableModel() {
        String[] columnNames = new String[]{"Blood Stock ID", "Blood Type", "Volume", "Input Date", "Expiry Date", "Blood Bank"};
        
        tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(columnNames);
        tblResult.setModel(tblModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchPart = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnFind = new javax.swing.JButton();
        resultPart = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblResult = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        btnCancel = new javax.swing.JButton();
        btnOrder = new javax.swing.JButton();
        txtHid = new javax.swing.JLabel();
        buttonback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        searchPart.setBorder(javax.swing.BorderFactory.createTitledBorder("Search"));

        jLabel1.setText("Blood Group");

        btnFind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search-icon-24.png"))); // NOI18N
        btnFind.setText("Find");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout searchPartLayout = new javax.swing.GroupLayout(searchPart);
        searchPart.setLayout(searchPartLayout);
        searchPartLayout.setHorizontalGroup(
            searchPartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPartLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFind)
                .addContainerGap())
        );
        searchPartLayout.setVerticalGroup(
            searchPartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPartLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(searchPartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFind)
                    .addComponent(jLabel1))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        tblResult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblResult);

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Actions-edit-delete-icon-16.png"))); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/open-file-icon-16.png"))); // NOI18N
        btnOrder.setText("Order");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout resultPartLayout = new javax.swing.GroupLayout(resultPart);
        resultPart.setLayout(resultPartLayout);
        resultPartLayout.setHorizontalGroup(
            resultPartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, resultPartLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(resultPartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, resultPartLayout.createSequentialGroup()
                        .addComponent(btnOrder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancel)))
                .addContainerGap())
        );
        resultPartLayout.setVerticalGroup(
            resultPartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultPartLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(resultPartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnOrder))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtHid, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resultPart, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchPart, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonback)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonback, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchPart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultPart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHid, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        try {
            String conURL = "jdbc:sqlserver://localhost:1433;databaseName=PDMProject;user=sa;password=sa;encrypt=true;trustServerCertificate=true";
            Connection con = DriverManager.getConnection(conURL);
            
            String sql = "select BS.bsid, BS.blood_type, BS.volume, BS.input_date, BS.exp_date, B.bname from BloodStock BS, BloodBank B where BS.bid = B.bid and BS.isOrdered = 0 and BS.blood_type = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            
            String bloodGroup = txtSearch.getText();
            pstmt.setString(1, bloodGroup);
            ResultSet rs = pstmt.executeQuery();
            if (!rs.isBeforeFirst() && orderAll < 0) {
                JOptionPane.showMessageDialog(this, "Sorry!\n" + "We are out of blood type " + bloodGroup + "!");
            } else {
                tblModel.setRowCount(0);
                while (rs.next()) {
                    tblModel.addRow(new Object[]{
                        rs.getString("bsid"),
                        rs.getString("blood_type"),
                        rs.getInt("volume"),
                        rs.getDate("input_date"),
                        rs.getDate("exp_date"),
                        rs.getString("bname")
                    });
                }
                tblModel.fireTableDataChanged();
                orderAll = -1;
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        int[] selectedRows = tblResult.getSelectedRows();
        
        if (selectedRows[0] < 0) {
            return;
        }
        
        if (JOptionPane.showConfirmDialog(this, "Do you want to order these blood stocks?", 
                "Confirmation", JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION) {
            return;
        }
        
        try {
            String conURL = "jdbc:sqlserver://localhost:1433;databaseName=PDMProject;user=sa;password=sa;encrypt=true;trustServerCertificate=true";
            Connection con = DriverManager.getConnection(conURL);
            
            // Insert the selected blood stocks into the Ordered table
            String sqlInsert = "insert into Ordered(hid, bsid, orderDate) values (?, ?, ?)";
            PreparedStatement pstmt1 = con.prepareStatement(sqlInsert);
            
            for (int i = 0; i < selectedRows.length; i++) {
                // Get the hid of the current logged in hospital
                String hid = txtHid.getText();
                
                String bsid = (String) tblModel.getValueAt(selectedRows[i], 0);
                
                long mil = System.currentTimeMillis();
                Date orderDate = new Date(mil);
                
                pstmt1.setString(1, hid);
                pstmt1.setString(2, bsid);
                pstmt1.setDate(3, orderDate);
                
                pstmt1.executeUpdate();
            }
            
            // Change isOrdered = 1 for the selected blood stocks in the BloodStock table
            String sqlUpdate = "update BloodStock set isOrdered = 1 where bsid = ?";
            PreparedStatement pstmt2 = con.prepareStatement(sqlUpdate);
            
            for (int i = 0; i < selectedRows.length; i++) {
                String bsid = (String) tblModel.getValueAt(selectedRows[i], 0);
                
                pstmt2.setString(1, bsid);
                
                pstmt2.executeUpdate();
            }
            
            // Prevent the "run out of" dialog when hospital order all of blood stocks
            if (tblModel.getRowCount() == selectedRows.length) {
                orderAll = 1;
            }
            
            btnFindActionPerformed(evt);
            JOptionPane.showMessageDialog(this, "The blood stocks ordered successfully!");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnOrderActionPerformed

    private void buttonbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonbackActionPerformed
        // TODO add your handling code here:
        String ID = txtHid.getText();
         HospitalUI hos= new HospitalUI(ID);
         hos.setVisible(true);
         hos.setLocationRelativeTo(null);
         hos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.dispose();

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
            java.util.logging.Logger.getLogger(BloodSearching.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BloodSearching.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BloodSearching.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BloodSearching.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BloodSearching().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnOrder;
    private javax.swing.JButton buttonback;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel resultPart;
    private javax.swing.JPanel searchPart;
    private javax.swing.JTable tblResult;
    private javax.swing.JLabel txtHid;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}