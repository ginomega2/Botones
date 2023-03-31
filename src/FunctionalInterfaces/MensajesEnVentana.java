package FunctionalInterfaces;

import javax.swing.*;

public class MensajesEnVentana implements ServidorDeMensajes {
    @Override
    public void imprimeMensaje(String mensaje) {

        JOptionPane.showMessageDialog(null,mensaje,"titulo con mensaje"+mensaje,JOptionPane.PLAIN_MESSAGE);

    }
}
