package ParteB.Persistencia.de.Datos;

import com.google.gson.Gson;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GsonUtilEjemplo {

    // Método genérico: guardo cualquier objeto en un JSON
    public static <T> void guardarObjetoEnArchivo(String rutaArchivo, T objeto) {
        Gson gson = new Gson(); // creo Gson
        try (FileWriter writer = new FileWriter(rutaArchivo)) {
            gson.toJson(objeto, writer); // convierto y lo escribo en el fichero
        } catch (IOException e) {
            e.printStackTrace(); // si falla, saco el error
        }
    }

    // Método genérico: leo un objeto desde un JSON
    public static <T> T cargarObjetoDesdeArchivo(String rutaArchivo, Class<T> clase) {
        Gson gson = new Gson(); // creo Gson
        try (FileReader reader = new FileReader(rutaArchivo)) {
            return gson.fromJson(reader, clase); // leo y lo convierto al tipo que quiero
        } catch (IOException e) {
            e.printStackTrace(); // si falla, saco el error
            return null; // devuelvo null si no se puede leer
        }
    }

    public static void main(String[] args) {

        // Creo un usuario de prueba
        Usuario usuario = new Usuario("Juan", 30, "juan@example.com");

        // Ruta del archivo donde voy a guardar
        String rutaArchivo = "usuario.json";

        // Guardo el usuario en el JSON
        guardarObjetoEnArchivo(rutaArchivo, usuario);

        // Lo vuelvo a cargar desde el fichero
        Usuario usuarioCargado = cargarObjetoDesdeArchivo(rutaArchivo, Usuario.class);

        // Compruebo que se haya cargado bien
        if (usuarioCargado != null) {
            System.out.println("Usuario cargado: " + usuarioCargado.nombre);
        }
    }

    // Clase interna para representar un usuario
    static class Usuario {
        String nombre;
        int edad;
        String correo;

        // Constructor: inicializo los datos
        public Usuario(String nombre, int edad, String correo) {
            this.nombre = nombre;
            this.edad = edad;
            this.correo = correo;
        }
    }
}

