
package co.edu.udistrital.model;

public class Estudiante {
    
    private String nombre;
    private String apellido;
    private String cedula;
    private String nota;
    private String codigo;

    public Estudiante(String nombre, String apellido, String cedula, String nota, String codigo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.nota = nota;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    
    
    
    
}
