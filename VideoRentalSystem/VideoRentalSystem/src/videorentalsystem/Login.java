/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videorentalsystem;

import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Dishan
 */
public class Login extends javax.swing.JFrame {
    
    public static int lcid; 
    
    Connection con = null;
    PreparedStatement pst = null;
    PreparedStatement pst2 = null;
    ResultSet rs=null;
    ResultSet rs2=null;
    
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        
        getContentPane().setBackground(new java.awt.Color(192, 57, 43));
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        
        con = dbconnect.connect();
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
        email = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        submitadmin = new javax.swing.JButton();
        register = new javax.swing.JButton();
        Logo = new javax.swing.JLabel();
        submit1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(192, 57, 43));
        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 720));

        email.setBackground(new java.awt.Color(192, 57, 43));
        email.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        email.setText("e-mail");
        email.setToolTipText("");
        email.setBorder(null);
        email.setName("e-mail"); // NOI18N
        email.setSelectionColor(new java.awt.Color(255, 255, 255));
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        password.setBackground(new java.awt.Color(192, 57, 43));
        password.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password.setText("password");
        password.setBorder(null);

        submitadmin.setBackground(new java.awt.Color(192, 57, 43));
        submitadmin.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        submitadmin.setForeground(new java.awt.Color(255, 255, 255));
        submitadmin.setText("Administrator");
        submitadmin.setBorder(null);
        submitadmin.setBorderPainted(false);
        submitadmin.setContentAreaFilled(false);
        submitadmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        submitadmin.setFocusPainted(false);
        submitadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitadminActionPerformed(evt);
            }
        });

        register.setBackground(new java.awt.Color(192, 57, 43));
        register.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        register.setForeground(new java.awt.Color(255, 255, 255));
        register.setText("New customer? Register Here.");
        register.setBorder(null);
        register.setBorderPainted(false);
        register.setContentAreaFilled(false);
        register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        register.setFocusPainted(false);
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/videorentalsystem/Images/Untitled-1.png"))); // NOI18N

        submit1.setBackground(new java.awt.Color(192, 57, 43));
        submit1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        submit1.setForeground(new java.awt.Color(255, 255, 255));
        submit1.setText("login");
        submit1.setBorder(null);
        submit1.setBorderPainted(false);
        submit1.setContentAreaFilled(false);
        submit1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        submit1.setFocusPainted(false);
        submit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(351, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Logo)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(submitadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(151, 151, 151))
                    .addComponent(submit1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(331, 331, 331))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(184, Short.MAX_VALUE)
                .addComponent(Logo)
                .addGap(83, 83, 83)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(submit1)
                .addGap(18, 18, 18)
                .addComponent(register)
                .addGap(18, 18, 18)
                .addComponent(submitadmin)
                .addGap(107, 107, 107))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void login(){
        
        String sql="SELECT email,password FROM cust WHERE email=? AND password=?";
        String sql2="SELECT cid FROM cust WHERE email=?";
        
        try{
            
            pst = con.prepareStatement(sql);
            pst.setString(1, email.getText());
            pst.setString(2, password.getText());
            rs=pst.executeQuery();
            
            pst2 = con.prepareStatement(sql2);
            pst2.setString(1, email.getText());
            rs2=pst2.executeQuery();
            if(rs2.next()){
                lcid = (Integer) rs2.getObject("cid");                
            }
                        
                        
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Successfully logged in");
                
                Welcome wl = new Welcome();
                wl.setVisible(true);
                this.dispose();                
            }
            
            else{
                JOptionPane.showMessageDialog(null, " Invalid login, please try again. ");
            }            
            
        }
        
        catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed

    }//GEN-LAST:event_emailActionPerformed

    private void submitadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitadminActionPerformed

        
        AdminLogin ad = new AdminLogin();
        ad.setVisible(true);
        this.dispose();
        
        
    }//GEN-LAST:event_submitadminActionPerformed

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        Registration registration = new Registration();
        registration.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_registerActionPerformed

    private void submit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit1ActionPerformed
            login();
    }//GEN-LAST:event_submit1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JTextField email;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton register;
    private javax.swing.JButton submit1;
    private javax.swing.JButton submitadmin;
    // End of variables declaration//GEN-END:variables
}
