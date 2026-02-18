public class Pedido {
    public String fecha;
    public Cliente cliente;
    public LineaProducto[] lineasProducto;
    public int numeroLineas;
    public double costeTotal;

    public Pedido(Cliente cliente) {
        this.fecha = "11/02/2026";
        this.cliente = cliente;
        this.lineasProducto = new LineaProducto[50];
        this.numeroLineas = 0;
        this.costeTotal = 0.0;
        cliente.agregarPedido(this);
    }

    public String getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LineaProducto[] getLineasProducto() {
        return lineasProducto;
    }

    public int getNumeroLineas() {
        return numeroLineas;
    }

    public double getCosteTotal() {
        return costeTotal;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public boolean agregarProducto(Producto producto, int cantidad) {
        if (producto.reducirStock(cantidad)) {
            if (numeroLineas < lineasProducto.length) {
                LineaProducto nuevaLinea = new LineaProducto(producto, cantidad);
                lineasProducto[numeroLineas] = nuevaLinea;
                numeroLineas++;
                costeTotal += nuevaLinea.getPrecioTotal();
                return true;
            }
        }
        System.out.println("Stock insuficiente para: " + producto.getNombre());
        return false;
    }

    // calcular el total del pedido
    public double calcularTotal() {
        return costeTotal;
    }

    // mostrar detalles del pedido
    public void mostrarDetalles() {
        System.out.println("\n=== DETALLE DEL PEDIDO ===");
        System.out.println("Fecha: " + fecha);
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("\nProductos:");
        for (int i = 0; i < numeroLineas; i++) {
            LineaProducto linea = lineasProducto[i];
            System.out.println("  - " + linea.getProducto().getNombre() + " x" + linea.getCantidad() + " - €" + linea.getProducto().getPrecio() + " c/u = €" + linea.getPrecioTotal());
        }
        System.out.println("\nCOSTE TOTAL: €" + costeTotal);
        System.out.println("========================\n");
    }

    public String toString() {
        return "Pedido: " + "fecha = " + fecha + ", cliente = " + cliente.getNombre() + ", lineas = " + numeroLineas + ", costeTotal = €" + costeTotal;
    }
}