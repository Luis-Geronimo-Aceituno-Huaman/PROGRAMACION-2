package problema8pc2;

public class ANGULOS {
    //ATRIBUTOS
    private float angulo;
    private float opuesto;

    //CONSTRUCTORES
    public ANGULOS(){

    }
    public ANGULOS(float angulo){
        this.angulo=angulo;
        this.opuesto=convertirOpuesto(angulo);
    }

    //SETTERS
    public void setAngulo(float angulo){
        this.angulo = angulo;
    }
    public void setOpuesto(float angulo){
        this.opuesto = convertirOpuesto(angulo);
    }

    //GETTERS
    public float getAngulo(){
    return this.angulo;
    }
    public float getOpuesto(){
    return this.opuesto;
    }

    //METODO PARA CONVERTIR ANGULOS A SUS OPUESTOS
    public static float convertirOpuesto(float angulo){
        float anguloOpuesto=0;
        if(angulo>180){
            anguloOpuesto= angulo-180;
        }    
        if(angulo<=180){
            anguloOpuesto = angulo + 180;
        }
        return anguloOpuesto;
    }

}
