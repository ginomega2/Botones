package herencia3Interfaces;
////**************** PASO 7 CREAMOS LA CLASE Gorrion  *********************************
//// AQUI TENEMOS UN PROBLEMA PUES LOS GORRIONES SI VUELAN PERO LOS POLLOS NO COMO SEPARAMOS ESTE COMPORTAMIENTO ???? EN PASO 8 clase pollo metodo volar lo sobre escribimos


public class Gorrion extends Ave{
    public Gorrion(int edad, String genero, int pesoEnKilos) {
        super(edad, genero, pesoEnKilos);
    }
}
