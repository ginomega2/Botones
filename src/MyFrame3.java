import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//********************** 2  CREACION DE BOTONES     ********************************

//PASO 2  *************** Implwmwntar un Listener en la clase para el manejo de eventos
public class MyFrame2 extends JFrame implements ActionListener {

//2.1 Definimos el boton fuera del contructor para que sea global para todos los metodos del objeto
    JButton button;
    MyFrame2(){
        // *************** Crear el boton con instancia y definir posicion y tamanio
        button = new JButton();
        button.setBounds(200,100, 100,50);

//2.4  le agregamos un un Listener para escuchar acciones en el boton
        button.addActionListener(this);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);

        //******  agregar el boton al frame
        this.add(button);
        this.setVisible(true);
    }

//2.3 este metodo permite ejecutar codigo al escuchar eventos
    @Override
    public void actionPerformed(ActionEvent e) {
        //verificamos si el evento fue emitido por el boton
        if(e.getSource()==button){
            System.out.println("presionaste el boton de la ventana");
        }

    }
}
