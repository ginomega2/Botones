package Cadenas;

///-**************************            MANEJO DE LA CLASE STRING      **************************************
public class CadenasRunner {
    public static void main(String[] args) {
        System.out.println("manejo de cadenas String");
        String cadena1,cadena2, cadena3; //dclaracion de strings
        String cadena4= "mensaje de inicio";//delaracion y asginacion de valor a cadena

        cadena1="MENSAJE";
        cadena2="hola";
        cadena3="hola";

        //********** USO DENTRO DE IN IF OJO EN VERSIONES ANTERIORES SE USA COMPARE TO

        if(cadena2==cadena3){
            System.out.println(" cadena 2 y cadena 3 son iguales en contenido "+cadena2 + " "+ cadena3);
        }

        cadena2="aaa";
        cadena3="ddd";

        //esto no se puede hacer usar en su lugar copare to

//        if (cadena2>cadena3){
//
//        }
//


        /*
        *
            the value 0 if the argument string is equal to this string;
            * a value less than 0 if this string is lexicographically less than the string argument;
            * and a value greater than 0 if this string is lexicographically greater than the string argument.
            * DEVUELVE 0 SI EL CONTENIDO ES IDENTICO
            * MAYOR QUE CERO SIGNIFICA QUE EL STRING ES MAYOR  QUE EL ENVIADO COMO PARAMETRO
            * MENOR A CERO SIGNIFICA QUE EL STRING ES MENOR QUE EL ENVIADO COM PARAMETRO
        * */
        System.out.println(" **********************      VALORE DEVIELTOS POR COMPARE TO   *******************");
        System.out.print("cadena2.compareTo(cadena3) = ");
        System.out.println(cadena2.compareTo(cadena3));
        System.out.print("cadena3.compareTo(cadena1) = ");
        System.out.println(cadena3.compareTo(cadena2));

        cadena3="aaa";
        System.out.print("cadena2.compareTo(cadena3) = ");
        System.out.println(cadena2.compareTo(cadena3));

        cadena3="ttt";
        System.out.println("***********************   USO DE COMPAREETO EN UN IF  **********************");
        if (cadena2.compareTo(cadena3)>0){
            System.out.println(" cadena2.compareTo(cadena3)>0");
            System.out.println(" cadena 2 es mayor que cadena3");
            System.out.println ("SIGNIFICA QUE cadena2 va DESPUES que cadena3");
            System.out.println(" cadena2 = "+cadena2);
            System.out.println(" cadena 3 = "+cadena3);
        }
        if (cadena2.compareTo(cadena3)<0){
            System.out.println(" cadena2.compareTo(cadena3)<0");
            System.out.println(" cadena 2 es menor que cadena 3");
                System.out.println ("SIGNIFICA QUE cadena2 va antes que cadena3");
            System.out.println(" cadena2 = "+cadena2);
            System.out.println(" cadena 3 = "+cadena3);
        }

//        cadena3="aaa";
        if (cadena2.compareTo(cadena3)==0){
            System.out.println(" cadena2.compareTo(cadena3)==0");
            System.out.println(" cadena 2 es igual que cadena 3");
            System.out.println(" cadena2 = "+cadena2);
            System.out.println("cadena 3 = "+cadena3);
        }

        //***********************   MANIPULACION DE STRINGS  *****************************

        System.out.println("***********************   MANIPULACION DE STRINGS  *****************************");
        System.out.println("    **************          LONGITUD DE UNA CADENA  length          ******* ");
        System.out.println("cntenido de cadena1  "+ cadena1 +  " cadena 1 mide "+ cadena1.length());
        System.out.println("cntenido de cadena2  "+ cadena2 +  " cadena 1 mide "+ cadena2.length());
        System.out.println("cntenido de cadena3  "+ cadena3+  " cadena 1 mide "+ cadena3.length());

        System.out.println("***********************   EXTRAER UN CARACTER DE LA CADENA charAt   *****************************");
        System.out.println("primer caracter de cadena 1 = "+cadena1.charAt(0));
        System.out.println("segundo  caracter de cadena 1 = "+cadena1.charAt(1));
        System.out.println("tercer caracter de cadena 1 = "+cadena1.charAt(2));
        System.out.println("cuarto caracter de cadena 1 = "+cadena1.charAt(3));

        System.out.println("primer caracter de cadena 2 = "+cadena2.charAt(0));
        System.out.println("segundo caracter de cadena 2 = "+cadena2.charAt(1));
        System.out.println("tercer caracter de cadena 2 = "+cadena2.charAt(2));
    //    System.out.println("cuarto caracter de cadena 2 = "+cadena2.charAt(3));//ojo causara un error fuera de los limites


        //***********************  USO DE EQUALS Y equalsIgnoreCase  equals   **********************************************
        cadena2="KRSNA";
        cadena3="krsna";
        if (cadena2.equals(cadena3)){
            System.out.println("ambos son iguales para nosotros pero para la compu no lo son");
            System.out.println(cadena2+  " es igual que " + cadena3);
        }
        if (cadena2.equalsIgnoreCase(cadena3)){//COMPARA SIN TOMAR EN CUENTA MAYUSCULAS Y MINUSCULAS
            System.out.println("");
            System.out.println(cadena2+  " es igual que " + cadena3);
        }

        //*****************************   USO DE  toUpperCase()      toLowerCase()    *******************************
        cadena2="AAAAAAAAAAAAAAAA";
        cadena3="bbbbbbbbbbbbbbbb";
        System.out.println("****************      convertir mayusculas minusculas   ****************");
        System.out.println( cadena3+  " SE CONVIERTE EN===>>>  "+cadena3.toUpperCase());
        System.out.println(cadena2+"  SE CONVIERTE EN ====>>>>>  "+cadena2.toLowerCase());

        //*****************************  BUSQUEDAS AL INICIO startsWith U AL FINAL endsWith  DE UNA CADENA    *******************************
        cadena1="BUSCAR LAS ARROBA AL FINAL. @@@";
        if(cadena1.endsWith("@@@")){
            System.out.println("cadena 1 termina con @@@"+cadena1);
        }else {
            System.out.println("cadena1 no termina con @@@"+cadena1);
        }

        cadena2=">= bBUSCAR el simbolo mayor o igualque al incicio ";
        if (cadena2.startsWith(">=")){
            System.out.println("cadena2 inicia con >= "+cadena2);
        }else {
            System.out.println("cadena2 no inicia con >= "+cadena2);
        }

        //*****************************  BUSQUEDAS dentro  DE UNA CADENA con indexOf DEVUELVE EL INDICE DEL TEXTO A BUSCAR O -1 cuando NO EXISTE  *******************************
        cadena2="BUS%CAR EL SIMBOLO PORCENTAJE %% DENTRO DE ESTE TEXTO";
        System.out.println(cadena2);
        System.out.println(cadena2.indexOf("%"));
        System.out.println(cadena2.charAt(3));
        System.out.println("BUSCANDO LETRA NO EXTSTENTE #");
        System.out.println(cadena2.indexOf("#"));

        //*******************************  REEMPLAZAR TEXTO EN UNA CADENA CON    **************************************
        cadena2="REEMPLAZAR ** TODOS * LOS A*STERICOS PO**R EXCLAM*ACIONES * ";
        cadena2.replace("*","!");//NO AFECTA AL ORIGINAL SOLO EL RESULTADO ES CAMBIADO ESTA LINEA NO CAMBIA A cadena2 ES LA INMUTABILIDADA DE STRINGS
        System.out.println(cadena2);
        System.out.println(cadena2.replace("*","!"));
        cadena3=cadena2.replace("*","!");// GUARDAMOS LA NUEVA CADENA EN cadena3
        System.out.println("cadena nueva con los cambios " + cadena3);

        //************************* QUITAR ESPACIOS EN BLANCO AL INICIO O AL FINAL CON  trim()   *******************************
        cadena2="     ESTA CADENA COMIENZA Y TERMINA CON ESPACIOS EN BLANCO      ";
        System.out.println("***inicio****"+cadena2+"***fin***");
        System.out.println("imprime la cadena sin espacion");
        System.out.println("***inicio****"+cadena2.trim()+"***fin***");
        System.out.println("pero el original np fue cmabiado");
        System.out.println(cadena2);//EL ORIGINAL NO FUE CAMBIADO

        ////***********************   QUITAR ESPACIOS EN BLANCO EN TODA LA CADENA CON     *******************************
        cadena2=" _    K     r  s n a      _ E   m  a     n       u      e    _      r    o      c    h   a    _   ";
        System.out.println("***inicio****"+cadena2+"***fin***");
        System.out.println("imprime la cadena sin espacion");
        cadena3=cadena2.replaceAll("\\s","");
        System.out.println("***inicio****"+cadena3+"***fin***");


        ColoDeTexto.setColor(ColoDeTexto.ANSI_BLUE);

        ///**********************************  EJEMPLOS DE ARTE ASCII PARA PROYECTOS EN MODO TEXTO    **************************************
        //**************************   ASCI ART    https://patorjk.com/software/taag/#p=display&h=3&f=Big&t=KrsnaSofware    ************************
        System.out.println("""
                  _  __                      _____        __                       \s
                 | |/ /                     / ____|      / _|                      \s
                 | ' / _ __ ___ _ __   __ _| (___   ___ | |___      ____ _ _ __ ___\s
                 |  < | '__/ __| '_ \\ / _` |\\___ \\ / _ \\|  _\\ \\ /\\ / / _` | '__/ _ \\
                 | . \\| |  \\__ \\ | | | (_| |____) | (_) | |  \\ V  V / (_| | | |  __/
                 |_|\\_\\_|  |___/_| |_|\\__,_|_____/ \\___/|_|   \\_/\\_/ \\__,_|_|  \\___|
                                                                                   \s
                                                                                   \s
                
                """);

        ColoDeTexto.setColor(ColoDeTexto.ANSI_CYAN);
        System.out.println("""
                 __    __                                             ______            ______    __                                            \s
                |  \\  /  \\                                           /      \\          /      \\  |  \\                                           \s
                | $$ /  $$ ______   _______ _______   ______        |  $$$$$$\\ ______ |  $$$$$$\\_| $$_   __   __   __  ______   ______   ______ \s
                | $$/  $$ /      \\ /       |       \\ |      \\       | $$___\\$$/      \\| $$_  \\$|   $$ \\ |  \\ |  \\ |  \\|      \\ /      \\ /      \\\s
                | $$  $$ |  $$$$$$|  $$$$$$| $$$$$$$\\ \\$$$$$$\\       \\$$    \\|  $$$$$$| $$ \\    \\$$$$$$ | $$ | $$ | $$ \\$$$$$$|  $$$$$$|  $$$$$$\\
                | $$$$$\\ | $$   \\$$\\$$    \\| $$  | $$/      $$       _\\$$$$$$| $$  | $| $$$$     | $$ __| $$ | $$ | $$/      $| $$   \\$| $$    $$
                | $$ \\$$\\| $$      _\\$$$$$$| $$  | $|  $$$$$$$      |  \\__| $| $$__/ $| $$       | $$|  | $$_/ $$_/ $|  $$$$$$| $$     | $$$$$$$$
                | $$  \\$$| $$     |       $| $$  | $$\\$$    $$       \\$$    $$\\$$    $| $$        \\$$  $$\\$$   $$   $$\\$$    $| $$      \\$$     \\
                 \\$$   \\$$\\$$      \\$$$$$$$ \\$$   \\$$ \\$$$$$$$        \\$$$$$$  \\$$$$$$ \\$$         \\$$$$  \\$$$$$\\$$$$  \\$$$$$$$\\$$       \\$$$$$$$
                                                                                                                                                \s
                                                                                                                                                \s
                                                                                                                                                \s
                """);


        ColoDeTexto.setColor(ColoDeTexto.ANSI_BLACK+ColoDeTexto.ANSI_RED_BACKGROUND);
        System.out.println("""
                 _       _______ _______ _       _______    _______ _______ ________________        _______ _______ _______\s
                | \\    /(  ____ (  ____ ( (    /(  ___  )  (  ____ (  ___  (  ____ \\__   __|\\     /(  ___  (  ____ (  ____ \\
                |  \\  / | (    )| (    \\|  \\  ( | (   ) |  | (    \\| (   ) | (    \\/  ) (  | )   ( | (   ) | (    )| (    \\/
                |  (_/ /| (____)| (_____|   \\ | | (___) |  | (_____| |   | | (__      | |  | | _ | | (___) | (____)| (__   \s
                |   _ ( |     __(_____  | (\\ \\) |  ___  |  (_____  | |   | |  __)     | |  | |( )| |  ___  |     __|  __)  \s
                |  ( \\ \\| (\\ (        ) | | \\   | (   ) |        ) | |   | | (        | |  | || || | (   ) | (\\ (  | (     \s
                |  /  \\ | ) \\ \\_/\\____) | )  \\  | )   ( |  /\\____) | (___) | )        | |  | () () | )   ( | ) \\ \\_| (____/\\
                |_/    \\|/   \\__\\_______|/    )_|/     \\|  \\_______(_______|/         )_(  (_______|/     \\|/   \\__(_______/
                                                                                                                           \s
                """);

        ColoDeTexto.setColor(ColoDeTexto.ANSI_RESET);
        ColoDeTexto.setColor(ColoDeTexto.ANSI_RED);
        System.out.println("""
                      ___         ___         ___         ___         ___                   ___         ___         ___      ___         ___         ___         ___         ___    \s
                     /\\__\\       /\\  \\       /\\  \\       /\\__\\       /\\  \\                 /\\  \\       /\\  \\       /\\  \\    /\\  \\       /\\__\\       /\\  \\       /\\  \\       /\\  \\   \s
                    /:/  /      /::\\  \\     /::\\  \\     /::|  |     /::\\  \\               /::\\  \\     /::\\  \\     /::\\  \\   \\:\\  \\     /:/ _/_     /::\\  \\     /::\\  \\     /::\\  \\  \s
                   /:/__/      /:/\\:\\  \\   /:/\\ \\  \\   /:|:|  |    /:/\\:\\  \\             /:/\\ \\  \\   /:/\\:\\  \\   /:/\\:\\  \\   \\:\\  \\   /:/ /\\__\\   /:/\\:\\  \\   /:/\\:\\  \\   /:/\\:\\  \\ \s
                  /::\\__\\____ /::\\~\\:\\  \\ _\\:\\~\\ \\  \\ /:/|:|  |__ /::\\~\\:\\  \\           _\\:\\~\\ \\  \\ /:/  \\:\\  \\ /::\\~\\:\\  \\  /::\\  \\ /:/ /:/ _/_ /::\\~\\:\\  \\ /::\\~\\:\\  \\ /::\\~\\:\\  \\\s
                 /:/\\:::::\\__/:/\\:\\ \\:\\__/\\ \\:\\ \\ \\__/:/ |:| /\\__/:/\\:\\ \\:\\__\\         /\\ \\:\\ \\ \\__/:/__/ \\:\\__/:/\\:\\ \\:\\__\\/:/\\:\\__/:/_/:/ /\\__/:/\\:\\ \\:\\__/:/\\:\\ \\:\\__/:/\\:\\ \\:\\__\\
                 \\/_|:|~~|~  \\/_|::\\/:/  \\:\\ \\:\\ \\/__\\/__|:|/:/  \\/__\\:\\/:/  /         \\:\\ \\:\\ \\/__\\:\\  \\ /:/  \\/__\\:\\ \\/__/:/  \\/__\\:\\/:/ /:/  \\/__\\:\\/:/  \\/_|::\\/:/  \\:\\~\\:\\ \\/__/
                    |:|  |      |:|::/  / \\:\\ \\:\\__\\     |:/:/  /     \\::/  /           \\:\\ \\:\\__\\  \\:\\  /:/  /     \\:\\__\\/:/  /     \\::/_/:/  /     \\::/  /   |:|::/  / \\:\\ \\:\\__\\ \s
                    |:|  |      |:|\\/__/   \\:\\/:/  /     |::/  /      /:/  /             \\:\\/:/  /   \\:\\/:/  /       \\/__/\\/__/       \\:\\/:/  /      /:/  /    |:|\\/__/   \\:\\ \\/__/ \s
                    |:|  |      |:|  |      \\::/  /      /:/  /      /:/  /               \\::/  /     \\::/  /                          \\::/  /      /:/  /     |:|  |      \\:\\__\\   \s
                     \\|__|       \\|__|       \\/__/       \\/__/       \\/__/                 \\/__/       \\/__/                            \\/__/       \\/__/       \\|__|       \\/__/   \s
                """);

        ColoDeTexto.setColor(ColoDeTexto.ANSI_PURPLE);
        System.out.println("""
                 ___   _ ______   _______ __    _ _______   _______ _______ _______ _______ _     _ _______ ______   _______\s
                |   | | |    _ | |       |  |  | |   _   | |       |       |       |       | | _ | |   _   |    _ | |       |
                |   |_| |   | || |  _____|   |_| |  |_|  | |  _____|   _   |    ___|_     _| || || |  |_|  |   | || |    ___|
                |      _|   |_||_| |_____|       |       | | |_____|  | |  |   |___  |   | |       |       |   |_||_|   |___\s
                |     |_|    __  |_____  |  _    |       | |_____  |  |_|  |    ___| |   | |       |       |    __  |    ___|
                |    _  |   |  | |_____| | | |   |   _   |  _____| |       |   |     |   | |   _   |   _   |   |  | |   |___\s
                |___| |_|___|  |_|_______|_|  |__|__| |__| |_______|_______|___|     |___| |__| |__|__| |__|___|  |_|_______|
                
                """);










    }
}
