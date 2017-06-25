/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videorentalsystem.ireports;

import java.awt.Container;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author Dishan
 */
public class Reportgenerate extends JFrame{
    
    Connection con;
    
        public  Reportgenerate(String filename) throws JRException
    {
     
        try{Connection con=dbconnect.connect();
        JasperPrint print=JasperFillManager.fillReport(filename, null, con);
        JRViewer jr=new JRViewer(print);
        Container content=getContentPane();
        content.add(jr);
        setVisible(true);
        setBounds(10,10,800,660);}
    
       catch(JRException e){
            //   JOptionPane.showMessageDialog(this,"JRE ERROR");
       
       }
    }

   /* public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Container getContentPane() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setBounds(int i, int i0, int i1, int i2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    */
    
        
        
        
        
     public Reportgenerate(String fileName,HashMap para)
     {
        super("Reservation Report");

        try
        {
         Class.forName("com.mysql.jdbc.Driver");
         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/video","root","");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

        try
        {
            JasperPrint print = JasperFillManager.fillReport(fileName,para,con);
            JRViewer viewer = new JRViewer(print);
            Container c = getContentPane();
            c.add(viewer);
            con.close();
        }
        catch(Exception e)
        {

        }

        setBounds(10,10,900,700);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
     }
    
    
    
    
    
}
