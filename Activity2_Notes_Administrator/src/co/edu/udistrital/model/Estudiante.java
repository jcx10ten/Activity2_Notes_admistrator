
package co.edu.udistrital.model;

public class Estudiante {
    
    private String nombre;
    private String codigo;
    private double nota;

    public Estudiante(String nombre, String codigo, double nota) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

}
