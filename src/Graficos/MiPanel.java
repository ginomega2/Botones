package Graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MiPanel extends JPanel implements ActionListener {

    final int PANEL_ANCHO=800;
    final int PANEL_ALTO=800;
    Image enemy;
    ImageIcon puerta3 = new ImageIcon(getClass().getResource("whatsapp.png"));
    Image fondoImagen;
    Timer timer;
    int xVelocidad=1;
    int yVelocidad=1;
    int x=0,y=0;

    MiPanel(){
        this.setPreferredSize(new Dimension(PANEL_ANCHO,PANEL_ALTO));
        this.setBackground(Color.black);
//        enemy=new ImageIcon(getClass().getResource("ufo2.png")).getImage();
        enemy=new ImageIcon(getClass().getResource("titan01.png")).getImage();
        fondoImagen= new ImageIcon(getClass().getResource("espacio.jpg")).getImage();
//        enemy=new ImageIcon("Graficos/whatsapp.png").getImage();
        System.out.println(enemy.getSource());
        System.out.println(enemy.getHeight(this));
        System.out.println(fondoImagen);
        Random random=new Random();
        xVelocidad=random.nextInt(8)+1;


        timer=new Timer(1,this);
        timer.start();

    }

    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(fondoImagen, 0,0,null);
        g2D.drawImage(enemy, x,y,null);


//        g2D.drawRect(x,y,20,20);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Random random=new Random();
        int xVel,yVel;
//        int xVel=random.nextInt(3)+1;
//        System.out.println(xVel);
        System.out.println(xVelocidad);
        if (x>=PANEL_ANCHO-enemy.getWidth(null) || x<0){


            xVel=random.nextInt(10)+4;
            if(xVelocidad<0){
                x=0;
                xVel=xVel*-1;

            }

            xVelocidad=xVel;
            xVelocidad=xVelocidad * - 1;

        }
        x = x+ xVelocidad;


        if (y>=PANEL_ALTO-enemy.getHeight(null) || y<0){


            yVel=random.nextInt(10)+4;
            if(yVelocidad<0){

                y=0;
                yVel=yVel*-1;
            }
            yVelocidad=yVel;
            yVelocidad=yVelocidad * - 1;

        }
        y = y+ yVelocidad;
        repaint();


    }
}
