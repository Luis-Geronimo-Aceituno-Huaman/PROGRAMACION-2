package ejercicio9PD2;
import java.util.Scanner;
public class pruebaNumeros {
//Implementamos un metodo para la suma    
public static int Suma (int A, int B){
    int suma;   
    //Utilizamos el resto para poder tener el resultado en el rango de 187Z
    suma= (A+B)%187; 
    return suma;
} 
//Implementamos un meto para hallar el cero
public static int Cero(int num) {
    int cero;
    //Creamos un objeto para poder hallar el opuesto de uno de los numeros ingresados
    NUMEROS obj = new NUMEROS(); 
    obj = new NUMEROS(num);
    //Sumamos el numero con su opuesto, luego hallamos el resto para tener el resultado '0'
    cero= (obj.getNumero() + obj.getOpuesto())%187;
    return cero;
}  
//Implementamos un metodo para restar
public static int Resta(int auxA, int auxB){
    int resta;
    //Utilizando el 'auxB' creamos un objeto para hallar su opuesto
    NUMEROS b = new NUMEROS();
    b=new NUMEROS(auxB);
    //Sumamos el auxA con el opuesto del auxB 
    //Al hallar el resultado, nos aseguramos este en el rango de 187Z
    resta=(auxA + b.getOpuesto())%187;
    //Nos aseguramos que el resultado sea positivo
    if(resta<0){
        resta+=187;
    }
    return resta;
}

public static void main(String[] args) {
    NUMEROS a = new NUMEROS();
    NUMEROS b = new NUMEROS();
    int auxA,auxB;
    Scanner entrada= new Scanner(System.in);
    System.out.println("Ingrese los numeros a y b: ");
    System.out.println("-------------------------- ");
   
    System.out.print("\nIngrese A (0-186): ");
    auxA=entrada.nextInt();
    //Nos aseguramos que A este en el rango establecido
    while(auxA>186 || auxA<0){
        System.out.print("\tIngrese un numero que este en el rango de 0 a 186: ");
        auxA = entrada.nextInt();
    }
    System.out.print("Ingrese B (0-186): ");
    auxB=entrada.nextInt();
    //Nos aseguramos que B este en el rango establecido
    while(auxB>186 || auxB<0){
        System.out.print("\tIngrese un numero que este en el rango de 0 a 186: ");
        auxB = entrada.nextInt();
    }
    entrada.close();
    //Creamos los objetos 'a' y 'b', para hallar el opuesto
    a=new NUMEROS(auxA);
    b=new NUMEROS(auxB);
    //Mostramos los resultados
    System.out.println("\nRESULTADOS:");
    System.out.println("-----------\n");
    System.out.println("Numero a: "+a.getNumero()+"\nOpuesto de a: "+a.getOpuesto());
    System.out.println("\tSuma de a y su opuesto: "+ Cero(auxA));
    System.out.println("\nNumero b: "+b.getNumero()+"\nOpuesto de b: "+b.getOpuesto());
    System.out.println("\tLa suma de b y su opuesto es: "+ Cero(auxB));

    System.out.println("\nSuma a(+)b: "+ Suma(auxA, auxB));
    System.out.println("Resta a(-)b: "+ Resta(auxA, auxB));
}
}
