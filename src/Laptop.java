class Laptop extends Producto implements Vendible {
    private String procesador;
    private int memoriaRAM;

    public Laptop(String nombre, String marca, double precio, int cantidadStock, String procesador, int memoriaRAM) {
        super(nombre, marca, precio, cantidadStock);
        this.procesador = procesador;
        this.memoriaRAM = memoriaRAM;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Laptop: " + nombre + " | Marca: " + marca);
        System.out.println("Procesador: " + procesador + " | RAM: " + memoriaRAM + "GB");
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
