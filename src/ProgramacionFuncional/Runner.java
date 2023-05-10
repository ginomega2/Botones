package ProgramacionFuncional;

import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        for (int indice=0; indice<numeros.size();indice++){
            System.out.println(numeros.get(indice));
        }

        for (int numero:numeros){
            System.out.println(numero);
        }


        numeros.forEach(elememt -> System.out.println(elememt));
        numeros.forEach(elemento-> System.out.println(elemento*elemento));
        numeros.forEach(elemento-> System.out.println((double) elemento/2));

        numeros.stream()
                .filter(elemento-> !(soloNumeroPares(elemento)))
                .forEach(System.out::println);


        numeros.stream()
                .filter(Runner::soloNumeroPares)
                .forEach(System.out::println);

    }

    private static boolean soloNumeroPares(Integer elemento) {
        return elemento % 2 == 0;
    }
}
