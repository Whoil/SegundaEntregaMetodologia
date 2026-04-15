package ParteB.Persistencia.de.Datos;

public class TestCustomer {
    public static void main(String[] args) {

        Customer clienteOriginal = new Customer(1, "Alvaro", 15);
        GsonUtilEjemplo.guardarObjetoEnArchivo("customer.json", clienteOriginal);
        Customer clienteCargado = GsonUtilEjemplo.cargarObjetoDesdeArchivo("customer.json", Customer.class);
        //Comprobacion
        System.out.println("Cliente original:");
        System.out.println(clienteOriginal);
        System.out.println();
        System.out.println("Cliente cargado:");
        System.out.println(clienteCargado);
    }
}
