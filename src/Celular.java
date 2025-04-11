class Celular extends Producto implements Vendible {
    private int capacidadBateria;
    private String camaraResolucion;

    public Celular(String nombre, String marca, double precio, int cantidadStock, int capacidadBateria, String camaraResolucion) {
        super(nombre, marca, precio, cantidadStock);
        this.capacidadBateria = capacidadBateria;
        this.camaraResolucion = camaraResolucion;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Celular: " + nombre + " | Marca: " + marca );
        System.out.println("Batería: " + capacidadBateria + " | Camara: " + camaraResolucion);
        System.out.println("Precio: $" + precio + " | Stock Resultante: " + cantidadStock);
    }

    @Override
    public double calcularPrecioVenta(int cantidad) {
        double total = precio * cantidad;
        if (cantidad >= 5){
            total *= 0.9;
            System.out.println("¡Obtuvo un descuento de 10% del su compra por comprar 5 o más productos!");
        }
        return total;
    }
}