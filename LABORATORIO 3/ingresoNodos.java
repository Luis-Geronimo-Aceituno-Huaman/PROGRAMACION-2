package lab3;
import java.util.Scanner;
public class pruebaLista {
    public static void main(String[] args) {
        Lista lista = new Lista();
        int numNodos;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese cuantos nodos desea agregar a la lista: ");
        numNodos=entrada.nextInt();
        entrada.nextLine();
        for(int i=0;i<numNodos;i++){
            String valorNodo;
            System.out.print("\nIngrese el nodo N°"+(i+1)+": ");
            valorNodo=entrada.nextLine();
            lista.incluir(valorNodo);
        }
        entrada.close();

        System.out.println("\n\nElementos en la lista:");
        System.out.println("----------------------");
        lista.imprimir();
    }
}
