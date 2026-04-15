package ParteB.Persistencia.de.Datos;

// Clase principal donde leo un usuario desde un JSON
public class MainLeerUsuario {
    public static void main(String[] args) {

        // Guardo la ruta del archivo que quiero leer
        String rutaArchivo = "usuario.json";

        // Cargo el usuario desde el fichero usando Gson
        GsonUtilEjemplo.Usuario usuario =
                GsonUtilEjemplo.cargarObjetoDesdeArchivo(rutaArchivo, GsonUtilEjemplo.Usuario.class);

        // Compruebo si lo he leído bien
        if (usuario != null) {
            // Si todo esta bien, muestra los datos por pantalla
            System.out.println("Nombre: " + usuario.nombre);
            System.out.println("Edad: " + usuario.edad);
            System.out.println("Correo: " + usuario.correo);
        } else {
            // Si ha fallado, aviso
            System.out.println("No se pudo leer el archivo.");
        }
    }
}

