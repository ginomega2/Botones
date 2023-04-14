package Pilas;

//********************* PASO 2 DEFINIMOS EL LIMITE DE ELEMENTOS QUE PODEMOS ACEPTAR EN LA PILA   *****************************
public class Pila2 {
    private int cantidadDeElementosInsertados=0;
    private int limiteDeElementosPermitidos=0; //


    public int getCantidadDeElementosInsertados() {
        return cantidadDeElementosInsertados;
    }

    public Pila2() {
        this.limiteDeElementosPermitidos=5; //INICIALIZAMOS EL LIMITE DE ELEMETOS PERMITODS A 5 MINIMO SI NO SE INDICA
    }
    public Pila2(int limiteDeElementosPermitidos){
        this.limiteDeElementosPermitidos=limiteDeElementosPermitidos;  //INICIALIZAMOS EL LIMITE DE ELEMETOS PERMITODS SEGUN SE MANDE
    }

    public void InsertarEnPila(){
        if(laPilaTieneEspacioDisponible()) // sin espacio no se puede insertar
            cantidadDeElementosInsertados++;
        else {
            System.out.println("pila llena no se puede imprimir");
        }


    }

    private boolean laPilaTieneEspacioDisponible() {
        return cantidadDeElementosInsertados < limiteDeElementosPermitidos;
    }

}
