package ParteB.Persistencia.de.Datos;

import com.google.gson.Gson;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GsonUtilEjemplo {

    // guarda un objeto en un archivo json
    public static <T> void guardarObjetoEnArchivo(String rutaArchivo, T objeto) {
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter(rutaArchivo)) {
            gson.toJson(objeto, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // lee un objeto desde un archivo json
    public static <T> T cargarObjetoDesdeArchivo(String rutaArchivo, Class<T> clase) {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(rutaArchivo)) {
            return gson.fromJson(reader, clase);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {

        // creamos un usuario de prueba
        Usuario usuario = new Usuario("Juan", 30, "juan@example.com");

        // nombre del archivo
        String rutaArchivo = "usuario.json";

        // guardamos el usuario
        guardarObjetoEnArchivo(rutaArchivo, usuario);

        // lo volvemos a cargar
        Usuario usuarioCargado = cargarObjetoDesdeArchivo(rutaArchivo, Usuario.class);

        if (usuarioCargado != null) {
            System.out.println("Usuario cargado: " + usuarioCargado.nombre);
        }
    }

    // clase usuario para el ejemplo
    static class Usuario {
        String nombre;
        int edad;
        String correo;

        public Usuario(String nombre, int edad, String correo) {
            this.nombre = nombre;
            this.edad = edad;
            this.correo = correo;
        }
    }
}

