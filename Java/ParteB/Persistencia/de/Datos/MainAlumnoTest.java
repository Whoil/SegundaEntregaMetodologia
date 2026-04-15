package ParteB.Persistencia.de.Datos;

import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class MainAlumnoTest {

    // helper para capturar consola
    private String ejecutarMain(String[] args) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream original = System.out;
        System.setOut(new PrintStream(out));

        MainAlumno.main(args);

        System.setOut(original);
        return out.toString();
    }

    @Test
    void argsIncorrectos() {
        String salida = ejecutarMain(new String[]{});

        assertTrue(salida.contains("Uso correcto"));
    }

    @Test
    void initCreaFichero() {
        String ruta = "test_data/alumno.json";

        String salida = ejecutarMain(new String[]{"init", ruta});

        File f = new File(ruta);

        assertTrue(f.exists());
        assertTrue(salida.contains("Fichero creado correctamente"));

        f.delete();
    }

    @Test
    void showFicheroCorrecto() throws IOException {
        String ruta = "test_data/alumno.json";

        // primero creamos el fichero
        ejecutarMain(new String[]{"init", ruta});

        String salida = ejecutarMain(new String[]{"show", ruta});

        assertTrue(salida.contains("Datos del alumno"));
        assertTrue(salida.contains("Juan"));

        new File(ruta).delete();
    }

    @Test
    void operacionInvalida() {
        String salida = ejecutarMain(new String[]{"otro", "archivo.json"});

        assertTrue(salida.contains("Operación no válida"));
    }

    @Test
    void errorLecturaFichero() {
        String salida = ejecutarMain(new String[]{"show", "no_existe.json"});

        assertTrue(salida.contains("Error al leer el fichero"));
    }

    @Test
    void jsonVacio() throws IOException {
        String ruta = "test_data/vacio.json";

        File f = new File(ruta);
        f.getParentFile().mkdirs();
        new FileWriter(f).close(); // fichero vacío

        String salida = ejecutarMain(new String[]{"show", ruta});

        assertTrue(salida.contains("no contiene un JSON válido"));

        f.delete();
    }
}