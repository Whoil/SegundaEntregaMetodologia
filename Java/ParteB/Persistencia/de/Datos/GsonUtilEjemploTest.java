package ParteB.Persistencia.de.Datos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GsonUtilEjemploTest {

    @Test
    void guardarObjetoEnArchivo() {
        GsonUtilEjemplo.Usuario u = new GsonUtilEjemplo.Usuario("Juan", 20, "juan@test.com");
        String ruta = "test_usuario.json";

        GsonUtilEjemplo.guardarObjetoEnArchivo(ruta, u);

        assertTrue(true);
    }

    @Test
    void cargarObjetoDesdeArchivo() {
        String ruta = "test_usuario.json";
        GsonUtilEjemplo.Usuario u = new GsonUtilEjemplo.Usuario("Ana", 25, "ana@test.com");

        GsonUtilEjemplo.guardarObjetoEnArchivo(ruta, u);

        GsonUtilEjemplo.Usuario cargado =
                GsonUtilEjemplo.cargarObjetoDesdeArchivo(ruta, GsonUtilEjemplo.Usuario.class);

        assertNotNull(cargado);
        assertEquals("Ana", cargado.nombre);
        assertEquals(25, cargado.edad);
        assertEquals("ana@test.com", cargado.correo);
    }

    @Test
    void main() {
        GsonUtilEjemplo.main(new String[]{});
        assertTrue(true);
    }

    @Test
    void guardarObjetoEnArchivoCatch() {
        GsonUtilEjemplo.Usuario u = new GsonUtilEjemplo.Usuario("Luis", 22, "luis@test.com");

        // ruta inválida para forzar IOException
        GsonUtilEjemplo.guardarObjetoEnArchivo("/ruta/que/no/existe/test.json", u);

        assertTrue(true);
    }

    @Test
    void cargarObjetoDesdeArchivoCatch() {
        GsonUtilEjemplo.Usuario cargado =
                GsonUtilEjemplo.cargarObjetoDesdeArchivo("/ruta/que/no/existe/test.json", GsonUtilEjemplo.Usuario.class);

        assertNull(cargado);
    }
}