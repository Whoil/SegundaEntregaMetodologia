package ParteB.Persistencia.de.Datos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// Clase principal para trabajar con alumnos en JSON
public class MainAlumno {

    public static void main(String[] args) {

        // Compruebo que me pasen exactamente 2 argumentos
        if (args.length != 2) {
            System.out.println("Uso correcto:");
            System.out.println("java -jar SegundaEntregaMetodología.jar init dato.json");
            System.out.println("java -jar SegundaEntregaMetodología.jar show dato.json");
            return;
        }

        // Guardo la operación (init o show) y la ruta del fichero
        String operacion = args[0];
        String rutaFichero = args[1];

        // Creo el objeto Gson con formato bonito
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        // Según la operación, llamo a un método u otro
        switch (operacion.toLowerCase()) {
            case "init":
                initArchivo(rutaFichero, gson); // creo el JSON
                break;

            case "show":
                mostrarArchivo(rutaFichero, gson); // lo leo y lo muestro
                break;

            default:
                // Si la operación no es válida, aviso
                System.out.println("Operación no válida: " + operacion);
                System.out.println("Las operaciones válidas son: init o show");
        }
    }

    // Creo el archivo JSON con un alumno por defecto
    private static void initArchivo(String rutaFichero, Gson gson) {
        Alumno alumno = Alumno.crearAlumnoPorDefecto(); // creo el alumno

        try {
            File fichero = new File(rutaFichero);
            File carpetaPadre = fichero.getParentFile();

            // Si la carpeta no existe, la creo
            if (carpetaPadre != null && !carpetaPadre.exists()) {
                carpetaPadre.mkdirs();
            }

            // Escribo el JSON en el fichero
            try (FileWriter writer = new FileWriter(fichero)) {
                gson.toJson(alumno, writer);
            }

            // Confirmo que todo ha ido bien
            System.out.println("Fichero creado correctamente.");
            System.out.println("Ruta: " + fichero.getAbsolutePath());

        } catch (IOException e) {
            // Si falla algo al escribir, lo muestro
            System.out.println("Error al crear el fichero: " + e.getMessage());
        }
    }

    // Leo el archivo JSON y muestro los datos del alumno
    private static void mostrarArchivo(String rutaFichero, Gson gson) {
        try (FileReader reader = new FileReader(rutaFichero)) {
            Alumno alumno = gson.fromJson(reader, Alumno.class); // convierto JSON a objeto

            // Si el JSON está vacío o mal, aviso
            if (alumno == null) {
                System.out.println("El fichero está vacío o no contiene un JSON válido.");
                return;
            }

            // Muestro los datos del alumno
            System.out.println("Datos del alumno:");
            System.out.println("Nombre: " + alumno.getNombre());
            System.out.println("Apellidos: " + alumno.getApellidos());
            System.out.println("Edad: " + alumno.getEdad());
            System.out.println("Email: " + alumno.getEmail());
            System.out.println("Matrícula: " + alumno.getMatricula());
            System.out.println("Nota media: " + alumno.getNotaMedia());

        } catch (IOException e) {
            // Si falla la lectura, lo muestro
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }
    }
}
