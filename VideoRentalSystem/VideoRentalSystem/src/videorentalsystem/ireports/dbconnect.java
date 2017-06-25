package videorentalsystem.ireports;

import java.sql.*;

public class dbconnect {
    
    public static Connection connect(){
        
        Connection conn = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/video","root","");            
        }
        
        catch(Exception e){
            System.out.println(e.getMessage());
        }        
        return conn;
    }
}
