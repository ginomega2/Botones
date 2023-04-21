package herencia5ClasesAbstractas;

public class Pez extends Animal {
    public Pez(int edad, String genero, int pesoEnKilos) {
        super(edad, genero, pesoEnKilos);
    }

    public void nadar(){
        System.out.println("nadando");
    }
}
