package ParteB.Persistencia.de.Datos;

import org.junit.jupiter.apiAS.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonaTest {

    @Test
    void constructorVacio() {
        Persona p = new Persona();
        assertEquals("John Doe", p.getNombre());
        assertEquals(18, p.getEdad());
    }

    @Test
    void constructorConParametros() {
        Persona p = new Persona("Juan", 20);
        assertEquals("Juan", p.getNombre());
        assertEquals(20, p.getEdad());
    }

    @Test
    void getNombre() {
        Persona p = new Persona("Juan", 20);
        assertEquals("Juan", p.getNombre());
    }

    @Test
    void setNombre() {
        Persona p = new Persona("Juan", 20);
        p.setNombre("Pedro");
        assertEquals("Pedro", p.getNombre());
    }

    @Test
    void getEdad() {
        Persona p = new Persona("Juan", 20);
        assertEquals(20, p.getEdad());
    }

    @Test
    void setEdad() {
        Persona p = new Persona("Juan", 20);
        p.setEdad(30);
        assertEquals(30, p.getEdad());
    }
}