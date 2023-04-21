package herencia3Interfaces;

///**********************  PASO 5  DEFINIMOS INTERFACE PARA PODER AGREGAR MAS OBJETOS DE TIPO AVE PERO UNOS QUE SI VUELAN Y OTROS QUE NO VUELAN   *******************
/// CREAREMOS NUEVAS CLASES DE TIPO AVE COMO SON Pollo (no vuela) y Gorrion(si vuela)
//// podemos hacerlo de varia maneras pero primero crear las clases nuevas que hereden de ave
public class Zologico {
    public static void main(String[] args) {
        Animal animal1= new Animal(2,"masculino",76);
        System.out.println("********************* animal esta  ********************");
        animal1.comer();
        animal1.dormir();
        System.out.println("*************  ave esta  *****************");
        Ave ave1 = new Ave(3,"femenino",10);
        ave1.volar();
        ave1.comer();
        ave1.dormir();

        //******************** PASO 9 VERIFICAMOS QUE EL POLLO YA NO VUELE
        System.out.println("*************  pollo esta  *****************");
        Pollo pollo = new Pollo(2,"masculino",8);
        pollo.comer();
        pollo.dormir();
        pollo.volar();
        System.out.println("*************  gorrion esta esta  *****************");
        Gorrion gorrion = new Gorrion(2,"masculino",4);
        gorrion.comer();
        gorrion.dormir();
        gorrion.volar();



    }
}
