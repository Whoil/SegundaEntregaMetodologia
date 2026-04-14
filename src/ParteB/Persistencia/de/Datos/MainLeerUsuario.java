package ParteB.Persistencia.de.Datos;

public class MainLeerUsuario {
    public static void main(String[] args) {

        // ruta del archivo json que se lee
        String rutaArchivo = "usuario.json";

        // cargamos el usuario desde el fichero
        GsonUtilEjemplo.Usuario usuario =
                GsonUtilEjemplo.cargarObjetoDesdeArchivo(rutaArchivo, GsonUtilEjemplo.Usuario.class);

        // si se ha leído bien, mostramos los datos
        if (usuario != null) {
            System.out.println("Nombre: " + usuario.nombre);
            System.out.println("Edad: " + usuario.edad);
            System.out.println("Correo: " + usuario.correo);
        } else {
            // si falla la lectura, avisamos
            System.out.println("No se pudo leer el archivo.");
        }
    }
}

