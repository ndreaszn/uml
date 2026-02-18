public class Producto {
    public String nombre;
    public double precio;
    public int stockDisponible;

    public Producto(String nombre, double precio, int stockDisponible) {
        this.nombre = nombre;
        this.precio = precio;
        this.stockDisponible = stockDisponible;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStockDisponible() {
        return stockDisponible;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setStockDisponible(int stockDisponible) {
        this.stockDisponible = stockDisponible;
    }

    public boolean reducirStock(int cantidad) {
        if (stockDisponible >= cantidad) {
            stockDisponible -= cantidad;
            return true;
        }
        return false;
    }

    public String toString() {
        return "- '" + nombre + "' | precio = €" + precio + " | stockDisponible = " + stockDisponible;
    }
}