public class LineaProducto {
    public Producto producto;
    public int cantidad;
    public double precioTotal;

    public LineaProducto(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioTotal = producto.getPrecio() * cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
        this.precioTotal = producto.getPrecio() * this.cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
        this.precioTotal = this.producto.getPrecio() * cantidad;
    }

    public String toString() {
        return "LineaProducto{" + "producto=" + producto.getNombre() + ", cantidad=" + cantidad + ", precioTotal=" + precioTotal + '}';
    }
}