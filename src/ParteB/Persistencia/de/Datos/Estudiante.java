package ParteB.Persistencia.de.Datos;

public class Estudiante {
    private String nombre;
    private int edad;
    private String matricula;

    public Estudiante() {
    }

    public Estudiante(String nombre, int edad, String matricula) {
        this.nombre = nombre;
        this.edad = edad;
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String toString() {
        return "Estudiante[nombre=" + nombre + ", edad=" + edad + ", matricula=" + matricula + "]";
    }
}
