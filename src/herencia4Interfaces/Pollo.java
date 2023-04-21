package herencia4Interfaces;

////**************** PASO 6 CREAMOS LA CLASE Pollo  *********************************
public class Pollo extends Ave {
    public Pollo(int edad, String genero, int pesoEnKilos) {
        super(edad, genero, pesoEnKilos);
    }



    //************** PASO 12 quitamos el metodo volar de la clase pollo porque no vuela pero gorrion tendra problemas asi que le agregamos la inteface en paso 13
    // para implementarla en gorrion
//    @Override
//    public void volar() {
//        System.out.println("no puede volar");
//    }
}
