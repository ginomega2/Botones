package Pilas;

//************************** PASO 1 DEFINIMOS UN CONTADOR DE ELEMTOS CADA VES QUE SE LLAMA AL METODO InsertarEnPila   **************************
public class Pila {
    private int CantidadDeElementosInsertados=0; //ESTE SERA EL CONTADOR DE ELEMENTOS QUE INICA EN 0


    public int getCantidadDeElementosInsertados() { //DEVUELVE LA CANTIDAD DE ELEMENTOS INSERTADOS
        return CantidadDeElementosInsertados;
    }

    public Pila() {
    }

    public void InsertarEnPila(){
        CantidadDeElementosInsertados++; // CADA VEZ QUE SE LLAMA AL MEODO INSERTAR EL CONTADOR SE ACTUALIZA
    }

}
