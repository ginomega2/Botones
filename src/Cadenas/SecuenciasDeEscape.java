package Cadenas;

/*

\n	Salto de línea. Sitúa el cursor al principio de la línea siguiente
\b	Retroceso. Mueve el cursor un carácter atrás en la línea actual.
\t	Tabulador horizontal. Mueve el cursor hacia adelante una distancia determinada por el tabulador.
\r	Ir al principio de la línea. Mueve el cursor al principio de la línea actual.
\f	Nueva página. Mueve el cursor al principio de la siguiente página.
\"	Comillas. Permite mostrar por pantalla el caracter comillas dobles.
\'	Comilla simple. Permite mostrar por pantalla el carácter comilla simple.
\\	Barra inversa.
\udddd	Carácter Unicode. d representa un dígito hexadecimal del caracter Unicode.
\s	Caracter espacio en blanco

 */
//*********************************          USO DE LAS SECUENCIAS DE ESCAPE   *******************************
public class SecuenciasDeEscape {
    public static void main(String[] args) {
        System.out.println("\sEspacio\sen\sBlanco");
        System.out.println("c:\\Barra\\inversa\\Para\\rutas");
        System.out.println("\'Comillas Simple\'");
        System.out.println("\"Comilla Doble");
        System.out.println("Salto de \f pagina");

        System.out.println("salto de linea\nsalto de line\n\rsalto deliena e inicio ");

    }
}
