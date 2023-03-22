package guiPearson;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Scanner;




public class GUI2 {

    private  JFrame theFrame ;
    private JButton theButton;
    private JTextArea theText;

    public void go(){

        theFrame = new JFrame("GUI 2");
        theFrame.setLayout(new GridLayout(2,1));
        theButton=new JButton("click me");
        theText= new JTextArea("edita esto");


        class MyButtonHandler implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("mensaje recibido de la ventana con el cuadro de texto " + theText.getText());
                System.out.println("el boto fue clikado ");
                theText.append("\n bboton clickado a las "+ new Date());
            }
        }
        theButton.addActionListener(new MyButtonHandler());


        theFrame.add(theButton);
        theFrame.add(theText);
        theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        theFrame.setBounds(500,500,300,200);
        theFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new GUI2().go();
    }
}


/*

    How we convert int to String in Java: using Integer.toString(int)
    How we convert int to String in Java: using String.valueOf(int)
    How we convert int to String in Java: using String.format()
    How we convert int to String in Java: using DecimalFormat
    How we convert int to String in Java: using StringBuffer or StringBuilder
 */