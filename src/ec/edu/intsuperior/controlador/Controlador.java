
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
    JpIngresarMateria jpIngresarMateria=new JpIngresarMateria(this);
    JpIngresarCurso ingresarCurso=new JpIngresarCurso(this);
    JpIngresarDocente ingresarDocente=new JpIngresarDocente(this);
    JpIngresarEstudiante ingresarEstudiante=new JpIngresarEstudiante(this);
    
    
    public void probarConexion(){
        Conexion.getConnection("proyecto_poo","root", "1005166200");
    }
    
    
    public void mostraringEstudiante(){
     ingresarEstudiante.setSize(1000,1000);
    administrador.Escritorio.removeAll();
    administrador.Escritorio.add(ingresarEstudiante);
    ingresarEstudiante.setVisible(true);
    administrador.Escritorio.validate();
    ingresarEstudiante.repaint();   
        
    }
    
    public void mostraringDocente(){
     ingresarDocente.setSize(800,800);
    administrador.Escritorio.removeAll();
    administrador.Escritorio.add(ingresarDocente);
    ingresarDocente.setVisible(true);
    administrador.Escritorio.validate();
    ingresarDocente.repaint();
    }
    
    public void mostraringCurso(){
    ingresarCurso.setSize(800,800);
    administrador.Escritorio.removeAll();
    administrador.Escritorio.add(ingresarCurso);
    ingresarCurso.setVisible(true);
    administrador.Escritorio.validate();
    ingresarCurso.repaint();
        
    }
    
    public void mostrarIngmateria(){
     jpIngresarMateria.setSize(800,800);
    administrador.Escritorio.removeAll();
    administrador.Escritorio.add(jpIngresarMateria);
    jpIngresarMateria.setVisible(true);
    administrador.Escritorio.validate();
    jpIngresarMateria.repaint();
        
    }
    public void mostrarDocente(){
        
        docente.setExtendedState(Docente.MAXIMIZED_BOTH);
        docente.setVisible(true);
        loggin.setVisible(false);
    }
    
    public void mostrarAdministrador(){
        //administrador.setExtendedState(Administrador.MAXIMIZED_BOTH);
        administrador.setVisible(true);
        loggin.setVisible(false);
      
    }
    
    public void mostrarEstudiante(){
        administrador.setExtendedState(Estudiante.MAXIMIZED_BOTH);
        estudiante.setVisible(true);
        loggin.setVisible(false);
    }
    
    public void mostrarLoggin(){
        loggin.setSize(1000,800);
        loggin.setLocationRelativeTo(null);
        loggin.setVisible(true);
       
    }
    
            
    
}
