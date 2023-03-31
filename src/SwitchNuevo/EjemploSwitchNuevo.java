package SwitchNuevo;

///****************************  USO DE SWICTH COMO EXPRESION Y COMO SENTENCIA

public class EjemploSwitchNuevo {

    final static int LUNES=1;
    final static int  MARTES=2 ;
    final static int  MIERCOLES=3 ;
    final static int  JUEVES=4 ;
    final static int  VIERNES=5 ;
    final static int  SABADO=6 ;
    final static int  DOMINGO=7 ;

    public static void main(String[] args) {

        //*** HACER UN PROGRAMA QUE DETERMINE SI ES DIA LABORABLE O NO LUN-VIE LABORABLE  SAB-DOM NO LABORABLE

        int diaActual =MARTES;

        boolean esDiaLaborable=false;

        ////***************  FORMA NUEVA COMO EXPRESION OJO SOLO PARA DEVOLVER VALORES  *******************************
        esDiaLaborable = switch (diaActual){
            case LUNES, MARTES, MIERCOLES, JUEVES,VIERNES->true;
            case SABADO,DOMINGO -> false;
            default -> false;
        };

        ////***************  FORMA NUEVA COMO EXPRESION CUANDO SE QUIERE EJECUTAR MAS DE UN PROCESO  *******************************

        System.out.println(esDiaLaborable ?"SI se trabaja" + diaActual:"NO no se trabaja " +diaActual);

        diaActual=6;

        esDiaLaborable = switch (diaActual) {
            case SABADO, DOMINGO ->{
                System.out.println("es fin de semana");
                yield false;
            }
            case LUNES, MARTES -> {
                System.out.println("inicio de semana");
                yield true;
            }
            case MIERCOLES ->{
                System.out.println("ombligo de semana");
                yield true;
            }
            case JUEVES,VIERNES -> {
                System.out.println("ya casi es fin de semana");
                yield true;
            }
            default -> {
                System.out.println("no es un dia valido revisa pro favor");
                yield false;
            }
        };

        //**************  FORMA TRADICIONAL COMO SENTENCIA   ******************************



    }

}
