package Carritosdecompras;

public class Descuentospormontos extends Descuento {
    private double montoMinimo;

    public Descuentospormontos(String nombre, double porcentajeDescuento, double montoMinimo) {
        super(nombre, porcentajeDescuento);
        this.montoMinimo = montoMinimo;
    }

    public double getMontoMinimo() {
        return montoMinimo;
    }

    public boolean aplicaDescuento(double precioTotal) {
        return precioTotal >= montoMinimo;
    }
}
