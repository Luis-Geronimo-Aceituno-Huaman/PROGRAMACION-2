package problema8pc2;

import java.util.Scanner;
public class pruebaAngulos {
    public static void main(String[] args) {
        ANGULOS[] registroAngulos = new ANGULOS[100];
        Scanner entrada = new Scanner(System.in);
        int nAngulos;
        float angulo=0;
        float suma=0;
    
        System.out.print("Ingrese la cantidad de angulos que desea ingresar: ");
        nAngulos= entrada.nextInt();

       // INGRESAMOS LOS ANGULOS
        System.out.println("\nIngrese los angulos (0-360): ");
        for(int i=0; i< nAngulos; i++){
            System.out.print("Angulo N°"+(i+1)+": ");
            angulo=entrada.nextFloat();
            //NOS ASEGURAMOS QUE LOS ANGULOS ESTEN ENTRE EL RANGO DE 0 Y 360
            while(angulo>360 || angulo<0){
                System.out.print("  Ingrese un angulo positivo y menor a 360: ");
                angulo=entrada.nextFloat();
            }
            //GUARDAMOS EL ANGULO EN EL REGISTRO
            registroAngulos[i]=new ANGULOS(angulo);
            //SUMAMOS LOS ANGULOS
            suma=(suma+angulo)%360;
        }
        entrada.close();
        
        //INCIALIZAMOS LA VARIABLE 'RESTA' CON EL PRIMER VALOR, PARA MANTENERLO POSITIVO
        float resta=registroAngulos[0].getAngulo(); 
       
        //RESTAMOS EL PRIMER ANGULO CON LOS SIGUIENTES
        for(int k=1; k<nAngulos;k++){
            resta=resta - registroAngulos[k].getAngulo();
        }
        //NOS ASEGURAMOS QUE LA RESTA SEA POSITIVA Y QUE ESTE EN EL RANGO DE 0 A 360.
        resta=Math.abs((resta+360)%360);
        //MOSTRAMOS LOS RESULTADOS
        System.out.println("\nRESULTADOS");
        System.out.println("-----------");
        for(int i=0; i<nAngulos;i++){
        System.out.println("\nAngulo N°"+(i+1)+": "+registroAngulos[i].getAngulo());
        System.out.println("\tOpuesto del angulo N°"+(i+1)+": "+ registroAngulos[i].getOpuesto());
        }
        System.out.println("\nLa suma de todos los angulos es: "+suma);
        System.out.println("La resta de todo los angulos es: "+ resta);
    }
}
