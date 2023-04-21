package herencia;
///**************************  PASO 1 DEFINIMOS LAS CLASES BASICAS SI HERENCIA   *******************************

public class Zologico {
    public static void main(String[] args) {
        Animal animal1= new Animal(2,"masculino",76);
        System.out.println("animal esta ");
        animal1.comer();
        animal1.dormir();
        System.out.println("ave esta ");
        Ave ave1 = new Ave();
        ave1.volar();
    }
}
