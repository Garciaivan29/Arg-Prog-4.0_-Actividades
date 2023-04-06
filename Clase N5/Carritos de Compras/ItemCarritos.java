package Carritosdecompras;

public class ItemCarritos {
    private Producto producto;
    private int cantidad;

    public ItemCarritos(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioTotal() {
        return producto.getPrecio() * cantidad;
    }
}

	