package Arreglos;

import java.util.Arrays;

public class ArreglosRunner {
    public static void main(String[] args) {
        //declaracion
        int [] numeros = new int[5];
        String[] textos = new String[5];
        float[] flotantes = new float[5];
        Persona[] personas = new Persona[5];


        //otra forma delaracion
        int [] numeros2 = {20,30,43,23,54};
        String[] textos2 = {"texto 1 ","texto 2","hola ","msg4","txto5"};
        float[] flotantes2 = {1.2f,2.5f,6.4f,6.3f,5.5f};
        Persona[] personas2 ={
                new Persona(1,"krsna"),
                new Persona(2,"roberto"),
                new Persona(3,"javier")

        };


        System.out.println("*******************************  arreglo sin inicializacion  ***************************");

        for (int indice=0; indice<numeros.length;indice++){
            System.out.println(numeros[indice]);
            System.out.println(textos[indice]);
            System.out.println(flotantes[indice]);
        }
        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.toString(textos));
        System.out.println(Arrays.toString(flotantes));

        System.out.println("*******************************  llenado manual  ***************************");
        //llenado manual
        numeros[0]=12;
        numeros[1]=14;
        numeros[2]=16;
        numeros[3]=17;
        numeros[4]=17;
        textos[0]="msg1";
        textos[1]="msg2";
        textos[2]="msg3";
        textos[3]="msg4";
        textos[4]="msg5";
        flotantes[0] = 1.1f;
        flotantes[1] = 2.1f;
        flotantes[2] = 3.1f;
        flotantes[3] = 4.1f;
        flotantes[4] = 5.1f;

        for (int indice=0; indice<numeros.length;indice++){
            System.out.println(numeros[indice]);
            System.out.println(textos[indice]);
            System.out.println(flotantes[indice]);
        }

        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.toString(textos));
        System.out.println(Arrays.toString(flotantes));


//        for (int indice=0; indice<numeros2.length;indice++){
//            System.out.println(numeros2[indice]);
//            System.out.println(textos2[indice]);
//            System.out.println(flotantes2[indice]);
//        }
//

        for (Persona persona:personas2 ) {
            System.out.println(persona.getId());
            System.out.println(persona.getNombre());

        }

    }
}
