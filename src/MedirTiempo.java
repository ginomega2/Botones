public class MedirTiempo {
    public static void main(String[] args) {

        ///**************** INICIALIZA startTime para OBTENER EL TIEMPO DEL SISTEMA DE LA JVM EN NANOSEGUNDO   ****************
        final long startTime = System.nanoTime();

        for (int x=0;x<10000;x++){
            System.out.println("proceso.....");
        }

        ///**************** tiempoFinal  OBTENER EL TIEMPO DEL SISTEMA DE LA JVM EN NANOSEGUNDO   ****************
        double tiempoFinal=System.nanoTime();
        System.out.println("inicio "+startTime);
        System.out.println("final "+ tiempoFinal);

        /// CALCULAMOS EL TIEMPO TRANSCURRIDO
        final double elapsedTime = 1e-6d * (tiempoFinal - startTime);



        System.out.println("Test de duracion " + elapsedTime + " ms.");
    }
}
