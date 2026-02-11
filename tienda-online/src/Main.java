public class Main {
    public static void main(String[] args) {
        System.out.println("--- TIENDA ONLINE ---\n");

        Producto laptop = new Producto("Laptop Dell", 899.99, 10);
        Producto mouse = new Producto("Mouse Logitech", 25.50, 50);
        Producto teclado = new Producto("Teclado Mecánico", 120.00, 30);
        Producto monitor = new Producto("Monitor LG 24", 199.99, 15);

        System.out.println("Productos disponibles:");
        System.out.println(laptop);
        System.out.println(mouse);
        System.out.println(teclado);
        System.out.println(monitor);

        Cliente cliente1 = new Cliente("Denise Name", "dname@gmail.com", "Calle Mayor 123, Madrid");
        Cliente cliente2 = new Cliente("Gerardo Romero", "gromero@gmail.com", "Avenida Libertad 45, Barcelona");

        System.out.println("\n" + cliente1);
        System.out.println(cliente2);

        System.out.println("\n-----------------");
        System.out.println("     PEDIDO 1");
        System.out.println("-----------------");
        Pedido pedido1 = new Pedido(cliente1);
        pedido1.agregarProducto(laptop, 1);
        pedido1.agregarProducto(mouse, 2);
        pedido1.agregarProducto(teclado, 1);
        pedido1.mostrarDetalles();

        System.out.println("\n-----------------");
        System.out.println("     PEDIDO 2");
        System.out.println("-----------------");
        Pedido pedido2 = new Pedido(cliente1);
        pedido2.agregarProducto(monitor, 2);
        pedido2.agregarProducto(mouse, 1);
        pedido2.mostrarDetalles();

        System.out.println("\n-----------------");
        System.out.println("     PEDIDO 3");
        System.out.println("-----------------");
        Pedido pedido3 = new Pedido(cliente2);
        pedido3.agregarProducto(laptop, 2);
        pedido3.agregarProducto(teclado, 2);
        pedido3.mostrarDetalles();

        System.out.println("\n--- RESUMEN DE CLIENTES ---");
        System.out.println("\nCliente: " + cliente1.getNombre());
        System.out.println("Total de pedidos: " + cliente1.getNumeroPedidos());
        for (int i = 0; i < cliente1.getNumeroPedidos(); i++) {
            System.out.println("  " + cliente1.getPedidos()[i]);
        }

        System.out.println("\nCliente: " + cliente2.getNombre());
        System.out.println("Total de pedidos: " + cliente2.getNumeroPedidos());
        for (int i = 0; i < cliente2.getNumeroPedidos(); i++) {
            System.out.println("  " + cliente2.getPedidos()[i]);
        }

        System.out.println("\n--- STOCK ACTUALIZADO ---");
        System.out.println(laptop);
        System.out.println(mouse);
        System.out.println(teclado);
        System.out.println(monitor);
    }
}