package ObjetosBasicos;

public class ClaseObject {

    public static void main(String[] args) {
        //java.lang
        Object objeto = new Object();
        //TIENE LOS SIGUIENTES METODOS BASICO QUE SE HEREDAN A TODOS LOS DEMAS
        System.out.println(objeto.getClass());//obtiene el nombre de la clase
        System.out.println(objeto.getClass().getName());//obtiene el nombre de la clase
        System.out.println(objeto.hashCode());//obtiene el hash code
        System.out.println(objeto.toString());//obtenes el string del objeto
        System.out.println(objeto);
//        objeto.wait();
//        objeto.notify();
//        objeto.notifyAll();
//        objeto.toString();
//        objeto.getClass();
//        objeto.equals(new Object());
//
//
//
        ClaseHija claseHija =  new ClaseHija();
        System.out.println(claseHija.getClass());//obtiene el nombre de la clase
        System.out.println(claseHija.getClass().getName());//obtiene el nombre de la clase
        System.out.println(claseHija.hashCode());//obtiene el hash code
        System.out.println(claseHija.toString());//obtenes el string del objeto
        System.out.println(claseHija);
        System.out.println("""
                asdfasdf
                asdf
                sad
                fas
                f
                sf
                as
                fs
                dfa
                sd""");
    }
}
