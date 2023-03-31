package Enumeraciones;

import java.util.SortedMap;
import java.util.concurrent.atomic.DoubleAccumulator;

//********************CREACION DE UN ENUM PARA LOS DIAS DE A SEMANA   **************************
enum    DiaSemana {LUNES, MARTES, MIÉRCOLES, JUEVES, VIERNES, SABADO, DOMINGO};

public class EnumeracionRunner {
    public static void main(String[] args) {

        DiaSemana diaSemana = DiaSemana.LUNES;
        System.out.println(diaSemana    );
        System.out.println("dia de la semana con enum");
        System.out.println(DiaSemana.DOMINGO);
        System.out.println(DiaSemana.JUEVES);

        diaSemana= DiaSemana.MARTES;

/// USO DENTRO DE UN SWITCH

        switch (diaSemana) {
            case LUNES:
                System.out.println("diaSemana LUNES");

                break;
            case MARTES:
                System.out.println("diaSemana MARTES ");
                break;
            case MIÉRCOLES:
                System.out.println("diaSemana MIERCOLES ");
                break;
            case JUEVES:
                System.out.println("diaSemana JUEVES");
                break;
            case VIERNES:
                System.out.println("diaSemana VIERNES");
                break;
            case SABADO:
                System.out.println("diaSemana SABADO");
                break;
            case DOMINGO:
                System.out.println("diaSemana DOMINGO");
                break;
        }

//*/USO DENTRO DE UN IF

       DiaSemana diaSemana1 = DiaSemana.MIÉRCOLES;
        if(diaSemana1==DiaSemana.MIÉRCOLES){
            System.out.println(" dia semana  miercoles");
        }else {
            System.out.println("hoy no es miercoles");
        }
/// REASIGNACION DEL DIA
        diaSemana1 = DiaSemana.JUEVES;
        if(diaSemana1==DiaSemana.MIÉRCOLES){
            System.out.println(" dia semana  miercoles");
        }else {
            System.out.println("hoy no es miercoles");
        }

///COMPARACION DE DIAS COMPARE TO
        System.out.println("********************   USO DE COMPARETO CON ENUMERACIONES  ***************************  ");
        diaSemana1=DiaSemana.VIERNES;
        System.out.println( "DE VIERNES A SABADO HAY " + diaSemana1.compareTo(DiaSemana.SABADO) + " dias  de diferencia");
        diaSemana1=DiaSemana.SABADO;
        System.out.println( "DE SABADO a VIERNES   HAY " + diaSemana1.compareTo(DiaSemana.VIERNES) + " dias  de diferencia");


        diaSemana1=DiaSemana.LUNES;
        System.out.println("DE LUNES A DOMINGO " + diaSemana1.compareTo(DiaSemana.DOMINGO) + " dias  de diferencia");

        diaSemana1=DiaSemana.DOMINGO;
        System.out.println("DE  DOMINGO a LUNES " + diaSemana1.compareTo(DiaSemana.LUNES) + " dias  de diferencia");


        diaSemana1=DiaSemana.DOMINGO;
        System.out.println("DE  DOMINGO a DOMINGO " + diaSemana1.compareTo(DiaSemana.DOMINGO) + " dias  de diferencia");

        diaSemana1=DiaSemana.MIÉRCOLES;
        System.out.println("DE  MIERCOLES A LUNES " + diaSemana1.compareTo(DiaSemana.LUNES) + " dias  de diferencia");


        diaSemana1=DiaSemana.LUNES;
        System.out.println("DE LUNES  A MIERCOLES  " + diaSemana1.compareTo(DiaSemana.LUNES) + " dias  de diferencia");



// SACAR EL VALOR ORDINAL DE LOS ELEMENTOS DE UN ENUM
        System.out.println("********************  SACAR EL VALOR ORDINAL DE LOS ELEMENTOS DE UN ENUM  ***************************  ");
        int ordinalDiaSemana = diaSemana.ordinal();
        System.out.println("numeoro ordinal del dia de la semana "+ordinalDiaSemana);
        System.out.println("nombre del elemento enum "+diaSemana.name());

//USO DENTRO DE UN FOR
        System.out.println("********************  USO DENTRO DE UN FOR DE LOS ELEMENTOS DE UN ENUM  ***************************  ");
        for (DiaSemana myVar : DiaSemana.values()) {
            System.out.println(myVar);
            System.out.println(myVar.ordinal());
        }

//VALUES RETORNA UN ARRAY CON LOS NOMBRES EN STRING DE CADA ENUMERACION

        System.out.println("ARRAY DEVUELTO ACCESO A LOS ELEMENTOS");
        System.out.println("DiaSemana.values()[0]  =  "+DiaSemana.values()[0]);

        System.out.println("DiaSemana.values()[3]  =  "+DiaSemana.values()[3]);

        System.out.println("DiaSemana.values()[6]  =  "+DiaSemana.values()[6]);

    }
}
