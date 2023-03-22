package Estaticos;

///  ************************ 1  PROPIEDADES ESTATICAS  totalDePersonas   ***************************
public class Persona {

/*1.1 DECLARAR LA PROPIEDAD ESTATICA QUE CONTARA EL NUMERO TOTAL DE PERSONAS INSTACIADAS
    LAS PROPIEDADES ESTATICAS SON MIEMBROS DE CLASE, SOLO SE PUEDE ACCESAR POR MEDIO DE LA CLASE NUNCA DE LA INSTANCIA
    totalDePersonas SERA ACCESIBLE asi ---->>>>   Persona.totalDePersonas;
 * */
    public static int  totalDePersonas;

    private int id;
    private String nombre;

//  1.2 CADA MIEMBRO SERA CONTADO AL MOMENTO DE CREAR LA INSTANCIA DE PERSONA
    public Persona() {
        System.out.println("esntrada al constructor sin parametros **  Persona() contador de persona se actualiza en +1 ");
        totalDePersonas++;//contador de persona se actualiza en 1
    }

    public Persona(int id, String nombre) {
        System.out.println("esntrada al constructor **  Persona(int id, String nombre) contador de persona se actualiza en +1");
        this.id = id;
        this.nombre = nombre;
        totalDePersonas++;//contador de persona se actualiza en 1
    }

    public static int getTotalDePersonas() {
        ImprimeTotalDePersonas(); // sise puede llamar porque es estatico

        return totalDePersonas;
    }

    public static void setTotalDePersonas(int totalDePersonas) {
        Persona.totalDePersonas = totalDePersonas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

//1.3  ES VALIDO CREAR METODO ESTATICOS TAMBIEN pero solo puede accesar a miembros estaticos e este caso solo a totalDePersonas

    public static void ImprimeTotalDePersonas(){
        System.out.println("esntrada al metodo estatico ImprimeTotalDePersonas()");
        System.out.println("total de instancias de personas = "+totalDePersonas);
        //MetodoNormal();   //ESTA LINEA CAUSARA ERROR DE COMPILACION PORQUE ESTA LLMANDO A METODO NORMAL DESDE UNO ESTATICO
    }

//1.4 ESTE METODO NORMAL NO PUEDE SER LLAMADO POR UN METODO ESTATICO PERO MetodoNormal() si puede llamar a miembros estaticos

    public void MetodoNormal(){
        System.out.println("INICIANDO  metodoMetodoNormal()") ;
        System.out.println("este metodo estatic no se puede accesar desde un metodo normal");
        ImprimeTotalDePersonas();// LLAMADA A UN METODO ESTTICO
    }

}
