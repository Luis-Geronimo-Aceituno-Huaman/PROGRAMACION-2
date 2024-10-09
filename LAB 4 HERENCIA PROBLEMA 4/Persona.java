package appescuela;

public class Persona {
    protected String nombre;
    protected String direccion;
    
    public Persona(String nombre,  String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getDireccion() {
        return direccion;
    }
}
