package herencia3Interfaces;
////**************** PASO 6 CREAMOS LA CLASE Pollo  *********************************
public class Pollo extends Ave{
    public Pollo(int edad, String genero, int pesoEnKilos) {
        super(edad, genero, pesoEnKilos);
    }



    //************** PASO 8 SOBREESCRIBIMOS EL METODO VOLAR PARA INDICAR QUEESTE NO VUELA
    @Override
    public void volar() {
        System.out.println("no puede volar");
    }
}
