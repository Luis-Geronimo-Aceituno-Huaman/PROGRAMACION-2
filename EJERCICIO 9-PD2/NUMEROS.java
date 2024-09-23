package ejercicio9PD2;

public class NUMEROS{
    private int numero;
    private int opuesto;
    //Constructores
    public NUMEROS(){
    }
    public NUMEROS(int numero){
        this.numero=numero;
        this.opuesto= (187-numero);
    }
    //Setters
    public void setNumero(int numero){
        this.numero=numero;

    }
    public void setOpuesto(int numero){
        this.opuesto= (187-numero);

    }
    //Getters
    public int getOpuesto(){
        return opuesto;
    }
    public int getNumero(){
        return numero;
    }
}
