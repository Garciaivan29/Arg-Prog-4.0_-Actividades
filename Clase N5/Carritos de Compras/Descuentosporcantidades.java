package Carritosdecompras;

public class DescuentoPorCantidades extends Descuento {
    private int cantidadMinima;

    public DescuentoPorCantidades(String nombre, double porcentajeDescuento, int cantidadMinima) {
        super(nombre, porcentajeDescuento);
        this.cantidadMinima = cantidadMinima;
    }

    public int getCantidadMinima() {
        return cantidadMinima;
    }

    public boolean aplicaDescuento(int cantidad) {
        return cantidad >= cantidadMinima;
    }
}
