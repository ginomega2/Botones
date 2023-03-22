import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

//********************** 5 INTERACCION CON OTROS ELEMENTOS eriquetas    ********************************


public class MyFrame6 extends JFrame implements ActionListener {

    //Definimos el boton fuera del contructor para que sea global para todos los metodos del objeto
    JButton button;
//5.1 Definimos el label
    JLabel label = new JLabel();
    boolean esVisuble= false;
    int x=150;

    ImageIcon puerta1 = new ImageIcon(getClass().getResource("puerta1c.jpg"));
    ImageIcon puerta2 = new ImageIcon(getClass().getResource("puerta2c.jpg"));
    ImageIcon puerta3 = new ImageIcon(getClass().getResource("puerta3c.jpg"));
    MyFrame6(){
        //Crear un icono para el boton
        ImageIcon icon = new ImageIcon(getClass().getResource("start.png")); //        Icon icon = new ImageIcon(getClass().getResource("start.png"));

// 5.2 crear el labe y el icono para e label, defnr posicion y tamano y la visivilidada en false



        label.setIcon(puerta1);
        label.setBounds(300,600,500,300);
        label.setVisible(esVisuble);


        // *************** Crear el boton con instancia y definir posicion y tamanio
        button = new JButton();

        //modificar el tamano del boton
        button.setBounds(200,100, 500,300);
        //le agregamos un un Listener para escuchar acciones en el boton
        button.addActionListener(this);
        //AGREGAR TEXTO AL BOTON
        button.setText("Soy un boton Dame click");
        //PARA QUITAR EL MARCO A LAS LETRAS PONEMOS EN FALSE EL FOCUSABLE
        button.setFocusable(false);
        //ponemos  el icono al boton
        button.setIcon(icon);
        //cambiamos la orietacion vertical y horizontal del texto
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        //cambiamos el tipo de letra
        button.setFont(new Font("helvetica",Font.ITALIC,20));
        //cambiamos la distancia del texto al icono
        button.setIconTextGap( -4);
        //cambiamos color del texto y color de fondo
        button.setForeground(Color.red);
        button.setBackground(Color.LIGHT_GRAY);
        //cambiamos bordes
        button.setBorder(BorderFactory.createEtchedBorder());
        // OPCIONAL PODEMOS DESABILITAR EL BOTON practica: hacer que cuando se de click el boton se deshabilite
        //        button.setEnabled(false);


        //cambiamos alineacion del icono
        button.setVerticalAlignment(JButton.TOP);
        button.setHorizontalAlignment(JButton.CENTER);


        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(1000,1000);

        //******  agregar el boton al frame
        this.add(button);
        this.add(label);
        this.setVisible(true);
    }

    // este metodo permite ejecutar codigo al escuchar eventos
    @Override
    public void actionPerformed(ActionEvent e) {
        //verificamos si el evento fue emitido por el boton
        if(e.getSource()==button){
            System.out.println("presionaste el boton de la ventana");

            if(!label.isVisible())
                label.setVisible(true);

            Random random = new Random();
            int puertaAleatoria = random.nextInt(3)+1;
            switch (puertaAleatoria){
                case 1:
                    label.setIcon(puerta1);
                    label.setText("puerta de la desesperacion");
                    break;
                case 2:
                    label.setIcon(puerta2);
                    label.setText("puerta de la soledad");
                    break;
                case 3:
                    label.setIcon(puerta3);
                    label.setText("puerta de alcala");
                    break;
            }




        }

    }
}

