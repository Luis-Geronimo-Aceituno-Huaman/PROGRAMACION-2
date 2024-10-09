package appescuela;

public class Aula extends Curso {
    
    public Aula(String nombre) {
        super(nombre); // Llamada al constructor de la clase Curso
    }

    // Método para matricular alumnos en el aula
    public boolean matricularAlumno(Alumno alumno) {
        // Comprobar si el número de alumnos matriculados es menor que la capacidad
        if (getAlumnos().size() < getCapacidad()) {
            // Iterar sobre la lista de alumnos ya matriculados
            for (Alumno a : getAlumnos()) {
                // Comparar el código del alumno a matricular con los códigos existentes
                if (a.getCodigo().equals(alumno.getCodigo())) {
                    return false; // Alumno ya matriculado
                }
            }
            // Si no se encontró un código duplicado, añadir el nuevo alumno
            getAlumnos().add(alumno);
            return true; // Matriculación exitosa
        }

        return false; // Sin vacantes
    }

    // Método para obtener el listado de alumnos (opcional)
    public void mostrarAlumnos() {
        System.out.println("Alumnos matriculados en el aula " + getNombre() + ":");
        for (Alumno alumno : getAlumnos()) {
            System.out.println(alumno.getNombre() + " - Código: " + alumno.getCodigo());
        }
    }
}
