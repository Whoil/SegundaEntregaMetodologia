package ParteB.Persistencia.de.Datos;

public class TestAccount {
    public static void main(String[] args) {

        // crear una cuenta
        Account cuentaOriginal = new Account("A001", "Alvaro", 500);

        //Guardarla en un fichero JSON
        GsonUtilEjemplo.guardarObjetoEnArchivo("account.json", cuentaOriginal);

        // Cargarla otra vez desde el fichero
        Account cuentaCargada = GsonUtilEjemplo.cargarObjetoDesdeArchivo("account.json", Account.class);

        //Mostrar resultados
        System.out.println("Cuenta original:");
        System.out.println(cuentaOriginal);

        System.out.println();

        System.out.println("Cuenta cargada desde JSON:");
        System.out.println(cuentaCargada);
    }
}
