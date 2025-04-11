import java.util.*;

class Cliente {
    private String nombre;
    private String correo;
    private List<Producto> productosComprados = new ArrayList<>();
    private List<Double> costosTotales = new ArrayList<>();

    public Cliente(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public List<Producto> getProductosComprados() {
        return productosComprados;
    }

    public void setProductosComprados(List<Producto> productosComprados) {
        this.productosComprados = productosComprados;
    }

    public List<Double> getCostosTotales() {
        return costosTotales;
    }

    public void setCostosTotales(List<Double> costosTotales) {
        this.costosTotales = costosTotales;
    }

    public void comprarProducto(Producto producto, int cantidad) {
        if (producto.getCantidadStock() < cantidad) {
            System.out.println("No hay suficiente stock de: " + producto.getNombre());
            return;
        }

        if (producto instanceof Vendible vendible) {
            double total = vendible.calcularPrecioVenta(cantidad);
            producto.reducirStock(cantidad);
            productosComprados.add(producto);
            costosTotales.add(total);
            System.out.println(nombre + " compro " + cantidad + " unidad(es) de " + producto.getNombre() + " por $" + total);
        }
    }

    public void mostrarCompra() {
        System.out.println("Resumen de compras de " + nombre);
        System.out.println("-> Correo de contacto: " + correo);
        System.out.println("");
        for (int i = 0; i < productosComprados.size(); i++) {
            productosComprados.get(i).mostrarDetalles();
            System.out.println("Costo: $" + costosTotales.get(i));
            System.out.println("");
        }
    }
}
