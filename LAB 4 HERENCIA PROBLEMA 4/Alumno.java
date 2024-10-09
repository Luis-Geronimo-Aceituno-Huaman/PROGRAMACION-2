package appescuela;
import java.util.ArrayList;
import java.util.Scanner;
class Alumno extends Persona {
    private String codigo;
    private String escuela;
    public Alumno(String codigo, String nombre, String escuela, String direccion) {
        super (nombre, direccion);
        this.codigo=codigo;
        this.escuela=escuela;
    }
    public String getCodigo(){
       return codigo; 
    }
    public String getEscuela(){
        return escuela; 
     }
    @Override
    public String toString() {
        return ("Código: " + codigo + ", Nombre: " + nombre + ", Escuela: " + escuela + ", Dirección: " + direccion);
    }
}
