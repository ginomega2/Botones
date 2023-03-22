package Cadenas;

public class ColoDeTexto {
    public static final String ANSI_RESET = "\u001B[0m";
    //***************   COLOR DE LETRA   ********************************
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    //***************   COLOR DE FONDO   ***********************
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";



//    public static void main(String[] args) {
//
//        setColor(ANSI_BLACK);
//        setColor(ANSI_RED_BACKGROUND);
//        System.out.println("texto en rojo");
//        System.out.println("hasta que se resetee el color ");
//        resetColor();
//        System.out.println("colores normales");
//        setColor(ANSI_BLUE+ANSI_YELLOW_BACKGROUND);
//        System.out.println("nuevo color"+ANSI_RESET);
//        System.out.println("regreso normal");
//        setColor(ANSI_RED);
//        System.out.println("MENSAJES DE ADVERTENCIA");
//
//
//    }

    public static void resetColor() {

        System.out.print(ANSI_RESET);

    }

    public ColoDeTexto() {
    }

    public ColoDeTexto(String color) {
        System.out.print(color);
    }
    public void setNewColor(String color){
        System.out.print(ANSI_RESET);
    }


     public static void setColor(String color) {
        System.out.print(color);
    }
}
