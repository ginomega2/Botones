package Cadenas;


import javax.swing.*;

public class CapturaConJPane {
    public static void main(String[] args) {


        Cuenta cuenta1= new Cuenta();
        cuenta1.setNombre(JOptionPane.showInputDialog("Nombre del cliente:"));
        cuenta1.setNumeroCuenta(JOptionPane.showInputDialog("Numero de cuenta"));
        cuenta1.setTipoInteres(Double.parseDouble(JOptionPane.showInputDialog("Tipo de interes: ")));
        cuenta1.ingreso(Integer.parseInt(JOptionPane.showInputDialog("Cantidad a onhgresar a la cuenta")));

        System.out.println(cuenta1.getNombre());
        System.out.println(cuenta1.getTipoInteres());
        System.out.println(cuenta1.getSaldo());
        cuenta1.ingreso(20000);
        System.out.println(cuenta1);
        Cuenta cuenta2= new Cuenta("gabino barrera","12548lk",12d,10000d);
        System.out.println(cuenta2);

    }

}
