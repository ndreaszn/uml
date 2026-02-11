public class Cliente {
    public String nombre;
    public String email;
    public String direccion;
    public Pedido[] pedidos;
    public int numeroPedidos;

    public Cliente(String nombre, String email, String direccion) {
        this.nombre = nombre;
        this.email = email;
        this.direccion = direccion;
        this.pedidos = new Pedido[100];
        this.numeroPedidos = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getDireccion() {
        return direccion;
    }

    public Pedido[] getPedidos() {
        return pedidos;
    }

    public int getNumeroPedidos() {
        return numeroPedidos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void agregarPedido(Pedido pedido) {
        if (numeroPedidos < pedidos.length) {
            this.pedidos[numeroPedidos] = pedido;
            numeroPedidos++;
        }
    }

    public String toString() {
        return "Cliente: " + "nombre = '" + nombre + "' | email = '" + email + "' | direccion = '" + direccion + "' | cantidadPedidos = " + numeroPedidos;
    }
}