
public class ClaseDepurar {
    private int id;
    private String name;

    static {
        System.out.println("Yo soy codigo estatico");
    }

    public ClaseDepurar(int id, String name) {
        System.out.println("hola soy el constructor con parametros");
        this.id = id;
        this.name = name;
    }

    public ClaseDepurar() {
        System.out.println("hola soy el constructor");
    }

    public int getId() {
        System.out.println("yo soy getId");
        return id;
    }

    public void setId(int id) {
        System.out.println("yo soy setId");
        this.id = id;
    }

    public String getName() {
        System.out.println("yo soy getName");
        return name;
    }

    public void setName(String name) {
        System.out.println("yo soy SetName");
        this.name = name;
    }
}
