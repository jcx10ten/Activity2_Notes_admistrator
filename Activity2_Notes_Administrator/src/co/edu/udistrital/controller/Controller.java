/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.controller;

import co.edu.udistrital.model.Estudiante;
import co.edu.udistrital.model.Operacion;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class Controller {
    
    private List<Estudiante> estudiantes;
    private Operacion operacion;
    
    public Controller() { 
        estudiantes = new ArrayList<>();
        operacion = new Operacion();
        listaEstudiantes();
    }
    
    public void listaEstudiantes(){
        estudiantes.add(new Estudiante("","","","1"));//nombre,Apellido,Cedula,Codigo
        estudiantes.add(new Estudiante("","","","2"));
        estudiantes.add(new Estudiante("","","","3"));
        estudiantes.add(new Estudiante("","","","4"));
        estudiantes.add(new Estudiante("","","","5"));
        estudiantes.add(new Estudiante("","","","6"));
        estudiantes.add(new Estudiante("","","","7"));
        estudiantes.add(new Estudiante("","","","8"));
        estudiantes.add(new Estudiante("","","","9"));
        estudiantes.add(new Estudiante("","","","10"));
    }
    
    
    
}
