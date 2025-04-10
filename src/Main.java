import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Producto Laptop = new Laptop();
        Producto Celular = new Celular();

        RegistroProducto vendible = new RegistroProducto();

        Cliente clientes = new Cliente();


        int op;
        do {
            System.out.println("""
                    |====================================|
                    |      GESTIÓN DE INV. Y VENTAS      |
                    |====================================|
                    | 1. VER INVENTARIO DE PRODUCTOS     |
                    | 2. CREAR CLIENTE                   |
                    | 3. REGISTRAR PRODUCTO              |
                    | 4. COMPRAR PRODUCTO                |
                    |====================================|
                    | 5. SALIR DEL PROGRAMA              |
                    |====================================|
                    
                    Seleccione una Opción: 
                    """);
            op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1 -> {
                    Laptop.mostrarDetalles();
                    Celular.mostrarDetalles();
                }
                case 2 -> {
                    System.out.println("Ingrese el nombre del cliente: ");
                    String nombreCliente = scanner.nextLine();
                    System.out.println("Ingrese el correo del cliente: ");
                    String correo = scanner.nextLine();
                    clientes.add(new Cliente(nombreCliente, correo));
                }
                case 3 -> {
                    int op1;
                    System.out.println("1. Registrar celular.");
                    System.out.println("2. Registrar laptop.");
                    op1 = scanner.nextInt();
                    scanner.nextLine();
                    switch (op1){
                        case 1 -> {
                            System.out.println("Ingrese el nombre del producto: ");
                            String nombre = scanner.nextLine();
                            System.out.println("Ingrese el precio del producto: ");
                            double precio = scanner.nextDouble();
                            System.out.println("Ingrese la cantidad del producto: ");
                            int cantidad = scanner.nextInt();
                            System.out.println("Ingrese la memoria del producto: ");
                            int memoriaRam = scanner.nextInt();
                            System.out.println("Ingrese el procesador del producto: ");
                            String procesador = scanner.nextLine();

                            Laptop.add(new Laptop(nombre,precio,cantidad,memoriaRam,procesador));
                        }
                        case 2 -> {
                            System.out.println("Ingrese el nombre del producto: ");
                            String nombre = scanner.nextLine();
                            System.out.println("Ingrese el precio del producto: ");
                            double precio = scanner.nextDouble();
                            System.out.println("Ingrese la cantidad del producto: ");
                            int cantidad = scanner.nextInt();
                            System.out.println("Ingrese la cantidad de Bateria: ");
                            int capacidadBateria = scanner.nextInt();
                            System.out.println("Ingrese la resolución de camara: ");
                            String camaraResolucion = scanner.nextLine();

                            Laptop.add(new Laptop(nombre,precio,cantidad,capacidadBateria,camaraResolucion));
                        }
                    }

                } case 4 -> {
                    System.out.println("COMPRA DE PRODUCTOS");
                    System.out.println("Digite el nombre del producto: ");
                    String nombre = scanner.nextLine();
                }
            }
        } while (op != 5);
        scanner.close();
    }
}
