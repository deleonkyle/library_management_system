/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication2;
        
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Registration extends javax.swing.JFrame {
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public Registration() {
        initComponents();
        setIcon();
        conn = DBConnect.ConnecrDb();
        setTitle("Login");
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
        jLabel2 = new javax.swing.JLabel();
        jtxtUsername = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtxtpass = new javax.swing.JTextField();
        jtxtFname = new javax.swing.JTextField();
        jtxtLname = new javax.swing.JTextField();
        jtxtAge = new javax.swing.JTextField();
        jtxtAddress = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jbtnRegister = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(1, 30, 117));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 209, 18));
        jLabel2.setText("Password:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 100, 30));

        jtxtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtUsernameActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 140, 30));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 209, 18));
        jLabel8.setText("Add Account...");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 210, -1));

        jtxtpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtpassActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 140, 30));
        jPanel1.add(jtxtFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 220, 30));

        jtxtLname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtLnameActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtLname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 220, 30));
        jPanel1.add(jtxtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 90, 30));

        jtxtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtAddressActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 220, 30));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 209, 18));
        jLabel1.setText("First Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 110, 30));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 209, 18));
        jLabel4.setText("Last Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 110, 30));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 209, 18));
        jLabel5.setText("Age");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 100, 30));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 209, 18));
        jLabel6.setText("Address");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 120, 30));

        jButton1.setBackground(new java.awt.Color(255, 209, 18));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\kris\\Downloads\\BACK.png")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 38, 38));

        jbtnRegister.setBackground(new java.awt.Color(255, 209, 18));
        jbtnRegister.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jbtnRegister.setForeground(new java.awt.Color(255, 4, 0));
        jbtnRegister.setText("Register");
        jbtnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegisterActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 240, 80));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 209, 18));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Username:");
        jLabel3.setToolTipText("");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 110, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtpassActionPerformed

    private void jtxtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtUsernameActionPerformed

    private void jtxtLnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtLnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtLnameActionPerformed

    private void jtxtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtAddressActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Login ob = new Login();
        ob.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbtnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegisterActionPerformed
        if ( jtxtUsername.getText().isEmpty() || jtxtpass.getText().isEmpty() ){
            JOptionPane.showMessageDialog(null, "The fields cannot be left blank.", "Message" , JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            try{
                String sql = "INSERT INTO admin"
                + "(FirstName, LastName, Age, Address, Username, Password)"
                + "VALUES (?,?,?,?,?,?)";
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management_system","root","root");
                pst = conn.prepareStatement(sql);

                pst.setString(1, jtxtFname.getText());
                pst.setString(2, jtxtLname.getText());
                pst.setString(3, jtxtAge.getText());
                pst.setString(4, jtxtAddress.getText());
                pst.setString(5, jtxtUsername.getText());
                pst.setString(6, jtxtpass.getText());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Account Registered!");
                Login ob = new Login();
                ob.setVisible(true);
                this.dispose();
            }
            catch(HeadlessException | SQLException ex){
                JOptionPane.showMessageDialog(null, ex);
            }

        }
    }//GEN-LAST:event_jbtnRegisterActionPerformed

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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnRegister;
    private javax.swing.JTextField jtxtAddress;
    private javax.swing.JTextField jtxtAge;
    private javax.swing.JTextField jtxtFname;
    private javax.swing.JTextField jtxtLname;
    private javax.swing.JTextField jtxtUsername;
    private javax.swing.JTextField jtxtpass;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
     setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("user.png")));   
    }
}
