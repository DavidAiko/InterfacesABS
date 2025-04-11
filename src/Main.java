import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Producto> inventario = new ArrayList<>();
        List<Cliente> clientes = new ArrayList<>();
        boolean estado = true;

        while (estado) {
            System.out.println("""

|=======================================|
|        GESTIÓN INV. Y VENTA           |
|=======================================|
|  [1] Agregar producto                 |
|  [2] Ver inventario                   |
|  [3] Crear cliente                    |
|  [4] Comprar producto                 |
|  [5] Ver compras de clientes          |
|  [6] Salir                            |
|=======================================|
  ->  Elija una opción:      
""");


            int op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1 -> {
                    System.out.println("");
                    System.out.println("1. Laptop");
                    System.out.println("2. Celular");
                    int tipo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Marca: ");
                    String marca = scanner.nextLine();
                    System.out.print("Precio: ");
                    double precio = scanner.nextDouble();
                    System.out.print("Stock: ");
                    int stock = scanner.nextInt();
                    scanner.nextLine();

                    switch (tipo) {
                        case 1 -> {
                            System.out.print("Procesador: ");
                            String procesador = scanner.nextLine();
                            System.out.print("Memoria RAM: ");
                            int ram = scanner.nextInt();
                            scanner.nextLine();
                            inventario.add(new Laptop(nombre, marca, precio, stock, procesador, ram));
                        }case 2 -> {
                            System.out.print("Bateria: ");
                            int bateria = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Resolución de la camara: ");
                            String camara = scanner.nextLine();
                            inventario.add(new Celular(nombre, marca, precio, stock, bateria, camara));
                        }default -> {
                            System.out.println("Opcion invalida");
                        }
                    }
                }case 2 -> {
                    for (int i = 0; i < inventario.size(); i++) {
                        inventario.get(i).mostrarDetalles();
                        System.out.println();
                    }
                }case 3 -> {
                    System.out.print("Nombre del cliente: ");
                    String nombreClienteNuevo = scanner.nextLine();
                    System.out.print("Correo del cliente: ");
                    String correo = scanner.nextLine();
                    clientes.add(new Cliente(nombreClienteNuevo, correo));
                }case 4 -> {
                    System.out.print("Nombre del cliente: ");
                    String nombreCliente = scanner.nextLine();
                    Cliente cliente = null;
                    for (int i = 0; i < clientes.size(); i++) {
                        Cliente c = clientes.get(i);
                        if (c.getNombre().equalsIgnoreCase(nombreCliente)) {
                            cliente = c;
                            break;
                        }
                    }
                    if (cliente == null) {
                        System.out.println("Cliente no encontrado");
                        break;
                    }

                    System.out.print("Nombre del producto: ");
                    String nombreProd = scanner.nextLine();
                    Producto producto = null;
                    for (int i = 0; i < inventario.size(); i++) {
                        Producto p = inventario.get(i);
                        if (p.getNombre().equalsIgnoreCase(nombreProd)) {
                            producto = p;
                            break;
                        }
                    }
                    if (producto == null) {
                        System.out.println("Producto no encontrado.");
                        break;
                    }

                    System.out.print("Cantidad a comprar: ");
                    int cantidad = scanner.nextInt();
                    scanner.nextLine();
                    cliente.comprarProducto(producto, cantidad);
                }case 5 -> {
                    for (int i = 0; i < clientes.size(); i++) {
                        Cliente c = clientes.get(i);
                        c.mostrarCompra();
                    }
                }case 6 -> {
                    estado = false;
                    System.out.println("Programa finalizado...");
                }default -> System.out.println("Opcion no válida.");
            }
        }
    }
}