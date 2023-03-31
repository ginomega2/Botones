package FunctionalInterfaces;

public class MensajesSinColor implements ServidorDeMensajes{

    @Override
    public void imprimeMensaje(String mensaje) {
        System.out.println( "\u001B[0m"+mensaje);
    }
}
