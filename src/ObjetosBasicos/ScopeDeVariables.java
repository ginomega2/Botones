package ObjetosBasicos;

//**********************  RESOLVER EL ERROR   ********************//////////
public class ScopeDeVariables {
    public static void main(String[] args) {
        System.out.println("hola");
        eatMore(true,20);
        eatMore(false,50);

    }

    public static void eatMore(boolean hungry, int amountOfFood) {

        System.out.println("total de  comida recibida " + amountOfFood);

//        if (hungry) {
//            var timeToEat = true;
//            while (amountOfFood > 0 && roomInBelly>0) {
//
//                roomInBelly = roomInBelly - amountEaten;
//                amountOfFood = amountOfFood - amountEaten;
//                System.out.println("total de  comida " + amountOfFood);
//                System.out.println("espacio  en la panza " + roomInBelly);
//                System.out.println("cantidad que comiste " + amountEaten);
//
//            }
//        }else System.out.println("nop puedo comer no tengo hambre ");
//        System.out.println("Comida que sobro "+amountOfFood);
//
//        int roomInBelly = 10;
//        int amountEaten = 2;

    }
}
