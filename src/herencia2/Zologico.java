package herencia2;
///**************************  PASO 2 DEFINIMOS LA HERENCIA DE ANIMAL A PEZ AVE   *******************************
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
    }
}
