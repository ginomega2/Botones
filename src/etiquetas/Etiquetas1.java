package etiquetas;
import javax.swing.*;
////**********************  1 CREACION DE etiquetas    ********************************
public class Etiquetas1 {

// 1.1 CREAMOS LA ETIQUETA Y LE AGREGAMOS UN ICONO
    ImageIcon whastapp = new ImageIcon(getClass().getResource("whatsapp2.png"));
    ImageIcon imagen = new ImageIcon(getClass().getResource("hogar.png"));

    Etiquetas1(){
// 1.1 CREAMOS LA ETIQUETA Y LE AGREGAMOS UN TEXRO Y UN ICONO
        JLabel label =  new JLabel("Contacto de whatsapp 66 99 55 44 88 77 ");
        //label.setIcon(whastapp);

        JFrame frame = new JFrame();//crea el frame
        frame.setTitle("Etiquetas 1 ");//título 2de la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//cierra el programa al presionar el boton de cierre X
        // DO_NOTHING_ON_CLOSE, HIDE_ON_CLOSE, DISPOSE_ON_CLOSE, or EXIT_ON_CLOSE son las opciones iniciales posibles
        frame.setResizable(true);//evitamos que se cambie el tamaño del frame
        frame.setSize(1000,1000);//le damos ancho de 800 alto de 600

// 1.2 AGREGAMOS EL LABEL
        frame.add(label);

        frame.setVisible(true);//hacemos visible la ventana
        frame.setIconImage(imagen.getImage());
    }

}
