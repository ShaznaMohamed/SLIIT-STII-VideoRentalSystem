/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videorentalsystem;

 
import javax.swing.JOptionPane;

/**
 *
 * @author Shaznaa
 */
public class Video {
    
    String name;
     
    int priceperday;
    
    

    Video(int spriceperday)
    {
          this.priceperday = spriceperday;
    }
    
    double calcprice(int noofdays, int noofcopies)
    {
        double price;
        price = noofdays * this.priceperday * noofcopies;
        return price;
    }
    
        
    double calcdiscount(int noofcopies)
    {
        double discount;
        if(noofcopies >5)
        {
            discount = 200.00;
        }
        else 
            discount = 0;
        
        
        return discount;
    }
    
    double calctotal(int noofdays, int noofcopies)
    {
        double total;
        total = this.calcprice(noofdays , noofcopies) - this.calcdiscount(noofcopies) ;
        return total;
    }
    
    
}
