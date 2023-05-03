package Interfaces.impuestos;

public class ReporteImpuestos {
    private CalculadoraImpuestos calculadoraImpuestos;

    public ReporteImpuestos() {
        this.calculadoraImpuestos = new CalculadoraImpuestos(1000);
    }

}
