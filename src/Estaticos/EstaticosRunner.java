package Estaticos;

///***************************   USO DE LOS MIEMBROS ESTATICOS DE UAN CLASE   ***********************************
///

public class EstaticosRunner {


    public static void main(String[] args) {

        Persona persona =new Persona(1,"krsna");
        Persona persona2 =new Persona(2,"2krsna");

//PARA USAR EL MIEMRBO ESTATICO LO HACEMOS CON EL NOMBRE DE LA CLASE OJO NO DEL OBJETO   Persona.totalDePersonas
        System.out.println(" total de instancias ceradas de persona "+ Persona.totalDePersonas);


        Persona persona3 =new Persona(3,"krsna");
        Persona persona4 =new Persona(4,"2krsna");

        System.out.println(" total de instancias ceradas de persona "+ Persona.totalDePersonas);

//TAMBIEN PODEMOS LLAMAR A METODOS ESTATICOS DE LA MIsMA MANERA
        Persona.ImprimeTotalDePersonas();

        Persona persona5 =new Persona();
        Persona persona6 =new Persona();
        Persona.ImprimeTotalDePersonas();

/// USO DE MIEMBROS ESTATICOS DE LAS LCASES DE JAVA

        System.out.println(Integer.parseInt("10")); //CPNVIERTE NUMERO ENTERO EN CADENA

        //compara 2 floats y devuelve un valor dependiendo de cual es mayor
        System.out.println("COMPARACION RETORNA 0 SI SON IGUALES "+Float.compare(34.6f,34.6f));// RETORNA 0 SI SON IGUALES
        System.out.println("COMPARACION RETORNA 1 SI EL PRIMER PARAMETRO ES MAYOR "+Float.compare(34.6f,33f));// 1 SI EL PRIMER PARAMETRO ES MAYOR
        System.out.println("COMPARACION RETORNA -1 SI EL SEGUNDO PARAMETRO ES MAYOR "+ Float.compare(33,34.6f));//-1 SI EL SEGUNDO PARAMETRO ES MAYOR



    }

}
