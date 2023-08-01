/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chaiLo;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author PC
 */
public class Bakery extends javax.swing.JFrame {

    /**
     * Creates new form Bakery
     */
    public Bakery() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        remove = new javax.swing.JButton();
        back = new javax.swing.JButton();
        submit = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jSpinner3 = new javax.swing.JSpinner();
        jSpinner4 = new javax.swing.JSpinner();
        order = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        back1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo_2.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 70, 90));

        jLabel1.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(232, 232, 232));
        jLabel1.setText("Chai Lo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 180, -1));

        jPanel2.setBackground(new java.awt.Color(153, 68, 26));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(61, 45, 45), 2, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        remove.setBackground(new java.awt.Color(153, 68, 26));
        remove.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N
        remove.setForeground(new java.awt.Color(204, 204, 204));
        remove.setText("remove");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        jPanel2.add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 520, -1, 40));

        back.setBackground(new java.awt.Color(153, 68, 26));
        back.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        back.setForeground(new java.awt.Color(204, 204, 204));
        back.setText("Home");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel2.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, -1, 40));

        submit.setBackground(new java.awt.Color(153, 68, 26));
        submit.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        submit.setForeground(new java.awt.Color(204, 204, 204));
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel2.add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 170, 40));

        jSpinner1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jSpinner1.setToolTipText("");
        jPanel2.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 50, 40));

        jCheckBox1.setBackground(new java.awt.Color(89, 64, 49));
        jCheckBox1.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(204, 204, 204));
        jCheckBox1.setText("Zeera Biscuit");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 170, 30));

        jCheckBox2.setBackground(new java.awt.Color(89, 64, 49));
        jCheckBox2.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(204, 204, 204));
        jCheckBox2.setText("Naan Khatai");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 270, 30));

        jCheckBox3.setBackground(new java.awt.Color(89, 64, 49));
        jCheckBox3.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        jCheckBox3.setForeground(new java.awt.Color(204, 204, 204));
        jCheckBox3.setText("Candi biscuit");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 270, 30));

        jCheckBox4.setBackground(new java.awt.Color(89, 64, 49));
        jCheckBox4.setFont(new java.awt.Font("Gabriola", 1, 22)); // NOI18N
        jCheckBox4.setForeground(new java.awt.Color(204, 204, 204));
        jCheckBox4.setText("Cake Rusks");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 270, 30));

        jLabel7.setFont(new java.awt.Font("Gabriola", 1, 27)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(232, 232, 232));
        jLabel7.setText("Your items: ");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, 260, 40));

        jSpinner2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jSpinner2.setToolTipText("");
        jPanel2.add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 50, 40));

        jLabel8.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(232, 232, 232));
        jLabel8.setText("Quantity:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 100, -1));

        jSpinner3.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jSpinner3.setToolTipText("");
        jPanel2.add(jSpinner3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 50, 40));

        jSpinner4.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jSpinner4.setToolTipText("");
        jPanel2.add(jSpinner4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 50, 40));

        order.setBackground(new java.awt.Color(153, 68, 26));
        order.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        order.setForeground(new java.awt.Color(204, 204, 204));
        order.setText("Order");
        order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderActionPerformed(evt);
            }
        });
        jPanel2.add(order, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 520, 170, 40));

        jButton5.setBackground(new java.awt.Color(153, 68, 26));
        jButton5.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(204, 204, 204));
        jButton5.setText("Log Out");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 110, 40));

        jLabel11.setFont(new java.awt.Font("Gabriola", 1, 27)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(232, 232, 232));
        jLabel11.setText("Select the perfect pair with your chai: ");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 360, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Biscuit", "Quantity", "Cost"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 310, 330));

        area.setBackground(new java.awt.Color(89, 64, 49));
        area.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jScrollPane2.setViewportView(area);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, 310, 110));

        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("1 packet - 20 rs");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("1 packet - 10 rs");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, -1, -1));

        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("1 packet - 20 rs");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("1 packet - 20 rs");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, -1, -1));

        jLabel17.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(232, 232, 232));
        jLabel17.setText("Quantity:");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 100, -1));

        jLabel18.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(232, 232, 232));
        jLabel18.setText("Quantity:");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 100, -1));

        jLabel19.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(232, 232, 232));
        jLabel19.setText("Quantity:");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 100, -1));

        jButton1.setText("Change User Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, -1, -1));

        back1.setBackground(new java.awt.Color(153, 68, 26));
        back1.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        back1.setForeground(new java.awt.Color(204, 204, 204));
        back1.setText("Go To Chai");
        back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back1ActionPerformed(evt);
            }
        });
        jPanel2.add(back1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 520, 180, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 1020, 650));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bisskut2.jpg"))); // NOI18N
        jLabel13.setToolTipText("");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 850, 730, 320));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Rusk-Recipe-2.jpg"))); // NOI18N
        jLabel14.setToolTipText("");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 620, 660, 550));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bisskut2.jpg"))); // NOI18N
        jLabel15.setText("jLabel13");
        jLabel15.setToolTipText("");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -60, 750, 1000));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Rusk-Recipe-2.jpg"))); // NOI18N
        jLabel16.setToolTipText("");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, -320, 670, 1000));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1319, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
           boolean submitted=false;
           boolean summ = true;
