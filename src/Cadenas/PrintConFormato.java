package Cadenas;

import java.util.Locale;

//                              ╞ ┬│
//  ╚═╝╔═╗ ║  ╦ ╠╟ ╢╣  ╝ ╬ ╧  ╩ ╜ ╛  └─┐ ┴ ┬ ├ ─ ┼ ╞   ╚ │ ┤ ╧ ╨ ╤ ╥ ╙ ╘ ╒ ╓ ╫ ╪ ┘╡  ┌ ┌█▄╞ ╟ ╜╛┐╞╟
//░ ▒ ▓    █ ▄■▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀■▄
//           █
//           █
public class PrintConFormato {

    public static String coloDeTexto;

    public static void main(String[] args) {



//        ColoDeTexto.setColor(ColoDeTexto.ANSI_BLACK+ColoDeTexto.ANSI_YELLOW_BACKGROUND);
//        PrintConColor("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        PrintConColor("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");
        PrintConColor("▓      PRUEBA DE FORMATEO      ▓");
        PrintConColor("▓     DE TEXTO CON  printf     ▓");
        PrintConColor("▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓");


        System.out.printf("╔══════════════════════════════╗%n");
//        System.out.printf("--------------------------------%n");
        SetColor(ColoDeTexto.ANSI_BLACK+ColoDeTexto.ANSI_BLUE_BACKGROUND);
        System.out.printf("║   "+PonerColor(" Java's Primitive Types ")+"   ║" + "%n");
        System.out.printf("║   "+PonerColor(" (printf table example) ")+"   ║" + "%n");

        System.out.printf("╟────────────┬──────────┬──────╢%n");
        SetColor(ColoDeTexto.ANSI_BLACK+ColoDeTexto.ANSI_GREEN_BACKGROUND);
        MsgColor category =new MsgColor("CATEGORY",MsgColor.NEGRO,MsgColor.VERDEbg);
        System.out.printf("║ "+PonerColor("%-10s")+" │ "+PonerColor("%-8s")+" │ "+PonerColor("%4s")+" ║%n","CATEGORY", "NAME", "BITS");
        System.out.printf("╟────────────┼──────────┼──────╢%n");


        System.out.printf("║ %-10s │ %-8s │ %04d ║%n", "Foltante", "double",  64);
        System.out.printf("║ %-10s │ %-8s │ %04d ║%n", "Floating", "float",   32);
        System.out.printf("║ %-10s │ %-8s │ %04d ║%n", "Integral", "long",    64);
        System.out.printf("║ %-10s │ %-8s │ %04d ║%n", "Integral", "int",     32);
        System.out.printf("║ %-10s │ %-8s │ %04d ║%n", "Integral", "char",    16);
        System.out.printf("║ %-10s │ %-8s │ %04d ║%n", "Integral", "short",   16);
        System.out.printf("║ %-10s │ %-8s │ %04d ║%n", "Integral", "byte",    8);
        System.out.printf("║ %-10s │ %-8s │ %04d ║%n", "Boolean",  "boolean", 1);

        System.out.printf("╚════════════╧══════════╧══════╝%n");
    }

    private static void SetColor(String elColor) {
        coloDeTexto=elColor;

    }
    private static String GetColor(){
        return coloDeTexto;
    }

    private static String PonerColor(String s) {
        return coloDeTexto+s+ColoDeTexto.ANSI_RESET;


     }

     private static void PrintConColor(String s) {
         ColoDeTexto.setColor(ColoDeTexto.ANSI_BLACK+ColoDeTexto.ANSI_YELLOW_BACKGROUND);
         System.out.printf(s);
         ColoDeTexto.resetColor();
         System.out.println();
     }
 }
