/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.management.system;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author MONIKA
 */
public class Connect {

    private String password;
    private String url;
    
    public static  Connection  Connection(){
        Connection con =null;
        
        try
        
           {
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library ","root","mona@1234");
    
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }

   
        return con;
        
    }
    
}
