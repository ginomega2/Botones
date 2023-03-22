package etiquetas;
import javax.swing.*;

//// ********************** 2 ORIENTACION DEL TEXTO EN etiquetas    ********************************
public class Etiquetas2 {

    ImageIcon whastapp = new ImageIcon(getClass().getResource("whatsapp.png"));
    ImageIcon imagen = new ImageIcon(getClass().getResource("hogar.png"));

    Etiquetas2(){
        // CREAMOS LA ETIQUETA Y LE AGREGAMOS UN TEXRO Y UN ICONO
        JLabel label =  new JLabel("Contacto de whatsapp 66 99 55 44 88 77 ");
        label.setIcon(whastapp);

 /// PARTE 2.1  ******************** DEFENIMOCS LA ORIENTACION DEL TEXTO HORIZONTAL puede ser
        /// JLabel.CENTER     JLabel.LEFT     JLabel.RIGHT probar las 3
        label.setHorizontalTextPosition(JLabel.CENTER);
/// PARTE 2.2  ******************* DEFINIMOS LA ORIENTACION DEL TEXTO VERTICAL puede ser
        ///JLabel.TOP  JLabel.BOTTOM  JLabel.CENTER   probar las 3
        label.setVerticalTextPosition(JLabel.CENTER);

        JFrame frame = new JFrame();//crea el frame
        frame.setTitle("Etiquetas 2 ");//título 2de la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//cierra el programa al presionar el boton de cierre X
        // DO_NOTHING_ON_CLOSE, HIDE_ON_CLOSE, DISPOSE_ON_CLOSE, or EXIT_ON_CLOSE son las opciones iniciales posibles
        frame.setResizable(true);//evitamos que se cambie el tamaño del frame
        frame.setSize(1000,1000);//le damos ancho de 800 alto de 600

        //AGREGAMOS EL LABEL
        frame.add(label);

        frame.setVisible(true);//hacemos visible la ventana
        frame.setIconImage(imagen.getImage());
    }

}
