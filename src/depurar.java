public class depurar {
    int a;
    static long b;
    static char c;

    depurar(){
        a=0;
        b=5;
        c='A';
    }

    public static void main(String[] args) {

        ClaseDepurar claseDepurar = new ClaseDepurar();
        claseDepurar.setId(10);
        claseDepurar.setName("la claseDepurar");
        System.out.println(" id "+claseDepurar.getId() + " nombre "+claseDepurar.getName());



        ClaseDepurar otraDepurar=null;
        otraDepurar=claseDepurar;
        System.out.println(claseDepurar);
        System.out.println(otraDepurar);

        System.out.println("va a contar");
        contar(10);
        b=4;
        c ='c';
        contar(20);

    }

    private static void contar(int i) {
        for(int x=0;x<=i;x++){
            System.out.println(" conteo "+x);
        }
    }
}
