package ParteB.Persistencia.de.Datos;

// Clase que uso para representar una persona
public class Persona {

    // Guardo un nombre por defecto
    private String nombre = "John Doe";

    // Guardo una edad por defecto
    private int edad = 18;

    // Constructor vacío: dejo los valores por defecto
    public Persona() {
    }

    // Constructor: inicializo la persona con los datos que me pasan
    public Persona(String nombre, int edad) {
        this.nombre = nombre; // asigno el nombre
        this.edad = edad;     // asigno la edad
    }

    // Devuelvo el nombre
    public String getNombre() {
        return nombre;
    }

    // Cambio el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Devuelvo la edad
    public int getEdad() {
        return edad;
    }

    // Cambio la edad
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
