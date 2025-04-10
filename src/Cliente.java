public class Cliente {
    protected String nombreCliente;
    protected String correo;

    public Cliente() {
    }

    public Cliente(String nombreCliente, String correo) {
        this.nombreCliente = nombreCliente;
        this.correo = correo;
    }

    public String getNombre() {
        return nombreCliente;
    }

    public void setNombre(String nombre) {
        this.nombreCliente = nombreCliente;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombreCliente='" + nombreCliente + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }

    public void comprarProducto(Producto producto, int cantidad){
        System.out.println("Digite el nombre del producto: " + producto);
        System.out.println("Digite la cantidad a comprar: " + cantidad);

    }
    public void mostrarCompra(){
    }

    public void add(String nombreCliente, String correo) {
    }

    public void add(Cliente cliente) {
    }
}
