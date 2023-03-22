import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//********************** 4  personaliza botones     ********************************


public class MyFrame4 extends JFrame implements ActionListener {

    //Definimos el boton fuera del contructor para que sea global para todos los metodos del objeto
    JButton button;
    MyFrame4(){
//4.1 Crear un icono para el boton
        Icon icon = new ImageIcon(getClass().getResource("start.png"));
        // *************** Crear el boton con instancia y definir posicion y tamanio
        button = new JButton();

//4.2 modificar el tamano del boton
        button.setBounds(200,100, 500,300);

        //le agregamos un un Listener para escuchar acciones en el boton
        button.addActionListener(this);

//4.3 AGREGAR TEXTO AL BOTON
        button.setText("Soy un boton Dame click");
//4.4 PARA QUITAR EL MARCO A LAS LETRAS PONEMOS EN FALSE EL FOCUSABLE
        button.setFocusable(false);
//4.5 ponemos  el icono al boton
        button.setIcon(icon);
//4.6 cambiamos la orietacion vertical y horizontal
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
//4.7 cambiamos el tipo de letra
        button.setFont(new Font("helvetica",Font.ITALIC,20));
//4.7 cambiamos la distancia del texto al icono
        button.setIconTextGap( -4);
//4.7 cambiamos color del texto y color de fondo
        button.setForeground(Color.red);
        button.setBackground(Color.LIGHT_GRAY);
//4.8 cambiamos bordes
        button.setBorder(BorderFactory.createEtchedBorder());
//4.9 OPCIONAL PODEMOS DESABILITAR EL BOTON practica: hacer que cuando se de click el boton se deshabilite
//        button.setEnabled(false);


//4.7 cambiamos alineacion del icono
        button.setVerticalAlignment(JButton.TOP);


        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(1000,1000);

        //******  agregar el boton al frame
        this.add(button);
        this.setVisible(true);
    }

    // este metodo permite ejecutar codigo al escuchar eventos
    @Override
    public void actionPerformed(ActionEvent e) {
        //verificamos si el evento fue emitido por el boton
        if(e.getSource()==button){
            System.out.println("presionaste el boton de la ventana");
//4.9 OPCIONAL PODEMOS DESABILITAR EL BOTON practica: hacer que cuando se de click el boton se deshabilite
//            button.setEnabled(false);
        }

    }
}

