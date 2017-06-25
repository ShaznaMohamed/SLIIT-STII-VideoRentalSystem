/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videorentalsystem;

import java.awt.*;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Dishan
 */
public class Password extends javax.swing.JFrame {
    
    Connection con = null;
    PreparedStatement pst = null;
    PreparedStatement pst2 = null;
    ResultSet rs=null;

    public Password() {
        
        initComponents();        
        
        getContentPane().setBackground(new java.awt.Color(255,255,255));
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        
        con = dbconnect.connect(); 
    }
    
    private void reset(){
            
        String password=null;        
        
        char[] c666 = t2.getPassword();
        String npassword = new String(c666);
        
        char[] c777 = t1.getPassword();
        String opassword = new String(c777);
        
        int pcid=0;        
        Login loginn = new Login();
        pcid=loginn.lcid ;
        
        String sql = "SELECT password from cust where cid='"+pcid+"'";
        String sql2 = "UPDATE cust SET password ='"+npassword+"' WHERE cid='"+pcid+"'";
        
        try{                     
                        
            pst = con.prepareStatement(sql);
            rs=pst.executeQuery();
            
            if(rs.next()){
                
                password=(String)rs.getObject("password"); 
 
            }
            
            
            if(opassword.equals(password)){
                
                pst2 = con.prepareStatement(sql2);
                pst2.executeUpdate();
                
                JOptionPane.showMessageDialog(null," Password Successflly Updated ");
  
            }
            
            else{
                JOptionPane.showMessageDialog(null," Please check your current password! ");
            }
            
        }
        
        catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        l1 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        l2 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        t1 = new javax.swing.JPasswordField();
        t2 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 255));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        b1.setBackground(new java.awt.Color(192, 57, 43));
        b1.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        b1.setForeground(new java.awt.Color(192, 57, 43));
        b1.setText("Update");
        b1.setBorder(null);
        b1.setBorderPainted(false);
        b1.setContentAreaFilled(false);
        b1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        b2.setForeground(new java.awt.Color(192, 57, 43));
        b2.setText("Back");
        b2.setBorderPainted(false);
        b2.setContentAreaFilled(false);
        b2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        l1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        l1.setText("Current Password");

        l3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        l3.setText("New Password");

        jPanel1.setBackground(new java.awt.Color(192, 57, 43));
        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));

        l2.setFont(new java.awt.Font("Calibri", 0, 48)); // NOI18N
        l2.setForeground(new java.awt.Color(255, 255, 255));
        l2.setText("Update Password");

        l4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/videorentalsystem/Images/Untitled-1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(l2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 317, Short.MAX_VALUE)
                .addComponent(l4)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(l2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(l4)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        t1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        t2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/videorentalsystem/Images/pass1.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1304, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(l3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(l1)))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(t2)
                        .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(165, 165, 165)
                        .addComponent(b1)))
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(l1)
                            .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l3))
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b1)
                            .addComponent(b2)))
                    .addComponent(jLabel1))
                .addContainerGap(168, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        
        reset();

    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed

        Welcome wel = new Welcome();
        wel.setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_b2ActionPerformed

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
            java.util.logging.Logger.getLogger(Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Password().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JPasswordField t1;
    private javax.swing.JPasswordField t2;
    // End of variables declaration//GEN-END:variables
}
