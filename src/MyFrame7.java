    import k33ptoo.components.KButton;

    import javax.swing.*;

//**********************  1 CREACION DE BOTONES     ********************************
public class MyFrame7 extends JFrame {
    MyFrame7(){
//PASO 1  *************** Crear con instancia del boton y definir posicion y tamanio
//        JButton button = new JButton();
        KButton kButton = new KButton();
        kButton.setText("texto el boton");
        kButton.setBounds(100,100,200,200);
        kButton.setkBorderRadius(50);
        kButton.kAllowGradient=true;
        kButton.setFocusable(false);
        kButton.setFocusPainted(false);

//        button.setBounds(200,100, 100,50);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);

//PASO 1.1  ******  agregar el boton al frame
        this.add(kButton);
        this.setVisible(true);
    }
}
