package FunctionalInterfaces;

import java.util.Random;

public class MensajesConColor implements ServidorDeMensajes {
    public static final String RESET = "\u001B[0m";
    //***************   COLOR DE LETRA   ********************************
    public static final String NEGRO = "\u001B[30m";
    public static final String ROJO = "\u001B[31m";
    public static final String VERDE = "\u001B[32m";
    public static final String AMARILLO = "\u001B[33m";
    public static final String AZUL = "\u001B[34m";
    public static final String PURPURA = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String BLANCO = "\u001B[37m";

    //***************   COLOR DE FONDO   ***********************
    public static final String NEGRObg = "\u001B[40m";
    public static final String ROJObg = "\u001B[41m";
    public static final String VERDEbg = "\u001B[42m";
    public static final String AMARILLObg = "\u001B[43m";
    public static final String AZULbg = "\u001B[44m";
    public static final String PURPURAbg = "\u001B[45m";
    public static final String CYANbg = "\u001B[46m";
    public static final String BLAMCObg = "\u001B[47m";

    public static String ColorDeTexto;


    public MensajesConColor() {
        Random random = new Random();
        int colorAleatorio = random.nextInt(7)+1;
        ColorDeTexto = switch (colorAleatorio){

            case 1 -> ROJO;
            case 2 -> VERDE;
            case 3 -> AMARILLO;
            case 4 -> AZUL;
            case 5 -> PURPURA;
            case 6 -> CYAN;
            case 7 -> BLANCO;
            default -> BLANCO;
        };

    }
    public MensajesConColor(String mensaje){

    }

    @Override
    public void imprimeMensaje(String mensaje) {
        System.out.println(ColorDeTexto+mensaje +" A COLOR "+RESET);
    }
}
