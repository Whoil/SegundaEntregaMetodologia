package ParteB.Persistencia.de.Datos;

// Clase para representar un alumno con sus datos
public class Alumno {

    // Atributos básicos del alumno
    private String nombre;
    private String apellidos;
    private int edad;
    private String email;
    private String matricula;
    private double notaMedia;

    // Constructor vacío
    public Alumno() {
    }

    // Constructor: inicializo todos los datos del alumno
    public Alumno(String nombre, String apellidos, int edad, String email, String matricula, double notaMedia) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.email = email;
        this.matricula = matricula;
        this.notaMedia = notaMedia;
    }

    // Creo un alumno con datos por defecto
    public static Alumno crearAlumnoPorDefecto() {
        return new Alumno(
                "Hector",
                "Montero Plaza",
                18,
                "hector.montero@correo.com",
                "912570111",
                10
        );
    }

    // Devuelvo el nombre
    public String getNombre() {
        return nombre;
    }

    // Cambio el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Devuelvo los apellidos
    public String getApellidos() {
        return apellidos;
    }

    // Cambio los apellidos
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    // Devuelvo la edad
    public int getEdad() {
        return edad;
    }

    // Cambio la edad
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Devuelvo el email
    public String getEmail() {
        return email;
    }

    // Cambio el email
    public void setEmail(String email) {
        this.email = email;
    }

    // Devuelvo la matrícula
    public String getMatricula() {
        return matricula;
    }

    // Cambio la matrícula
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // Devuelvo la nota media
    public double getNotaMedia() {
        return notaMedia;
    }

    // Cambio la nota media
    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }
}
