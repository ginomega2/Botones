package ObjetosBasicos;

public class ManejoDeEquals {

    public static void main(String[] args) {
        ClaseHija hija1 = new ClaseHija(5);
        ClaseHija hija2= new ClaseHija(6);

        ///*******************   EQUALS TIENE QUE SER IMPLEMENTADO POR EL PROGRAMADOR PARA COMPARA ONJETOS PROPIOS   **********************
        if(hija1.equals(hija2)){
            System.out.println("las hijas son iguales");
        }else {
            System.out.println("las hijas son diferentres");
        }

    }
}
