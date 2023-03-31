package Primitivos;

import Cadenas.ColoDeTexto;

public class PrimitivosRunner {

    ///*** DATOS SOBRE EL TIPO PRIMITIVO byte   *********************
    public static void main(String[] args) {
        ColoDeTexto coloDeTexto =new ColoDeTexto();
        ColoDeTexto.setColor(ColoDeTexto.ANSI_CYAN);

        System.out.println("****************    Byte   ****************************");
        System.out.println("En bits son "+Byte.SIZE);
        System.out.println("En bytes son "+Byte.SIZE/8);
        System.out.println("En bytes otra forma "+Byte.BYTES);
        System.out.println("max value "+Byte.MAX_VALUE);
        System.out.println("mmin value "+Byte.MIN_VALUE);

        ///*************     Short    Integer    Long   ****************************

        ColoDeTexto.setColor(ColoDeTexto.ANSI_PURPLE);
        System.out.println("****************    Short   ****************************");
        System.out.println("En bits son "+Short.SIZE);
        System.out.println("En bytes son "+Short.SIZE/8);
        System.out.println("En bytes otra forma "+Short.BYTES);
        System.out.println("max value "+Short.MAX_VALUE);
        System.out.println("min value "+Short.MIN_VALUE);



        ColoDeTexto.setColor(ColoDeTexto.ANSI_RED);
        System.out.println("****************    Integer   ****************************");
        System.out.println("En bits son "+Integer.SIZE);
        System.out.println("En bytes son "+Integer.SIZE/8);
        System.out.println("En bytes otra forma "+Integer.BYTES);
        System.out.println("max value "+Integer.MAX_VALUE);
        System.out.println("min value "+Integer.MIN_VALUE);

        ColoDeTexto.setColor(ColoDeTexto.ANSI_BLUE);
        System.out.println("****************    Long   ****************************");
        System.out.println("Long");
        System.out.println("En bits son "+Long.SIZE);
        System.out.println("En bytes son "+Long.SIZE/8);
        System.out.println("En bytes otra forma "+Long.BYTES);
        System.out.println("max value "+Long.MAX_VALUE);
        System.out.println("min value "+Long.MIN_VALUE);

        System.out.printf("%d + %d + %d = %d", 5, 6, 7, 5 + 6 + 7).println();


    }
}
