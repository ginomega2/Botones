package herencia4Interfaces;
////**************** PASO 7 CREAMOS LA CLASE Gorrion  *********************************
//// AQUI TENEMOS UN PROBLEMA PUES LOS GORRIONES SI VUELAN PERO LOS POLLOS NO COMO SEPARAMOS ESTE COMPORTAMIENTO ???? EN PASO 8


public class Gorrion extends Ave implements Volable{    /// PASO 14 IMPLEMENTAMOS LA INTERFACE VOLABLE solo en gorrion y lisro el codigo
                                                        // ya funciona con un ave que vuela y otra que no probar zoologico
    public Gorrion(int edad, String genero, int pesoEnKilos) {
        super(edad, genero, pesoEnKilos);
    }

    @Override
    public void volar() {
        System.out.println("volando");
    }
}
