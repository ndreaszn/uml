public class Pedido {
    public String fecha;
    public Cliente cliente;
    public Producto[] productos;
    public int[] cantidades;
    public int numeroProductos;

    public Pedido(Cliente cliente) {
        this.fecha = "11/02/2026";
        this.cliente = cliente;
        this.productos = new Producto[50];
        this.cantidades = new int[50];
        this.numeroProductos = 0;
        cliente.agregarPedido(this);
    }

    public Pedido(String fecha, Cliente cliente) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.productos = new Producto[50];
        this.cantidades = new int[50];
        this.numeroProductos = 0;
        cliente.agregarPedido(this);
    }

    public String getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public int[] getCantidades() {
        return cantidades;
    }

    public int getNumeroProductos() {
        return numeroProductos;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public boolean agregarProducto(Producto producto, int cantidad) {
        if (producto.reducirStock(cantidad)) {
            if (numeroProductos < productos.length) {
                productos[numeroProductos] = producto;
                cantidades[numeroProductos] = cantidad;
                numeroProductos++;
                return true;
            }
        }
        System.out.println("Stock insuficiente para: " + producto.getNombre());
        return false;
    }

    public double calcularTotal() {
        double total = 0.0;
        for (int i = 0; i < numeroProductos; i++) {
            total += productos[i].getPrecio() * cantidades[i];
        }
        return total;
    }

    public void mostrarDetalles() {
        System.out.println("\n--- DETALLE DEL PEDIDO ---");
        System.out.println("Fecha: " + fecha);
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("\nProductos:");
        for (int i = 0; i < numeroProductos; i++) {
            Producto p = productos[i];
            int cant = cantidades[i];
            System.out.println("  - " + p.getNombre() + " x" + cant + " - €" + p.getPrecio() + " c/u = €" + (p.getPrecio() * cant));
        }
        System.out.println("\nTOTAL: €" + calcularTotal());
        System.out.println("---------------------------\n");
    }

    public String toString() {
        return "Pedido: " + "fecha = " + fecha + ", cliente = " + cliente.getNombre() + ", productos = " + numeroProductos + ", total = €" + calcularTotal();
    }
}