package ModificadoresDeAcceso;

public class Protejido {

        protected static int atributo1;//Atributo protected
        private static int atributo2; //Atributo privado
        int atributo3;//Atributo por default

        public static int getAtributo2()
        {
            return atributo2;
        }
    }


