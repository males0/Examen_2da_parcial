/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.controlador;

import ec.edu.intsuperior.vista.*;

/**
 *
 * @author males
 */
public class Controlador {
    
    Administrador administrador=new Administrador(this);
    Estudiante estudiante= new Estudiante(this);
    Loggin loggin= new Loggin(this);
    Docente docente=new Docente(this);
    
    public void mostrarDocente(){
        docente.setExtendedState(Docente.MAXIMIZED_BOTH);
        docente.setVisible(true);
        loggin.setVisible(false);
    }
    
    public void mostrarAdministrador(){
        administrador.setExtendedState(Administrador.MAXIMIZED_BOTH);
        administrador.setVisible(true);
        loggin.setVisible(false);
    }
    
    public void mostrarEstudiante(){
        administrador.setExtendedState(Estudiante.MAXIMIZED_BOTH);
        estudiante.setVisible(true);
        loggin.setVisible(false);
    }
    
    public void mostrarLoggin(){
        loggin.setLocationRelativeTo(null);
        loggin.setVisible(true);
       
    }
    
            
    
}
