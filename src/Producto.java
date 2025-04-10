abstract class Producto {
    protected String nombre;
    protected double precio;
    protected int cantidadStock;

    public Producto(String nombre, double precio, int cantidadStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
    }

    public Producto() {

    }

    abstract void mostrarDetalles();

    public void add(Laptop laptop) {
    }
}

class Celular extends Producto implements Vendible{
    int capacidadBateria;
    int camaraResolucion;
    public Celular(String nombre, double precio, int cantidadStock) {
        super(nombre, precio, cantidadStock);
    }

    public Celular() {

    }

    @Override
    void mostrarDetalles() {
        System.out.println("Nombre del Producto: " + nombre);
        System.out.println("Precio del Producto: " + precio);
        System.out.println("CantidadStock del producto: " + cantidadStock);
        System.out.println("Capacidad de Bateria: " + capacidadBateria);
        System.out.println("Resolución de Camara: " + camaraResolucion);
    }

    @Override
    public void preciodeVenta(int cantidad) {
        if(cantidad >= 5){
            precio = precio*.9;
            System.out.println("¡Se ha aplicado un descuento del 10% por la compra de más de 5 productos!");
        }else{
            System.out.println("¡No se ha aplicado descuento con su compra!");
        }
    }
}

class Laptop extends Producto implements Vendible{
    int memoriaRAM;
    String procesador;
    public Laptop(String nombre, double precio, int cantidadStock, int memoriaRAM, String procesador) {
        super(nombre, precio, cantidadStock);
    }

    public Laptop() {
        super();
    }


    @Override
    void mostrarDetalles() {
        System.out.println("Nombre del Producto: " + nombre);
        System.out.println("Precio del Producto: " + precio);
        System.out.println("CantidadStock del producto: " + cantidadStock);
        System.out.println("Memoria RAM del producto:" + memoriaRAM) ;
        System.out.println("Procesador del producto: " + procesador);
    }
    @Override
    public void preciodeVenta(int cantidad) {
        if(cantidad >= 5){
            precio = precio*.9;
            System.out.println("¡Se ha aplicado un descuento del 10% por la compra de más de 5 productos!");
        }else{
            System.out.println("¡No se ha aplicado descuento con su compra!");
        }
    }
}
