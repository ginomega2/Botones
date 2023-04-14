package Pilas;

///*****************************  PASO 3 DEFINIR UN LIMITE PARA LOS ELEMENTOS QUE SE VANA RETIRAR NO SE PUEDE RETIRAR SI ESTA VACIO  ****************
public class Pila3 {
    private int cantidadDeElementosInsertados=0;
    private int limiteDeElementosPermitidos=0; //


    public int getCantidadDeElementosInsertados() {
        return cantidadDeElementosInsertados;
    }

    public Pila3() {
        this.limiteDeElementosPermitidos=5;
    }
    public Pila3(int limiteDeElementosPermitidos){
        this.limiteDeElementosPermitidos=limiteDeElementosPermitidos;
    }

    public void InsertarEnPila(){
        if(laPilaTieneEspacioDisponible())
            cantidadDeElementosInsertados++;
        else {
            System.out.println("pila llena no se puede imprimir");
        }


    }

    public void retirarDePila(){
        if(cantidadDeElementosInsertados==0){//si la pila esta vacia nosep uede insertar
            System.out.println("pila vacia no se puede retirar nada");
        }else {
            cantidadDeElementosInsertados--;
        }

    }

    private boolean laPilaTieneEspacioDisponible() {
        return cantidadDeElementosInsertados < limiteDeElementosPermitidos;
    }

}
