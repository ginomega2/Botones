package SwitchNuevo;

enum Dia { LUNES, MARTES,MIERCOLES,JUEVES, VIERNES; }
enum Mes{ENERO, FEBRERO, MARZO, ABRIL, MAYO, JUNIO,JULIO, AGOSTO, SEPTIEMBRE, OCTUBRE, NOVIEMBRE, DICIEMBRE}
public class SwitchConEnums {

    public static void main(String[] args) {
        int numeroDeLetras;
        Mes mes= Mes.ABRIL;
        mes= Mes.JUNIO;
        /*
        {   ,      }
        4 LETRAS:  MAYO
        5 LETRAS: ENERO, MARZO, JUNIO,JULIO, ABRIL,
        6 LETRAS: AGOSTO,
        7 LETRAS: FEBRERO,OCTUBRE,
        8  :
        9  : DICIEMBRE, NOVIEMBRE,
        10 : SEPTIEMBRE,
         */
        ////*****************************  SWICTH COMO EXPRESION   *****************************
        numeroDeLetras = switch (mes){
            case MAYO -> 4;
            case ENERO,MARZO, JUNIO,JULIO,ABRIL ->5;
            case AGOSTO -> 6;
            case FEBRERO,OCTUBRE -> 7;
            case DICIEMBRE, NOVIEMBRE ->  9;
            case SEPTIEMBRE -> 10;
            default -> 0;
        };

        System.out.println("El mes de "+mes+ " tiene "+numeroDeLetras+" letras");



        ////*****************************  SWICTH COMO SENTENCIA   *****************************


        mes=Mes.DICIEMBRE;
        numeroDeLetras=0;
        switch (mes){
            case MAYO: numeroDeLetras=4;
                break;
            case ENERO,MARZO,JUNIO,JULIO,ABRIL: numeroDeLetras=5;
                break;
            case AGOSTO: numeroDeLetras=6;
                break;
            case FEBRERO,OCTUBRE: numeroDeLetras=7;
                break;
            case DICIEMBRE,NOVIEMBRE: numeroDeLetras=9;
                break;
            case SEPTIEMBRE:numeroDeLetras=10;
                break;
            default:numeroDeLetras=0;

        }
        System.out.println("El mes de "+mes+ " tiene "+numeroDeLetras+" letras");

    }

}
