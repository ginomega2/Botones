package AnsiColorsEscSeq;
////    https://gist.github.com/dominikwilkowski/60eed2ea722183769d586c76f22098dd   CODIGOS ANSI
import Cadenas.MsgColor;

import java.util.Scanner;
/*
Styles
code 	description
\u001b[0m 	Reset all styles
\u001b[1m 	Bold
\u001b[4m 	Underline
\u001b[7m 	Reversed

 public static final String RESET = "\u001B[0m";
 */
public class CodigosAnsi {
    public static String BOLD ="\u001b[1m";
    public static String UNDERLINE="\u001b[4m";
    public static String RESET="\u001b[0m";
    public static String INVERSO="\\u001b[7m";



    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();

        System.out.println("""
               NORMAL NORMAL NORMAL NORMAL NORMAL NORMAL
               NORMAL NORMAL NORMAL NORMAL NORMAL NORMAL
               NORMAL NORMAL NORMAL NORMAL NORMAL NORMAL
                """);

        System.out.println(UNDERLINE+"""
                SUBRAYADO SUBRAYADO, SUBRAYADO SUBRAYADO,
                SUBRAYADO SUBRAYADO, SUBRAYADO SUBRAYADO,
                SUBRAYADO SUBRAYADO, SUBRAYADO SUBRAYADO,
                """+RESET);
        System.out.println("HOLA");






        setColor(MsgColor.AZUL, MsgColor.AMARILLObg);
        System.out.println(BOLD+"""
                NEGRITAS NEGRITAS NEGRITAS NEGRITAS
                NEGRITAS NEGRITAS NEGRITAS NEGRITAS
                NEGRITAS NEGRITAS NEGRITAS NEGRITAS
                
                """+RESET);
//        resetColor();

        /*


        System.out.format("%+8d%n", n);    //  -->  " +461012"
        System.out.format("%,8d%n", n);    // -->  " 461,012"
        System.out.format("%+,8d%n%n", n); //  -->  "+461,012"

        double pi = Math.PI;

        System.out.format("%f%n", pi);       // -->  "3.141593"
        System.out.format("%.3f%n", pi);     // -->  "3.142"
        System.out.format("%10.3f%n", pi);   // -->  "     3.142"
        System.out.format("%-10.3f%n", pi);  // -->  "3.142"
        System.out.format(Locale.FRANCE,
                "%-10.4f%n%n", pi); // -->  "3,1416"

        Calendar c = Calendar.getInstance();
        System.out.format("%tB %te, %tY%n", c, c, c); // -->  "May 29, 2006"

        System.out.format("%tl:%tM %tp%n", c, c, c);  // -->  "2:34 am"

        System.out.format("%tD%n", c);    // -->  "05/29/06"

        System.out.println("custom format");
        customFormat("###,###.###", 123456.789);
        customFormat("###.##", 123456.789);
        customFormat("000000.000", 123.78);
        customFormat("$###,###.###", 12345.67);
         */

        long num = 461012;

//        System.out.format("%08d%n", n);    //  -->  "00461012"

        MsgColor msgColor = new MsgColor("LETRA NEGRA FONDO PURPURA",MsgColor.NEGRO,MsgColor.PURPURAbg);
      String lineaConFormato = """
            1 INICIO DE MENSAJE MULTILINEA
            2
            3
            4 AQUI VA UN PARAMETRO STRING: %s
              TEXTO CON COLOR %s
            5 AQUI VA OTRO PARAMETRO entero %d
            6 
            7 PONDRA -->  "00461012"  %08d
            7 
            5 FIN DE MENSAJE
            """.formatted("TEXTO INSERTADO",msgColor,num,num);
        System.out.println(lineaConFormato);

        System.out.println(msgColor);
        System.out.println("sin color");
//        System.out.println("\u001b[1J");

    }

    private static void setColor(String colorLetra, String colorFondo) {
        System.out.print(colorLetra+colorFondo);
    }

    private static void inverso() {
        System.out.println("\u001b[7m");
    }

    private static void subRaya() {
        System.out.print("\u001b[4m");
    }


    private static void bold() {
        System.out.print("\u001b[1m ");
    }

    private static void resetColor() {
        System.out.print("\u001b[0m");
    }
}
