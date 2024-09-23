package ejercicio9PD2;
public class NUMEROS{
    private int numero;
    private int opuesto;
    //Constructores
    public NUMEROS(){
    }
    public NUMEROS(int numero){
        this.numero=numero;
        this.opuesto= Opuesto(numero);
    }
    //Setters
    public void setNumero(int numero){
        this.numero=numero;

    }
    public void setOpuesto(int numero){
        this.opuesto= Opuesto(numero);

    }
    //Getters
    public int getOpuesto(){
        return opuesto;
    }
    public int getNumero(){
        return numero;
    }
    //Metodo para hallar el opuesto
    public static int Opuesto(int numero){
        int opuesto;
        opuesto=(187-numero)%187;
        if(opuesto<0){
            opuesto+=187;
        }
        return opuesto;
    }    
}
