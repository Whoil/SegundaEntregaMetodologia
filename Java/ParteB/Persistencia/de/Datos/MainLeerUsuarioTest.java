package ParteB.Persistencia.de.Datos;

import ParteB.Persistencia.De.Datos.MainLeerUsuario;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MainLeerUsuarioTest {

    @Test
    void main() throws Exception {
        ByteArrayOutputStream salida = new ByteArrayOutputStream();
        PrintStream original = System.out;
        System.setOut(new PrintStream(salida));

        try {
            Files.deleteIfExists(Path.of("usuario.json"));
            MainLeerUsuario.main(new String[]{});

            Files.writeString(
                    Path.of("usuario.json"),
                    "{\"nombre\":\"Hector\",\"edad\":20,\"correo\":\"hector@correo.com\"}"
            );
            MainLeerUsuario.main(new String[]{});
        } finally {
            System.setOut(original);
            Files.deleteIfExists(Path.of("usuario.json"));
        }

        String texto = salida.toString();
        assertTrue(texto.contains("No se pudo leer el archivo."));
        assertTrue(texto.contains("Nombre: Hector"));
        assertTrue(texto.contains("Edad: 20"));
        assertTrue(texto.contains("Correo: hector@correo.com"));
    }
}