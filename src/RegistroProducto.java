class RegistroProducto implements Registrable {

    @Override
    public void registrarProducto(String nombre, double precio, int cantidad) {
        System.out.println("El producto " + nombre + " ha sido registrado con con precio: " + precio + " $");
    }
}
