package herencia4Interfaces;

///**********************  PASO 10 CREAMOS UNA INTERFACE CON LA HABILIDAD DE VOLAR Y QUITAMOS EL METODO VOLAR DE LA CLASE AVE AVE esto provocafa probelmas en el codigo hay que modificarlo
public class Zologico {
    public static void main(String[] args) {
        Animal animal1= new Animal(2,"masculino",76);
        System.out.println("********************* animal esta  ********************");
        animal1.comer();
        animal1.dormir();
        System.out.println("*************  ave esta  *****************");
        Ave ave1 = new Ave(3,"femenino",10);
        //paso 11 quitar volar de ave la siguiente liena la pondremos como comentario
        //paso 11a quitar        ave1.volar();

        ave1.comer();
        ave1.dormir();
        System.out.println("*************  pollo esta  *****************");
        Pollo pollo = new Pollo(2,"masculino",8);
        pollo.comer();
        pollo.dormir();

        //** paso 11b quitamos volar de pollo porque no vuela
        //pollo.volar();

        System.out.println("*************  gorrion esta esta  *****************");
        Gorrion gorrion = new Gorrion(2,"masculino",4);
        gorrion.comer();
        gorrion.dormir();
        //** paso 11c el problema es que gorrion ya no puede volar para solucionarlo usaremos la interface
        gorrion.volar();



    }
}
