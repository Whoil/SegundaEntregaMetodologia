package ParteB.Persistencia.de.Datos;

public class TestBook {
    public static void main(String[] args) {

        // Creamos dos autores
        Author autor1 = new Author("Álvaro", "alvaro@gmail.com", 'M');
        Author autor2 = new Author("Luis", "luis@gmail.com", 'M');

        // Los guardamos en un array
        Author[] autores = {autor1, autor2};

        // Creamos un libro que contenga autores
        Book libroOriginal = new Book("Los tres cerditos", autores, 29.99, 5);

        // Guardamos el libro en JSON
        GsonUtilEjemplo.guardarObjetoEnArchivo("book.json", libroOriginal);

        //  Cargamos el libro desde JSON
        Book libroCargado = GsonUtilEjemplo.cargarObjetoDesdeArchivo("book.json", Book.class);

        // Comprobación
        System.out.println("Libro original:");
        System.out.println(libroOriginal);
        System.out.println();
        System.out.println("Libro cargado desde JSON:");
        System.out.println(libroCargado);
    }
}
