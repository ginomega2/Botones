
package Cadenas;

import java.io.IOException;

public class BorraPantalla {
    public static void main(String[] args) throws IOException, InterruptedException    {
        System.out.println("pruba de borrado de pantalla");

//        System.out.print("\033[H\033[2J");
//        System.out.flush();

        new ProcessBuilder("cmd", "/c", "dir").inheritIO().start().waitFor();
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        new ProcessBuilder("cmd", "/c", "java --version").inheritIO().start().waitFor();
        new ProcessBuilder("cmd", "/c", "notepad").inheritIO().start().waitFor();


//        try
//        {
//            final String os = System.getProperty("os.name");
//            if (os.contains("Windows"))
//            {
//                Runtime.getRuntime().exec("cls");
//            }
//        }
//        catch (final Exception e)
//        {
//            e.printStackTrace();
//        }
    }
}
