package lab3;

public class Nodo{
    private String valor;
    private Nodo siguiente;

    public Nodo(String cadena) {
    valor = cadena;
    siguiente = null;
    }

    public String darValor() {
    return (valor);
    }
    
    public Nodo darSiguiente() {
    return (siguiente);
    }
    public void insertarAContinuacion(Nodo siguienteNodo){
    siguiente = siguienteNodo;
    }
    }
    