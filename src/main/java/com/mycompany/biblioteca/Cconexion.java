package com.mycompany.biblioteca;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class Cconexion {
    
    
    Connection conectar=null;
    
    String usuario = "root";
    String contrasena = "Edc12345";
    String ip = "localhost";
    String bd = "biblioteca";
    String puerto = "3306";
    
    String cadena ="jdbc:mysql://"+ ip + ":"+puerto+"/"+bd;
    
    public Connection estableceConexion(){
    
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        conectar = DriverManager.getConnection(cadena, usuario, contrasena);
        JOptionPane.showMessageDialog(null, "la conexion se ha realizado con exito");
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "error al conectarse a la base de datos"+ e.toString());
    }
        return conectar;
    }
    
    
    
}
