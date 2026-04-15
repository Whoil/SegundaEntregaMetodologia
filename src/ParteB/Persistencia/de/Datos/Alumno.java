package ParteB.Persistencia.de.Datos;

public class Alumno {

    private String nombre;
    private String apellidos;
    private int edad;
    private String email;
    private String matricula;
    private double notaMedia;

    public Alumno() {
    }

    public Alumno(String nombre, String apellidos, int edad, String email, String matricula, double notaMedia) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.email = email;
        this.matricula = matricula;
        this.notaMedia = notaMedia;
    }

    public static Alumno crearAlumnoPorDefecto() {
        return new Alumno(
                "Juan",
                "Pérez García",
                20,
                "juan.perez@correo.com",
                "20250001",
                7.5
        );
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }
}
