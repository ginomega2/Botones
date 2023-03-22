package guiPearson;

import javax.swing.*;
import java.awt.*;

public class GUI1 {
    public static void main(String[] args) {
        JFrame jf = new JFrame("GUI COMPONENTS");
        jf.setLayout(new GridLayout(2,2));

        JButton button = new JButton("dame click");
        JTextField tf = new JTextField();


        JPanel p = new JPanel();

        JRadioButton cb1 =  new JRadioButton("ingles");
        JRadioButton cb2 = new JRadioButton("frances");
        JRadioButton cb3 = new JRadioButton("aleman");

        ButtonGroup group = new ButtonGroup();
        group.add(cb1);
        group.add(cb2);
        group.add(cb3);

        p.setLayout(new GridLayout(3,1));
        p.add(cb1);
        p.add(cb2);
        p.add(cb3);

        String [] labels ={"alfonso","juanita","blue demon"};
        JList l = new JList(labels);


        jf.add(button);
        jf.add(tf);
        jf.add(p);
        jf.add(l);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setBounds(500,500,300,200);

        jf.setVisible(true);



    }
}
