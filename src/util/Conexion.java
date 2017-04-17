/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author UPEU
 */
public class Conexion {
private static final String URL = "jdbc:mysql://localhost:3306/bdscv";
private static final String driver = "com.mysql.jdbc.Driver";
private static final String user = "root";
private static final String pass = "root" ;
private static Connection cx = null;

public static Connection getConexion(){
    try{
        Class.forName(driver);
        if(cx==null){
            cx= DriverManager.getConnection(URL,user,pass);
        }
    }catch (ClassNotFoundException | SQLException e){
        System.out.println("Error"+e.getMessage());
    }

return cx;
}
}