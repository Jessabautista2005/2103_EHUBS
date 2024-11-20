/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control_Connector;

/**
 *
 * @author ayodr
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class DBConnect {
    private static Connection con;
    private static DBConnect dbcon;
    
    private static String url = "jdbc:mysql://localhost:3306/optical";
    private static String user = "root";
    private static String password = "";
        
    public static Connection getCon(){
        return con;
    }
    public static void setCon(Connection con){
        DBConnect.con = con;
    }
    public static DBConnect getDBCon(){
        return dbcon;
    }
    public static void setDBConnect(DBConnect dbcon){
        DBConnect.dbcon = dbcon;
    }
   
    
    public DBConnect(){
        con = null;
        try {
            con = DriverManager.getConnection(url, user, password);
            
        } catch (Exception ex) {
        }
 
    }
     public static DBConnect getDBConnect(){
         if(dbcon == null){
             dbcon = new DBConnect();
         }
            return dbcon;
        }
     public static Connection getConnection(){
            return con;
     }
    
        
}
