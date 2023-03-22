package etiquetas;
import javax.swing.*;
import java.awt.*;

/// ************************  3 PARTE 3 COLOR Y TIPO DE LETRA   ****************************
public class Etiquetas3 {

    ImageIcon whastapp = new ImageIcon(getClass().getResource("whatsapp.png"));
    ImageIcon imagen = new ImageIcon(getClass().getResource("hogar.png"));

    Etiquetas3(){
        // CREAMOS LA ETIQUETA Y LE AGREGAMOS UN TEXRO Y UN ICONO
        JLabel label =  new JLabel("Contacto de whatsapp 66 99 55 44 88 77 ");
        label.setIcon(whastapp);

        /// ******************** DEFENIMOCS LA ORIENTACION DEL TEXTO HORIZONTAL puede ser
        /// JLabel.CENTER     JLabel.LEFT     JLabel.RIGHT probar las 3
        label.setHorizontalTextPosition(JLabel.CENTER);
        ///  ******************* DEFINIMOS LA ORIENTACION DEL TEXTO VERTICAL puede ser
        ///JLabel.TOP  JLabel.BOTTOM  JLabel.CENTER   probar las 3
        label.setVerticalTextPosition(JLabel.CENTER);


///3.1  ***************  CAMBIAMOS EL COLOR DE LETRA    ******************
        label.setForeground(new Color(231, 0, 30));
///3.2  ***************  CAMBIAMOS LA FUENTE DE LETRA OJO SAVCAR LOS TIPOS CON EL PROG FUENTES PROBAR DIF SIZE Y ESTILO   ******************
        label.setFont(new Font("helvetica",Font.BOLD,10));
///3.3  *************** CAMBIAR LA DISTANCIA DE SEPARACION ENTRE EL DIBUJO Y EL TEXTO
        label.setIconTextGap(50);// si ponemos valores negativos hace lo contrario acercaa la imagen
///3.3  *************** cambia el color de fondo se hace en 2 pasos
        label.setBackground(Color.orange);
        label.setOpaque(true);// para que tenga opacidad veras que la etiqueta ocupa toda la ventana

        JFrame frame = new JFrame();//crea el frame
        frame.setTitle("Etiquetas 3 ");//título 2de la ventana
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
