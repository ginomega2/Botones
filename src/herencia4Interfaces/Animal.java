package herencia4Interfaces;

public class Animal {
    private int edad;
    private String genero;
    private int pesoEnKilos;

    public Animal(int edad, String genero, int pesoEnKilos) {
        this.edad = edad;
        this.genero = genero;
        this.pesoEnKilos = pesoEnKilos;
    }

    public void comer(){
        System.out.println("comiendo");
    }
    public void dormir(){
        System.out.println("durmiendo");
    }
}
