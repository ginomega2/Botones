package Graficos;

import javax.swing.*;
import java.awt.*;

public class MiVentana extends JFrame {


    MiPanel panel;

    MiVentana(){
        panel=new MiPanel();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();this.setLocationRelativeTo(null);
        this.setVisible(true);

    }

}
