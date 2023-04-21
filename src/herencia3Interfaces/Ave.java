package herencia3Interfaces;

///**************************  PASO 3 EXTENDEMOS LA CALSE ANIMAL PARA QUE HEREDEN LOS METODOS DEL PADRE ojo con el constructor   *******************************
public class Ave  extends Animal {
    public Ave(int edad, String genero, int pesoEnKilos) {
        super(edad, genero, pesoEnKilos);
    }

    public void volar(){
        System.out.println("volando");
    }
}
