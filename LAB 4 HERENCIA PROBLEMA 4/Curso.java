package appescuela;
import java.util.ArrayList;

public class Curso {
    protected String nombre;
    private ArrayList<Alumno> alumnos;
    private final int capacidad = 20;

    public Curso(String nombre) {
        this.nombre = nombre;
        this.alumnos = new ArrayList<>();
    }

    // Métodos getters
    public String getNombre() {
        return nombre;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public int getCapacidad() {
        return capacidad;
    }
}
