package Interfaces.impuestos;

public class CalculadoraImpuestos {
    private double ingresoGravable;

    public CalculadoraImpuestos(double ingresoGravable) {
        this.ingresoGravable=ingresoGravable;
    }

    public double calcularImpuesto(){
        return this.ingresoGravable * 0.16;
    }
}
