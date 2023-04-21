package herencia2;
///**************************  PASO 4 EXTENDEMOS DE LA CALSE ANIMAL PARA QUE HEREDEN LOS METODOS DEL PADRE ojo con el constructor   *******************************
public class Pez extends Animal {
    public Pez(int edad, String genero, int pesoEnKilos) {
        super(edad, genero, pesoEnKilos);
    }

    public void nadar(){
        System.out.println("nadando");
    }
}
