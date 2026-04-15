package ParteB.Persistencia.de.Datos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainAlumno {

    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Uso correcto:");
            System.out.println("java -jar NombreDeTuProyecto.jar init dato.json");
            System.out.println("java -jar NombreDeTuProyecto.jar show dato.json");
            return;
        }

        String operacion = args[0];
        String rutaFichero = args[1];

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        switch (operacion.toLowerCase()) {
            case "init":
                initArchivo(rutaFichero, gson);
                break;

            case "show":
                mostrarArchivo(rutaFichero, gson);
                break;

            default:
                System.out.println("Operación no válida: " + operacion);
                System.out.println("Las operaciones válidas son: init o show");
        }
    }

    private static void initArchivo(String rutaFichero, Gson gson) {
        Alumno alumno = Alumno.crearAlumnoPorDefecto();

        try {
            File fichero = new File(rutaFichero);
            File carpetaPadre = fichero.getParentFile();

            if (carpetaPadre != null && !carpetaPadre.exists()) {
                carpetaPadre.mkdirs();
            }

            try (FileWriter writer = new FileWriter(fichero)) {
                gson.toJson(alumno, writer);
            }

            System.out.println("Fichero creado correctamente.");
            System.out.println("Ruta: " + fichero.getAbsolutePath());

        } catch (IOException e) {
            System.out.println("Error al crear el fichero: " + e.getMessage());
        }
    }

    private static void mostrarArchivo(String rutaFichero, Gson gson) {
        try (FileReader reader = new FileReader(rutaFichero)) {
            Alumno alumno = gson.fromJson(reader, Alumno.class);

            if (alumno == null) {
                System.out.println("El fichero está vacío o no contiene un JSON válido.");
                return;
            }

            System.out.println("Datos del alumno:");
            System.out.println("Nombre: " + alumno.getNombre());
            System.out.println("Apellidos: " + alumno.getApellidos());
            System.out.println("Edad: " + alumno.getEdad());
            System.out.println("Email: " + alumno.getEmail());
            System.out.println("Matrícula: " + alumno.getMatricula());
            System.out.println("Nota media: " + alumno.getNotaMedia());

        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }
    }
}
