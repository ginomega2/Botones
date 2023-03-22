import javax.swing.*;

//**********************   CREACION DE BOTONES     ********************************
public class MyFrame  extends JFrame {
    MyFrame(){
//PASO 1  *************** Crear con instancia y definir posicion y tamanio
        JButton button = new JButton();
        button.setBounds(200,100, 100,50);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);

//PASO 1.1  ******  agregar el boton al frame
        this.add(button);
        this.setVisible(true);
    }
}
