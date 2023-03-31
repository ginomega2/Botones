package FunctionalInterfaces;

public class LambaMensajeDemo {


    //greet
    public static void imprimirDesdeFuncionEstatica(String mensaje){
        System.out.println(mensaje  );


    }
    public void imprimirDesdeFuncionDeInstancia(String mensaje){
        System.out.println(mensaje);
    }
    public static void saludar(ServidorDeMensajes servidorDeMensajes,String mensaje){
        servidorDeMensajes.imprimeMensaje(mensaje);
    }

    public static void main(String[] args) {

        saludar(new ServidorDeMensajes() {
            @Override
            public void imprimeMensaje(String mensaje) {
                System.out.println(mensaje);

            }
        },"mensaje desde una implementacion anonima");

        //greet
        saludar(new MensajesSinColor(),"HOLA QUE PEX MENSAJE SIN COLOR desde MensajesSinColor()" );
        saludar(new MensajesConColor(),"este mensaje es con color aleatorio new MensajesConColor()");
        saludar(new MensajesEnVentana(),"este mensaje se envio a esta ventana desde una interfaz funcional new MensajesEnVentana()");




        saludar((String mensaje)-> System.out.println(mensaje),"mensaje desde lamba");
        saludar(mensaje-> System.out.println(mensaje),"mensaje desde lamba recortado");
        saludar(System.out::println,"mensaje desde referencia a metodo");

        ServidorDeMensajes servidorDeMensajes = new MensajesConColor();
        saludar(servidorDeMensajes,"mensaje enviado dedes instancia MensajesConColor();");

        servidorDeMensajes = mensaje -> System.out.println(mensaje);
        saludar(servidorDeMensajes,"mensaje desde lambda con implementacion anonima");

        String prefijoRuta="C:\\";
        servidorDeMensajes = ruta -> System.out.println(prefijoRuta+ruta);
        saludar(servidorDeMensajes,"carpetaPadre\\carpetaHijo");

        String prefijoHeader="<H1>";
        String sufijoHeader="</H1>";
        servidorDeMensajes =  textoHeader -> System.out.println(prefijoHeader+textoHeader+sufijoHeader);
        saludar(servidorDeMensajes,"MENSAJE TIPO HTML HEADER");

        saludar(System.out::println,"mensaje desde referecnia a System.out::println");
        saludar(LambaMensajeDemo::imprimirDesdeFuncionEstatica,"mensaje enviado desde funcion estatica con referncia a metodo LambaMensajeDemo::imprimirDesdeFuncionEstatica");



        ServidorDeMensajes mensajesConColor = new MensajesConColor();
        saludar(mensaje -> mensajesConColor.imprimeMensaje(mensaje),"MENSAJDE DESDE INSTACIA new MensajesConColor(); EN UNA LAMBDA");
        saludar(mensajesConColor::imprimeMensaje,"mensaje con referencia a metodo mensajesConColor::imprimeMensaje");

        var mensajeSinColor = new MensajesSinColor();
        saludar(mensajeSinColor::imprimeMensaje,"referencia a metodo DE INSTACIA mensajeSinColor::imprimeMensaje");

        var mensajeEnVentana = new MensajesEnVentana();
        saludar(mensajeEnVentana::imprimeMensaje,"referencia a metodo DE INSTACIA mensajeEnVentana::imprimeMensaje ");


    }
}
