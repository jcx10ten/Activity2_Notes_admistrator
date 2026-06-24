package co.edu.udistrital.model;

import java.util.List;

public class Operacion {

    private static final double NOTA_MINIMA = 3.0;

    public String estudiantesAprobados(List<Estudiante> estudiantes) {
        for (Estudiante e : estudiantes) {
            Double nota = Double.parseDouble(e.getNota());
            if (nota >= NOTA_MINIMA) {
                return e.getCodigo();
            }
        }
        return "Ningun estudiante aprobo";
    }

    public String estudiantesReprobados(List<Estudiante> estudiantes) {
        for (Estudiante e : estudiantes) {
            Double nota = Double.parseDouble(e.getNota());
            if (nota <= NOTA_MINIMA) {
                return e.getCodigo();
            }
        }
        return "Ningun estudiante reprobo";
    }

    public double promedioCurso(List<Estudiante> estudiantes) {
        double n = 0;
        for (Estudiante e : estudiantes) {
            n += Double.parseDouble(e.getNota());
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
            aux = Double.parseDouble(e.getNota()) - promedio;
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
                if (estudiantes.get(i).getNota().equals(estudiantes.get(j).getNota())) {
                    numRepeticiones++;
                }
                if (numRepeticiones > maximoNumRepeticiones) {
                    moda = Double.parseDouble(estudiantes.get(i).getNota());
                    maximoNumRepeticiones = numRepeticiones;
                }
            }
        }
        return moda;
    }

}
