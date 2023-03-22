package ModificadoresDeAcceso;

public class AccesoRunner {

    public static void main(String[] args) {

        Privado privado = new Privado();  //Solo accede a metods publicos no a los privados
        privado.setAtributo1(2);//atributo publico
        System.out.println(privado.getAtributo1());//atributo publico
        //privado.atributo1;   //esta linea da error de compilacion es privado


        //Accedemos a la propiedad por default que es estatica por medio de getContador()
        PorDefault porDefault = new PorDefault();
        System.out.println(getContador());


        //
        Protejido protejido = new Protejido();
        System.out.println(Protejido.atributo1); //SI ACCEDE PORQUE ES PROTECTED
        //LAS 2 LIENAS SIGUIENTES NO COMPILAN PORQUE SON
//        System.out.println(Protejido.atributo2);        //PRIVADO
//        System.out.println(Protejido.atributo3);        //POR DEFAULT

    }

    public static int getContador()
    {
        return PorDefault.contador;//Accedemos directamente al contador desde otra clase esta como default
    }
}
