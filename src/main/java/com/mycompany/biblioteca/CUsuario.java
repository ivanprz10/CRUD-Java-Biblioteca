package com.mycompany.biblioteca;

import java.util.HashSet;
import java.util.Set;
import javax.swing.JTextField;



public class CUsuario {
int matricula;
   String nombreUser;
   String apellidoUser;
   int telefonoUser;
   String libro;
   /*espacio para la fechaxd*/
   
   
   
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNombreUser() {
        return nombreUser;
    }

    public void setNombreUser(String nombreUser) {
        this.nombreUser = nombreUser;
    }

    public String getApellidoUser() {
        return apellidoUser;
    }

    public void setApellidoUser(String apellidoUser) {
        this.apellidoUser = apellidoUser;
    }

    public int getTelefonoUser() {
        return telefonoUser;
    }

    public void setTelefonoUser(int telefonoUser) {
        this.telefonoUser = telefonoUser;
    }

    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }
    public void insertarUsuario(JTextField paramNombre, JTextField paramApellido, JTextField paramTelefono, JTextField paramLibro){
    
        setNombreUser(paramNombre.getText());
        setApellidoUser(paramApellido.getText());
        /*setTelefonoUser(paramTelefono.getText());*/
        setLibro(paramLibro.getText());
        
        
        
        
        
        
    }
   
}
