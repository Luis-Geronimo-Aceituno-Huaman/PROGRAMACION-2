package lab3;

public class Lista {
    private Nodo cabeza;
    public Lista() {
    cabeza = null;
    }
    public void incluir(String nValor) {
    Nodo aux = new Nodo(nValor);
    if (cabeza == null) {
    cabeza = aux;
    }
    else {
        Nodo aux2;
        aux2=cabeza;
        while(aux2.darSiguiente() != null) {
        aux2 = aux2.darSiguiente();
        }
        aux2.insertarAContinuacion(aux);
    }
    }
    public void imprimir() {
        if(cabeza != null) {
            Nodo aux3 = cabeza;
            while(aux3 != null) {
                System.out.println(aux3.darValor());
                aux3 = aux3.darSiguiente();
            }
        }
    }
}
    
