import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//********************** 3  VERSION AVANZADA DEL LISTENER CON EXPRESIONES LAMBDA Y CONTADOR DE CLICKS    ********************************

//PASO 3  *************** quitar la Implwmwntar ActionListener
public class MyFrame3 extends JFrame {

    //Definimos el boton fuera del contructor para que sea global para todos los metodos del objeto
    JButton button;
    int contadorDeClicks =1;
    MyFrame3(){
        // *************** Crear el boton con instancia y definir posicion y tamanio
        button = new JButton();
        button.setBounds(200,100, 100,50);

//PASO 3.2  IMPLEMENTA LA EXPRESION LAMBDA EN EL LISTENER DE ACCIONES CON EL CONTADOR DE CLICKS
        button.addActionListener(e-> System.out.println("expresiones lambda ejecutadas en el evento del boton = "+contadorDeClicks++));

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);

        //******  agregar el boton al frame
        this.add(button);
        this.setVisible(true);
    }

//PASO 3.1 quitar el metodo implementado

    }

