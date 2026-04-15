package ParteB.Persistencia.de.Datos;

public class TestAuthor {
    public static void main(String[] args) {

        // Creamos el objeto
        Author autorOriginal = new Author("Alvaro", "alvaro@gmail.com", 'M');

        // Guardamos
        GsonUtilEjemplo.guardarObjetoEnArchivo("author.json", autorOriginal);

        // cargamos
        Author autorCargado = GsonUtilEjemplo.cargarObjetoDesdeArchivo("author.json", Author.class);

        // comprobación
        System.out.println("Autor original:");
        System.out.println(autorOriginal);
        System.out.println();
        System.out.println("Autor cargado desde JSON:");
        System.out.println(autorCargado);
    }
}
