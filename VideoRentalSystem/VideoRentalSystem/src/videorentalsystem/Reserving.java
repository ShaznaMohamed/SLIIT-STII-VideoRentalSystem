package videorentalsystem;

import javax.swing.*;
import java.sql.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import net.sf.jasperreports.view.*;
import net.sf.jasperreports.engine.*;
import javax.swing.table.DefaultTableModel;


 

public class Reserving extends javax.swing.JFrame {

     Connection conn = null;
     PreparedStatement pst = null;

    public Reserving() {
          initComponents();
          conn=dbconnect.connect(); 
          
          getContentPane().setBackground(new java.awt.Color(255,255,255));
          Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
          this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        l2 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Rent = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        checkprice = new javax.swing.JButton();
        sname = new javax.swing.JTextField();
        snoofdays = new javax.swing.JTextField();
        snoofcopies = new javax.swing.JTextField();
        backbutton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton1_viewtable = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        l3 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1_movie = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(192, 57, 43));
        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 720));

        l2.setFont(new java.awt.Font("Calibri", 0, 48)); // NOI18N
        l2.setForeground(new java.awt.Color(255, 255, 255));
        l2.setText("Customers");

        l4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/videorentalsystem/Images/Untitled-1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(l2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 450, Short.MAX_VALUE)
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setText("Selected Video");

        Rent.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        Rent.setForeground(new java.awt.Color(192, 57, 43));
        Rent.setText("Rent");
        Rent.setBorder(null);
        Rent.setContentAreaFilled(false);
        Rent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Rent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RentActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setText("Renting number of days from today");

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel5.setText("Number of Copies");

        checkprice.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        checkprice.setForeground(new java.awt.Color(192, 57, 43));
        checkprice.setText("Check Price");
        checkprice.setBorder(null);
        checkprice.setContentAreaFilled(false);
        checkprice.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkpriceActionPerformed(evt);
            }
        });

        sname.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        sname.setText(" ");
        sname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snameActionPerformed(evt);
            }
        });

        snoofdays.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        snoofcopies.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        backbutton.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        backbutton.setForeground(new java.awt.Color(192, 57, 43));
        backbutton.setText("Back");
        backbutton.setBorder(null);
        backbutton.setContentAreaFilled(false);
        backbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setText("* You will have a Discount for entering more than 5 copies");

        jButton1_viewtable.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jButton1_viewtable.setForeground(new java.awt.Color(192, 57, 43));
        jButton1_viewtable.setText("View video data table");
        jButton1_viewtable.setBorder(null);
        jButton1_viewtable.setContentAreaFilled(false);
        jButton1_viewtable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1_viewtable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_viewtableActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(192, 57, 43));
        jPanel2.setMinimumSize(new java.awt.Dimension(1280, 720));

        l3.setFont(new java.awt.Font("Calibri", 0, 48)); // NOI18N
        l3.setForeground(new java.awt.Color(255, 255, 255));
        l3.setText("Reservation");

        l5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/videorentalsystem/Images/Untitled-1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(l3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(l5))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(l3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(l5)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTable1_movie.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jTable1_movie.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane3.setViewportView(jTable1_movie);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(470, 470, 470)
                        .addComponent(jButton1_viewtable))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jLabel6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 164, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(snoofcopies, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                            .addComponent(snoofdays)
                            .addComponent(sname, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(checkprice)
                                .addGap(159, 159, 159)
                                .addComponent(Rent))
                            .addComponent(backbutton, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(snoofdays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(snoofcopies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(120, 120, 120)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checkprice)
                            .addComponent(Rent)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1_viewtable)
                            .addComponent(backbutton))
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RentActionPerformed
   
        
        
        int d =JOptionPane.showConfirmDialog(null, "Do you want to select more videos");
        if (d == 0)
        {
        Reserving t = new Reserving();    
        t.setVisible(true);
        this.dispose();
        }
        else
        {
        Pay a = new Pay();    
        a.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_RentActionPerformed

    public void calculates(){
    
            int llc=0;
            int ac1;     

            Login loginn = new Login();
            llc=loginn.lcid ; // id of the user who is searching 

            AvailableGUI av = new AvailableGUI();
            ac1=av.vidd ; // video id of the search result*/
            
        
        
            String s1 = sname.getText(); 
            int i =Integer.parseInt(snoofdays.getText());
            int r =Integer.parseInt(snoofcopies.getText());
               
        try{
            
            Integer rate=0;
            
             Statement s = conn.createStatement();
             String search="SELECT rate as 'rate' from movie where title like '%"+s1+"%' ";
            
             ResultSet  rs = s.executeQuery(search);
             
             
             if(rs.next()){
                rate = (Integer)rs.getObject("rate");                
             } 
                                 
            rs.close();
            s.close();
            
            int f = rate;
            Video bq  =  new Video(f);
            double total = bq.calctotal(i,r);            
                       
            double  discount = bq.calcdiscount(r);
            JOptionPane.showMessageDialog(null,"You will have a discount of Rs "+ discount + "\n" + "Total Rental Price for your selection is Rs " + total  );
          
            int cusid = llc;
            String h = "insert into reservation( name , total, noofdays, cid, noofcopies, vid ) values('"+s1+"','"+total+"','"+i+"','"+llc+"','"+r+"','"+ac1+"')";
            pst = conn.prepareStatement(h);
            pst.execute();
          //  conn.close();
     }
            catch (SQLException err) 
        {
             JOptionPane.showMessageDialog(null,"ERROR: " + err);
        }
         catch(Exception w)
        {
            JOptionPane.showMessageDialog(null, w);       
        }
    
    }
    
    
    private void checkpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkpriceActionPerformed
        calculates();
           
    }//GEN-LAST:event_checkpriceActionPerformed

    private void snameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snameActionPerformed

    }//GEN-LAST:event_snameActionPerformed

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        // TODO add your handling code here:
        AvailableGUI f = new AvailableGUI();    
        f.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_backbuttonActionPerformed

    private void jButton1_viewtableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_viewtableActionPerformed
        // TODO add your handling code here:
        
         try{  
           Statement st  = conn.createStatement();
            String out = "select * from movie";
            ResultSet result =st.executeQuery(out);
            
            DefaultTableModel mod = (DefaultTableModel)jTable1_movie.getModel();
            if (result != null)
            {
                while(result.next())
                {
                    String name1=result.getString("title");
                    double rate1 = result.getDouble("rate");
                    mod .addRow(new Object[]{name1,rate1});
                }
            }
          }
          catch (Exception exept)
          {
              JOptionPane.showMessageDialog(null, exept);
          }
    }//GEN-LAST:event_jButton1_viewtableActionPerformed

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
            java.util.logging.Logger.getLogger(Reserving.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reserving.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reserving.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reserving.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       
           
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reserving().setVisible(true);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Rent;
    private javax.swing.JButton backbutton;
    private javax.swing.JButton checkprice;
    private javax.swing.JButton jButton1_viewtable;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1_movie;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JTextField sname;
    private javax.swing.JTextField snoofcopies;
    private javax.swing.JTextField snoofdays;
    // End of variables declaration//GEN-END:variables
}
