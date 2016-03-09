/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author RV
 */
public class db {
    static  Connection c;
    
    public static void createConnection()throws Exception{
    
        Class.forName("com.mysql.jdbc.Driver");
        c= (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3308/speed","root","1234");
    
    }
    public static  void iud(String S)throws Exception{
      if (c == null) {
            createConnection();
        }

        Statement stmt = c.createStatement();
        stmt.executeUpdate(S);
    }
    
   public static  ResultSet search(String S)throws Exception{
   
       if (c == null) {
            createConnection();
        }

        Statement stmt = c.createStatement();
        ResultSet rs = stmt.executeQuery(S);
        
        return rs;
   }
    
    
}
