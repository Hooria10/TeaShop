/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chaiLo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class SignUp extends javax.swing.JFrame {
    
    Connection con;
   


    /**
     * Creates new form SignUp
     */
    public SignUp() throws SQLException {
        initComponents();
    String url = "jdbc:sqlserver://DESKTOP-4BJ54QM;databaseName=MasalaChai;integratedSecurity=true;encrypt=true;trustServerCertificate=true;";
       this. con = DriverManager.getConnection(url);
        System.out.println(con);
//        DefaultTableModel mod = new DefaultTableModel();
        
    } 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        clearbutton = new javax.swing.JButton();
        backbutton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        emailtxt = new javax.swing.JTextField();
        phonenotxt = new javax.swing.JTextField();
        usernametxt = new javax.swing.JTextField();
        passwordtxt = new javax.swing.JPasswordField();
        agebox = new javax.swing.JCheckBox();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("MV Boli", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(232, 232, 232));
        jLabel1.setText("Chai Lo");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 180, -1));

        jPanel1.setBackground(new java.awt.Color(89, 64, 49));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(61, 45, 45), 2, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(61, 45, 45));
        jButton2.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 204, 204));
        jButton2.setText("Sign Up");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, 170, 40));

        clearbutton.setBackground(new java.awt.Color(61, 45, 45));
        clearbutton.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N
        clearbutton.setForeground(new java.awt.Color(204, 204, 204));
        clearbutton.setText("clear");
        clearbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(clearbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, -1));

        backbutton.setBackground(new java.awt.Color(61, 45, 45));
        backbutton.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N
        backbutton.setForeground(new java.awt.Color(204, 204, 204));
        backbutton.setText("back");
        jPanel1.add(backbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, -1, -1));

        jButton1.setBackground(new java.awt.Color(61, 45, 45));
        jButton1.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setText("already have an account?");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 510, -1, -1));

        jLabel6.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(232, 232, 232));
        jLabel6.setText("Sign Up");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel7.setFont(new java.awt.Font("Ebrima", 1, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(232, 232, 232));
        jLabel7.setText("email:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel8.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(232, 232, 232));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        emailtxt.setBackground(new java.awt.Color(89, 64, 49));
        emailtxt.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        emailtxt.setForeground(new java.awt.Color(204, 204, 204));
        emailtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailtxtActionPerformed(evt);
            }
        });
        jPanel1.add(emailtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 220, 40));

        phonenotxt.setBackground(new java.awt.Color(89, 64, 49));
        phonenotxt.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        phonenotxt.setForeground(new java.awt.Color(204, 204, 204));
        phonenotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonenotxtActionPerformed(evt);
            }
        });
        jPanel1.add(phonenotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 220, 40));

        usernametxt.setBackground(new java.awt.Color(89, 64, 49));
        usernametxt.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        usernametxt.setForeground(new java.awt.Color(204, 204, 204));
        usernametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernametxtActionPerformed(evt);
            }
        });
        jPanel1.add(usernametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 220, 40));

        passwordtxt.setBackground(new java.awt.Color(89, 64, 49));
        passwordtxt.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jPanel1.add(passwordtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 158, 220, 40));

        agebox.setBackground(new java.awt.Color(89, 64, 49));
        agebox.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        agebox.setForeground(new java.awt.Color(204, 204, 204));
        agebox.setText("are you older than 4 years? ");
        agebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageboxActionPerformed(evt);
            }
        });
        jPanel1.add(agebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 320, 30));

        jComboBox1.setBackground(new java.awt.Color(51, 51, 51));
        jComboBox1.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(204, 204, 204));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hyderabad", "Karachi ", "Lahore", "Rawalpindi", "Islamabad", "Faisalabad", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 120, -1));

        jLabel11.setFont(new java.awt.Font("Ebrima", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(232, 232, 232));
        jLabel11.setText("contact no:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 160, -1));

        jLabel13.setFont(new java.awt.Font("Ebrima", 1, 22)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(232, 232, 232));
        jLabel13.setText("city:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 50, -1));

        jLabel14.setFont(new java.awt.Font("Ebrima", 1, 22)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(232, 232, 232));
        jLabel14.setText("username:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel15.setFont(new java.awt.Font("Ebrima", 1, 22)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(232, 232, 232));
        jLabel15.setText("username:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel16.setFont(new java.awt.Font("Ebrima", 1, 22)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(232, 232, 232));
        jLabel16.setText("username:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel17.setFont(new java.awt.Font("Ebrima", 1, 22)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(232, 232, 232));
        jLabel17.setText("password:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 380, 570));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo_2.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -130, 250, 330));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/coffee-cup-cup-drink-beverage.jpg"))); // NOI18N
        jLabel12.setText("jLabel4");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 820, 980));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 690));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/coffee-cup-cup-drink-beverage.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 830, 690));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
      public String emailPattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";
        public void clear(){
        usernametxt.setText("");
        passwordtxt.setText("");
        emailtxt.setText(""); 
        phonenotxt.setText("");
        
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            // TODO add your handling code here:
            String username = usernametxt.getText();
            String password = passwordtxt.getText();
            String email = emailtxt.getText();
            String contact = phonenotxt.getText();
            String city = jComboBox1.getSelectedItem().toString();
            String querySignUp = "insert into member (m_name, m_pass, m_no,m_email,city) values ('"+username+" ','"+password+" ',' "+contact+" ' , '"+email+" ', '"+city+" ' )";
            Statement st = con.createStatement();

    if (usernametxt.getText().equals("") || passwordtxt.getText().equals("") || emailtxt.getText().equals("") ){
        JOptionPane.showMessageDialog(rootPane, "Please enter your details first");
    } 
   else if (!email.matches(emailPattern)) {
        JOptionPane.showMessageDialog(rootPane, "Please enter a valid email");
    }
   else if (!agebox.isSelected()){
       JOptionPane.showMessageDialog(rootPane, "You must be older than 4 years to purchase our Chai");
   }
    else {
    
        JOptionPane.showMessageDialog(rootPane, "You have signed in. Welcome to Chai Lo");
                    st.executeUpdate(querySignUp);

        HomePage home = new HomePage();
        home.setVisible(true);
        setVisible(false);
        
   }
    
    }
     catch ( SQLException ex) {
          System.out.println(ex.getMessage());       
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void emailtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailtxtActionPerformed

    private void phonenotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonenotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phonenotxtActionPerformed

    private void usernametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernametxtActionPerformed

    private void ageboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageboxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            LogIn loginform = new LogIn();
            loginform.setVisible(true);
            
            setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
        }
               
    }//GEN-LAST:event_jButton1ActionPerformed

    private void clearbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbuttonActionPerformed
        // TODO add your handling code here:
         clear();
        
    }//GEN-LAST:event_clearbuttonActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed
   
    
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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new SignUp().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox agebox;
    private javax.swing.JButton backbutton;
    private javax.swing.JButton clearbutton;
    private javax.swing.JTextField emailtxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JPasswordField passwordtxt;
    private javax.swing.JTextField phonenotxt;
    public static javax.swing.JTextField usernametxt;
    // End of variables declaration//GEN-END:variables
}
