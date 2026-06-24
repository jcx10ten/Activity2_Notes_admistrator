/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.controller;

import co.edu.udistrital.model.Estudiante;
import co.edu.udistrital.model.Operacion;
import co.edu.udistrital.view.VentanaPrincipal;

import java.util.ArrayList;
import java.util.List;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;

/**
 *
 * @author USUARIO
 */
public class Controller implements ActionListener {
    
    private List<Estudiante> estudiantes;
    private Operacion operacion;
    private VentanaPrincipal ventanaPrincipal;
    
    public Controller() { 
        estudiantes = new ArrayList<>();
        operacion = new Operacion();
        listaEstudiantes();

        ventanaPrincipal = new VentanaPrincipal();
        asignarOyentes();
    }

    public void run(){
        ventanaPrincipal.setVisible(true);
    }
    
    public void listaEstudiantes() {
        for (int i = 0; i < 10; i++) {
            estudiantes.add(new Estudiante("", 0));
        }
    }

    public void asignarOyentes(){
        ventanaPrincipal.getPanelBotones().getBtnAprobados().addActionListener(this);
        ventanaPrincipal.getPanelBotones().getBtnReprobados().addActionListener(this);
        ventanaPrincipal.getPanelBotones().getBtnPromedio().addActionListener(this);
        ventanaPrincipal.getPanelBotones().getBtnModa().addActionListener(this);
        ventanaPrincipal.getPanelBotones().getBtnDesviacion().addActionListener(this);
    }

    public void setDatosEstudiantes(){
        JTextField[] nombresEstudiantes = ventanaPrincipal.getPanelEstudiantes().getTxtEstudiantes();
        JTextField[] notasEstudiantes = ventanaPrincipal.getPanelEstudiantes().getTxtNotas();

        for(int i = 0; i < estudiantes.size(); i++){
            Estudiante estudiante = estudiantes.get(i);
            
            String nombreIngesado = nombresEstudiantes[i].getText().trim();
            if (nombreIngesado.isEmpty()) {
                throw new IllegalArgumentException("Todos los estudiantes deben tener nombre para continuar.");
            }
            estudiante.setNombre(nombreIngesado);
            
            String notaIngresada = notasEstudiantes[i].getText().trim();
            if (notaIngresada.isEmpty()) {
                throw new IllegalArgumentException("Todos los estudiantes deben tener nota para continuar.");
            }

            double nota = Double.parseDouble(notaIngresada);

            if (nota < 0 || nota > 5) {
                throw new IllegalArgumentException("La nota del estudiante " + (i + 1) + " debe estar entre 0 y 5");
            }

            estudiante.setNota(nota);
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            setDatosEstudiantes();

            Object fuente = e.getSource();
            String resultado = "";

            if(fuente == ventanaPrincipal.getPanelBotones().getBtnAprobados()){
                Integer aprobados = operacion.estudiantesAprobados(estudiantes);
                if (aprobados == 0) {
                    resultado = "Ningun estudiante aprobo\n";
                } else {
                    resultado = "La cantidad de estudiantes aprobados es: " + aprobados + "\n";
                }
            }else if(fuente == ventanaPrincipal.getPanelBotones().getBtnReprobados()){
                Integer reprobados = operacion.estudiantesReprobados(estudiantes);
                if (reprobados == 0) {
                    resultado = "Ningun estudiante reprobo\n";
                } else {
                    resultado = "La cantidad de estudiantes reprobados es: " + reprobados + "\n";
                }
            }else if(fuente == ventanaPrincipal.getPanelBotones().getBtnPromedio()){
                double promedio = operacion.promedioCurso(estudiantes);
                resultado = "El promedio del curso es: " + String.format("%.2f", promedio) + "\n";
            }else if(fuente == ventanaPrincipal.getPanelBotones().getBtnModa()){
                double moda = operacion.calculoModa(estudiantes);
                resultado = "La moda del curso es: " + String.format("%.2f", moda) + "\n";
            }else if(fuente == ventanaPrincipal.getPanelBotones().getBtnDesviacion()){
                double desviacion = operacion.desviacionEstandar(estudiantes);
                resultado = "La desviacion estandar del curso es: " + String.format("%.2f", desviacion) + "\n";
            }

            ventanaPrincipal.getPanelInformacion().getTxtAreaInformacion().setText(resultado);
        }
        catch (NumberFormatException exc) {
            ventanaPrincipal.getPanelInformacion().getTxtAreaInformacion().setText(
                "Error de formato: Asegurate de que los campos de nota contengan números reales."
            );
        }
        catch (IllegalArgumentException exc) {
            ventanaPrincipal.getPanelInformacion().getTxtAreaInformacion().setText(
                "Error en el ingreso de datos: \n" + exc.getMessage() + "\nAsegurate que todos los campos contengan información adecuada."
            );
        }
    }
    
}