public void getSum(){
    int sum =0;
    for (int i=0; i< jTable1.getRowCount(); i++){
        sum = sum +Integer.parseInt(jTable1.getValueAt(i, 2).toString());
    }
    area.setText("Total amount: " + Integer.toString(sum));
     submitted = true;
     if (sum==0){
         summ = false;
     }
     else if (sum>0){
         summ = true;
     }
}


    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        if (jTable1.getSelectedRowCount()==1){
            model.removeRow(jTable1.getSelectedRow());

        }
        else if (jTable1.getSelectedRowCount()==0){
            JOptionPane.showMessageDialog(rootPane, "Please select an item first");
        }
        getSum();
    }//GEN-LAST:event_removeActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        HomePage home = new HomePage();
        home.setVisible(true);
        setVisible(false);

    }//GEN-LAST:event_backActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:\

        if (jCheckBox3.isSelected()){
            int sp = Integer.parseInt(jSpinner2.getValue().toString());
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.addRow(new Object[]{ jCheckBox3.getText(), sp, 20*sp });
        }

        if (jCheckBox4.isSelected()){
            int sp = Integer.parseInt(jSpinner3.getValue().toString());

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.addRow(new Object[]{
                jCheckBox4.getText(), sp, 20*sp });

        }
        if (jCheckBox2.isSelected()){
            int sp = Integer.parseInt(jSpinner4.getValue().toString());

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.addRow(new Object[]{
                jCheckBox2.getText(), sp, 20*sp });

        }
        if (jCheckBox1.isSelected()){
            int sp = Integer.parseInt(jSpinner1.getValue().toString());
            int cost = 10*sp;
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.addRow(new Object[]{
                jCheckBox1.getText(), sp, cost });

        }
           if (!jCheckBox1.isSelected() && !jCheckBox2.isSelected() &&  !jCheckBox4.isSelected() &&  !jCheckBox3.isSelected() ){
              JOptionPane.showMessageDialog(rootPane, "Please select a biscuit first");
           }
           
           getSum();
          
        jSpinner1.setValue(0);   jSpinner2.setValue(0);
        jSpinner3.setValue(0);
        jSpinner4.setValue(0);

        //
        //        area.setText(area.getText()+"-----------------------------------------------------\n");
        //        area.setText(area.getText()+"------------------------------ Your Bill -----------------------------\n");
        //        area.setText(area.getText()+"-------------------------------------------------------------------------\n\n");

        //        area.setText(area.getText()+"-----------------------------------------------------\n");
        //        area.setText(area.getText()+"qty                    Name                      Cost"+"\n");
        //        area.setText(area.getText()+"-----------------------------------------------------\n");
        //
        //        int sp = Integer.parseInt(jSpinner2.getValue().toString());
        //        if(jCheckBox3.isSelected() == true){
            //        area.setText(area.getText()+sp);
            //        }else{
            //            JOptionPane.showMessageDialog(this, " Select a chai");
            //        }
    }//GEN-LAST:event_submitActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void orderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderActionPerformed
        // TODO add your handling code here:
        if (submitted == false){
            JOptionPane.showMessageDialog(rootPane, "Please submit something before ordering.");
        }
        else if (summ == false){
                        JOptionPane.showMessageDialog(rootPane, "You have not bought anything yet.");

        }
        else {
        JOptionPane.showMessageDialog(rootPane, "Your order has been placed. Thanks for Ordering.");
        }
    }//GEN-LAST:event_orderActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:

        int selectedOption = JOptionPane.showConfirmDialog(null,
            "Do you want to log out?",
            "Log Out",
            JOptionPane.YES_NO_OPTION);
        if (selectedOption == JOptionPane.YES_OPTION) {
            try {
                LogIn login = new LogIn();
                login.setVisible(true);
                setVisible(false);
            } catch (SQLException ex) {
                Logger.getLogger(Bakery.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            UserDetails ud = new UserDetails();
            ud.setVisible(true);
            setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(Bakery.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back1ActionPerformed
        // TODO add your handling code here:
       SHop2 s = new SHop2 ();
        s.setVisible(true);

    }//GEN-LAST:event_back1ActionPerformed

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
            java.util.logging.Logger.getLogger(Bakery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bakery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bakery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bakery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bakery().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane area;
    private javax.swing.JButton back;
    private javax.swing.JButton back1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton order;
    private javax.swing.JButton remove;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
