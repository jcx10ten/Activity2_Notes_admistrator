package co.edu.udistrital.model;

import java.util.List;

public class Operacion {

    private static final double NOTA_MINIMA = 3.0;

    public Integer estudiantesAprobados(List<Estudiante> estudiantes) {
        Integer aprobados = 0;

        for (Estudiante e : estudiantes) {
            if (e.getNota() >= NOTA_MINIMA) {
                aprobados++;
            }
        }

        return aprobados;
    }

    public Integer estudiantesReprobados(List<Estudiante> estudiantes) {
        Integer reprobados = 0;
        for (Estudiante e : estudiantes) {
            if (e.getNota() < NOTA_MINIMA) {
                reprobados++;
            }
        }

        return reprobados;
    }

    public double promedioCurso(List<Estudiante> estudiantes) {
        double n = 0;
        for (Estudiante e : estudiantes) {
            n += e.getNota();
        }
        double promedio = n / estudiantes.size();
        return promedio;
    }

    public double desviacionEstandar(List<Estudiante> estudiantes) {
        double promedio = promedioCurso(estudiantes);
        double suma = 0;
        double aux;
        double resultado;
        for (Estudiante e : estudiantes) {
            aux = e.getNota() - promedio;
            suma += aux * aux;
        }
        resultado = Math.sqrt(suma / estudiantes.size());
        return resultado;
    }

    public double calculoModa(List<Estudiante> estudiantes) {
        int maximoNumRepeticiones = 0;
        double moda = 0;

        for (int i = 0; i < estudiantes.size(); i++) {
            int numRepeticiones = 0;
            for (int j = 0; j < estudiantes.size(); j++) {
                if (estudiantes.get(i).getNota() == estudiantes.get(j).getNota()) {
                    numRepeticiones++;
                }
                if (numRepeticiones > maximoNumRepeticiones) {
                    moda = estudiantes.get(i).getNota();
                    maximoNumRepeticiones = numRepeticiones;
                }
            }
        }
        return moda;
    }

}
