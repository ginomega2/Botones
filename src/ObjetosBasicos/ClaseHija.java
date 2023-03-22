package ObjetosBasicos;

public class ClaseHija {
    int a;

    public ClaseHija() {
    }

    public ClaseHija(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

//    @Override
//    public String toString(){
//        return "valor interno a"+a;
//    }


    // Se sobreescribe el metodo equals()
    public boolean equals( Object arg ) {
        // Se comprueba que el argumento es del tipo adecuado y
        // que no es nulo. Si lo anterior se cumple se realiza
        // la comprobacion de equivalencia de los datos.
        // Observese que se ha empleado el operador instanceof
        if( (arg != null) && (arg instanceof ClaseHija) ) {
            // Hacemos un moldeado del Object general a tipo java511
            ClaseHija temp = (ClaseHija)arg;

            // Se realiza la comparacion y se devuelve el resultado
            return( this.getA() == temp.getA() );
        }
        else {
            // No es del tipo esperado
            return( false );
        }
    }

}
