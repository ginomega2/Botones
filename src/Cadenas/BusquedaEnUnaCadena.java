package Cadenas;
// ***********************   BUSQUEDA EN UN CADENA   ******************************
public class BusquedaEnUnaCadena {
    public static void main(String[] args) {
        String elTexto="ESTOY BUSCANDO UNA LETRA";
        String elTexto2="ESTOY BUSCANDO UNA PALABRA, KRSNA, ESTOY BUSCANDO UNA PALABRA, ESTOY BUSCANDO UNA PALABRA, ESTOY BUSCANDO UNA PALABRA, ";

        /*
        *     Public int indexOf(String str)
              public int indexOf(String str, int fromIndex)
              public int indexOf(int ch)
              public int indexOf(int ch, int fromIndex)
              *     str, cadena a ser buscada.
              *     ch, carácter a ser buscado.
              *     fromIndex, índice de la cadena a partir del cual buscar.

        * */


        System.out.println(elTexto2);
        int posicion = elTexto2.indexOf('T');
        //****** BUSCAR UN ALETRA  ******
        System.out.println(" valor regresado po  indexof = ('T') "+posicion);
        posicion = elTexto2.indexOf('E');
        System.out.println(" valor regresado po  indexof = ('E') "+posicion);
        //****** BUSCAR UNA  PALABRA  ******
        posicion =elTexto2.indexOf("UNA");
        System.out.println(" valor regresado po  iindexOf(UNA) "+posicion);

    }
}
