/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.controlador;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {
    private static Connection conexion;
    
public static Connection getConnection(String bddName,String user,String password){
    try {
        conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+bddName, user, password);
        System.out.println("conexion exitosa" );
        
    } catch (Exception e) {
        System.out.println(e.getMessage());
}
    return conexion;
    
}


}
