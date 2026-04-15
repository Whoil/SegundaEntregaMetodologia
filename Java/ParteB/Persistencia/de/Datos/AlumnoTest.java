package ParteB.Persistencia.de.Datos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlumnoTest {
    @Test
    void constructorCompleto() {
        Alumno a = new Alumno(
                "Carlos",
                "Ruiz López",
                22,
                "carlos@mail.com",
                "99999",
                8.3
        );

        assertEquals("Carlos", a.getNombre());
        assertEquals("Ruiz López", a.getApellidos());
        assertEquals(22, a.getEdad());
        assertEquals("carlos@mail.com", a.getEmail());
        assertEquals("99999", a.getMatricula());
        assertEquals(8.3, a.getNotaMedia());
    }

    @Test
    void crearAlumnoPorDefectoMetodo() {
        Alumno a = Alumno.crearAlumnoPorDefecto();

        assertEquals("Juan", a.getNombre());
        assertEquals("Pérez García", a.getApellidos());
        assertEquals(20, a.getEdad());
        assertEquals("juan.perez@correo.com", a.getEmail());
        assertEquals("20250001", a.getMatricula());
        assertEquals(7.5, a.getNotaMedia());
    }    @Test
    void crearAlumnoPorDefecto() {
        Alumno a = new Alumno();

        assertNull(a.getNombre());
        assertNull(a.getApellidos());
        assertEquals(0, a.getEdad());
        assertNull(a.getEmail());
        assertNull(a.getMatricula());
        assertEquals(0.0, a.getNotaMedia());
    }

    @Test
    void getNombre() {
        Alumno a = new Alumno();
        a.setNombre("Juan");

        assertEquals("Juan", a.getNombre());
    }

    @Test
    void setNombre() {
        Alumno a = new Alumno();
        a.setNombre("Ana");

        assertEquals("Ana", a.getNombre());
    }

    @Test
    void getApellidos() {
        Alumno a = new Alumno();
        a.setApellidos("García López");

        assertEquals("García López", a.getApellidos());
    }

    @Test
    void setApellidos() {
        Alumno a = new Alumno();
        a.setApellidos("Pérez");

        assertEquals("Pérez", a.getApellidos());
    }

    @Test
    void getEdad() {
        Alumno a = new Alumno();
        a.setEdad(20);

        assertEquals(20, a.getEdad());
    }

    @Test
    void setEdad() {
        Alumno a = new Alumno();
        a.setEdad(25);

        assertEquals(25, a.getEdad());
    }

    @Test
    void getEmail() {
        Alumno a = new Alumno();
        a.setEmail("test@mail.com");

        assertEquals("test@mail.com", a.getEmail());
    }

    @Test
    void setEmail() {
        Alumno a = new Alumno();
        a.setEmail("otro@mail.com");

        assertEquals("otro@mail.com", a.getEmail());
    }

    @Test
    void getMatricula() {
        Alumno a = new Alumno();
        a.setMatricula("12345");

        assertEquals("12345", a.getMatricula());
    }

    @Test
    void setMatricula() {
        Alumno a = new Alumno();
        a.setMatricula("67890");

        assertEquals("67890", a.getMatricula());
    }

    @Test
    void getNotaMedia() {
        Alumno a = new Alumno();
        a.setNotaMedia(7.5);

        assertEquals(7.5, a.getNotaMedia());
    }

    @Test
    void setNotaMedia() {
        Alumno a = new Alumno();
        a.setNotaMedia(9.2);

        assertEquals(9.2, a.getNotaMedia());
    }
}