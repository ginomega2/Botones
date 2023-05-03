package UsoDePrintf;
//USO DE ESPECIFICADORES DE FORMATO PARA printf

/** @implSpec El formato para printf es como sigue
 *  %[posición_dato$][indicador_de_formato][ancho][.precision]carácter_de_conversión
 *
 *  */

//ejemplo %1-,+8.3f
// %n indica salto de linea tambein se puede usar \n
public class PrintfConNumeros {
    public static void main(String[] args) {

        System.out.printf("numero float segundo parametro  %2$-,+8.3f   y primer parametro %1$-,(10.2f ",-1234.12345678,-32654.987654);



        System.out.printf("%.2f   %n",  12.3698);/** Si queremos mostrar el número 12.3698 de tipo double con dos decimales: La salida por pantalla es: 12,37
                           │ ││   │     │
                           │ ││   │     └─>> EL NUMERO A MOSTRAR SERA 12.3698 TAMBIEN PUEDES USAR UNA VARIABLE
                           │ ││   │
                           │ ││   └─>> %n es salto de linea tambien se puede usar \n
                           │ ││
                           │ │└─>> f indica flotante o double
                           │ │
                           │ └─>> .2   indica dos decimales    OJO HACE UN REDONDEO
                           │
                           └─>> % indica el lugar donde se pondra la variable o valor
                           */

        System.out.printf("""
                forma1>> [%1$-40s]
                forma2>> [%1$40S]
                forma3>> [%2$-20s]
                forma4>> [%2$20S]
                forma5>> [%3$-50s]
                forma6>> [%3$50S]
                
                ""","1EjeMpLo TExTo ","2ejemplo texto","3EJEMPLO TEXTO ");


        System.out.printf("--------------------------------%n");
        System.out.printf(" Java's Primitive Types         %n");
        System.out.printf(" (printf table example)         %n");

        System.out.printf("--------------------------------%n");
        System.out.printf("| %-10s | %-8s | %4s |%n", "CATEGORY", "NAME", "BITS");
        System.out.printf("--------------------------------%n");

        System.out.printf("| %-10s | %-8s | %04d |%n", "Floating", "double",  64);
        System.out.printf("| %-10s | %-8s | %04d |%n", "Floating", "float",   32);
        System.out.printf("| %-10s | %-8s | %04d |%n", "Integral", "long",    64);
        System.out.printf("| %-10s | %-8s | %04d |%n", "Integral", "int",     32);
        System.out.printf("| %-10s | %-8s | %04d |%n", "Integral", "char",    16);
        System.out.printf("| %-10s | %-8s | %04d |%n", "Integral", "short",   16);
        System.out.printf("| %-10s | %-8s | %04d |%n", "Integral", "byte",    8);
        System.out.printf("| %-10s | %-8s | %04d |%n", "Boolean",  "boolean", 1);

        System.out.printf("--------------------------------%n");





    }
}
