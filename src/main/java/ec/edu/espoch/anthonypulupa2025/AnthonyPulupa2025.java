
package ec.edu.espoch.anthonypulupa2025;


public class AnthonyPulupa2025 {

    public static void main(String[] args) {

enum Categoria {
    BEBIDA,
    ALIMENTO,
    POSTRE
}

class Producto {
    private String nombre;
    private float precio;
    private Categoria categoria;

    public Producto(String nombre, float precio, Categoria categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    public float mostrarDetalles() {
        float precioConIVA = precio + (precio * 0.12f);
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: " + precioConIVA);
        return precioConIVA;
    }

    public String getNombre() {
        return nombre;
    }
}

class Cliente {
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarProductos(List<Producto> productos) {
        System.out.println("Cliente: " + nombre);
        for (Producto producto : productos) {
            producto.mostrarDetalles();
        }
    }
}

class Pedido {
    private Cliente cliente;
    private List<Producto> productos;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public float calcularPrecioTotal() {
        float total = 0;
        for (Producto producto : productos) {
            total += producto.mostrarDetalles();
        }
        return total;
    }
}    
 
    }
}
