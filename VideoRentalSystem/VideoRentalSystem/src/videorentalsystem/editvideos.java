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
//import net.proteanit.sql.DbUtils;
import videorentalsystem.ireports.generateReport;

/**
 *
 * @author Dishan
 */
public class editvideos extends javax.swing.JFrame {
    
    Connection con = null;
    PreparedStatement pst = null;
    PreparedStatement pstt = null;
    ResultSet rss=null;
    PreparedStatement psttt = null;
    ResultSet rsss=null;
    PreparedStatement pstttt = null;
    ResultSet rssss=null;
    PreparedStatement pst1 = null;
    ResultSet rs1=null;

    public editvideos() {
        
        initComponents();        
        
        getContentPane().setBackground(new java.awt.Color(255,255,255));
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        
        con = dbconnect.connect(); 
        
        tabledata();
    }
    
    private void tabledata(){
        
        String sqll = "SELECT * from video";
        
        try{
            pstt=con.prepareStatement(sqll);
            rss=pstt.executeQuery(sqll);
           // tablev.setModel(DbUtils.resultSetToTableModel(rss));
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        

    }
    
    private void getdata(){
        
        int vvid = Integer.parseInt(e1.getText());
    
        try{
            Connection c = dbconnect.connect();
            Statement s=c.createStatement();
            
            String search="SELECT TITLE,LANGUAGE,DESCRIPTION from video where vid='"+vvid+"'";
            
            ResultSet r=s.executeQuery(search);
            
            if(r.next())
            {
                   
                   String lang=r.getString("LANGUAGE");                   
                   String tit=r.getString("TITLE");
                   String des=r.getString("DESCRIPTION");
                   
                   e2.setText(tit);
                   e3.setText(lang);
                   e4.setText(des);  
            }
        }
        
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }    
    
    private void updatedata(){
        
        int vvid = Integer.parseInt(e1.getText());  
        
        String T1=e2.getText();
        String L1=e3.getText();
        String D1=e4.getText();
        
        String sql2 = "UPDATE video SET TITLE='"+T1+"', LANGUAGE='"+L1+"', DESCRIPTION='"+D1+"' WHERE VID='"+vvid+"'";
        
        try{  
            
            pstt = con.prepareStatement(sql2);
            pstt.executeUpdate();
                
            JOptionPane.showMessageDialog(null," Successflly Updated ");
        }
        
        catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    
    private void deleteinfo(){
    
                int s = Integer.parseInt(d1.getText()); 
                
                String del = "delete from video where VID = '"+s+"' ";
                
                try{
                   psttt = con.prepareStatement(del);
                   psttt.execute();
                    JOptionPane.showMessageDialog(null, " Successfully Deleted");
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, e);
                } 
    }
    
    
private void edit(){
    
        int vvid = Integer.parseInt(v1.getText());  
        
        String V1=v2.getText();
        
        String sql2 = "UPDATE video SET STATUS='"+V1+"' WHERE VID='"+vvid+"'";
        
        try{  
            
            pstttt = con.prepareStatement(sql2);
            pstttt.executeUpdate();
                
            JOptionPane.showMessageDialog(null," Successflly Updated ");
        }
        
        catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

private void addrate(){
    
    try{ 
            int r11=Integer.parseInt(r1.getText());
            String c111 = a1.getText();
        
            String qq = "INSERT INTO movie (title,rate) values ('"+c111+"','"+r11+"')";        
            pst1 = con.prepareStatement(qq);
            pst1.execute();
        }
        
        catch(Exception s){
            System.out.println(s.getMessage());
        }
    
    
    
}

private void addnew(){  
    
        try{
        
        String c11 = a1.getText();
        String c22 = a2.getText();        
        String c33 = a3.getText();
        String c44 = a4.getText(); 
        
         String q = "INSERT INTO video (TITLE,LANGUAGE,STATUS,DESCRIPTION) values ('"+c11+"','"+c22+"','"+c33+"','"+c44+"')";        
            pst = con.prepareStatement(q);
            pst.execute(); 
            
            JOptionPane.showMessageDialog(null," Successflly Added ") ; 
        }
        
        catch(Exception s){
            System.out.println(s.getMessage());
        }
    
    }
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        l2 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        b4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablev = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        d1 = new javax.swing.JTextField();
        db1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        v1 = new javax.swing.JTextField();
        v2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        vb1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        a1 = new javax.swing.JTextField();
        a2 = new javax.swing.JTextField();
        a3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ab1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        a4 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        r1 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        e1 = new javax.swing.JTextField();
        e3 = new javax.swing.JTextField();
        eb4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        e4 = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        e2 = new javax.swing.JTextField();
        eb5 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 255));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(192, 57, 43));
        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));

        l2.setFont(new java.awt.Font("Calibri", 0, 48)); // NOI18N
        l2.setForeground(new java.awt.Color(255, 255, 255));
        l2.setText("Administrator");

        l4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/videorentalsystem/Images/Untitled-1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(l2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        b4.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        b4.setForeground(new java.awt.Color(192, 57, 43));
        b4.setText("Logout");
        b4.setBorderPainted(false);
        b4.setContentAreaFilled(false);
        b4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        tablev.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        tablev.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablev);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel8.setText("Video ID");

        d1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        db1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        db1.setText("Delete");
        db1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                db1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(db1))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(d1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(d1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(36, 36, 36)
                .addComponent(db1)
                .addContainerGap(323, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Delete ", jPanel4);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        v1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        v2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setText("Video ID");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setText("Status");

        vb1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        vb1.setText("Update");
        vb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vb1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(vb1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel2))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel1)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(v1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(v2))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(v1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(v2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(vb1)
                .addContainerGap(319, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Edit Availability", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        a1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        a2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        a3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setText("Title");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setText("Language");

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel5.setText("Status");

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel6.setText("Description");

        ab1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        ab1.setText("Add");
        ab1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ab1ActionPerformed(evt);
            }
        });

        a4.setColumns(20);
        a4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        a4.setRows(5);
        jScrollPane3.setViewportView(a4);

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel7.setText("Rate");

        r1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(a3, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(a2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(a1, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ab1)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(57, 57, 57))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(r1)
                .addGap(51, 51, 51))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(r1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(ab1)
                .addGap(58, 58, 58))
        );

        jTabbedPane1.addTab("Add", jPanel3);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel9.setText("Video ID");

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel10.setText("Language");

        jLabel12.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel12.setText("Description");

        e1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        e3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        eb4.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        eb4.setForeground(new java.awt.Color(192, 57, 43));
        eb4.setText("Get details");
        eb4.setBorder(null);
        eb4.setBorderPainted(false);
        eb4.setContentAreaFilled(false);
        eb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eb4ActionPerformed(evt);
            }
        });

        e4.setColumns(20);
        e4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        e4.setLineWrap(true);
        e4.setRows(5);
        e4.setWrapStyleWord(true);
        jScrollPane2.setViewportView(e4);

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel11.setText("Title");

        e2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        eb5.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        eb5.setForeground(new java.awt.Color(192, 57, 43));
        eb5.setText("Update");
        eb5.setBorder(null);
        eb5.setBorderPainted(false);
        eb5.setContentAreaFilled(false);
        eb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eb5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(334, 334, 334)
                        .addComponent(eb4))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addGap(28, 28, 28)
                                .addComponent(e3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(jLabel9))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(4, 4, 4)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(e2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(e1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(eb5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(e1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(eb4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(e2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(e3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(17, 17, 17)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(27, 27, 27)
                .addComponent(eb5)
                .addGap(33, 33, 33))
        );

        jTabbedPane1.addTab("Edit Information", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(192, 57, 43));
        jButton1.setText("View Customer Reports");
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(119, 119, 119))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jButton1)
                .addContainerGap(254, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Customers", jPanel6);

        b6.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        b6.setForeground(new java.awt.Color(192, 57, 43));
        b6.setText("Change rent information");
        b6.setBorderPainted(false);
        b6.setContentAreaFilled(false);
        b6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1293, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 803, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)
                        .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b6)
                            .addComponent(b4))
                        .addGap(0, 13, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        
        Login aaa = new Login();
        aaa.setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_b4ActionPerformed

    private void db1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_db1ActionPerformed
        deleteinfo();
    }//GEN-LAST:event_db1ActionPerformed

    private void eb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eb5ActionPerformed
        updatedata();
    }//GEN-LAST:event_eb5ActionPerformed

    private void eb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eb4ActionPerformed
        getdata();
    }//GEN-LAST:event_eb4ActionPerformed

    private void vb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vb1ActionPerformed
        edit();
    }//GEN-LAST:event_vb1ActionPerformed

    private void ab1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ab1ActionPerformed
        addnew();
        addrate();
    }//GEN-LAST:event_ab1ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        
        changerent am = new changerent();
        am.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_b6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        generateReport am = new generateReport();
        am.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(editvideos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editvideos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editvideos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editvideos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editvideos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a1;
    private javax.swing.JTextField a2;
    private javax.swing.JTextField a3;
    private javax.swing.JTextArea a4;
    private javax.swing.JButton ab1;
    private javax.swing.JButton b4;
    private javax.swing.JButton b6;
    private javax.swing.JTextField d1;
    private javax.swing.JButton db1;
    private javax.swing.JTextField e1;
    private javax.swing.JTextField e2;
    private javax.swing.JTextField e3;
    private javax.swing.JTextArea e4;
    private javax.swing.JButton eb4;
    private javax.swing.JButton eb5;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l4;
    private javax.swing.JTextField r1;
    private javax.swing.JTable tablev;
    private javax.swing.JTextField v1;
    private javax.swing.JTextField v2;
    private javax.swing.JButton vb1;
    // End of variables declaration//GEN-END:variables
}
