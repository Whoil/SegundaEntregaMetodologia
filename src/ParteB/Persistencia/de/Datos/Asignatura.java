package ParteB.Persistencia.de.Datos;

public class Asignatura {
    private String nombre;
    private Estudiante[] estudiantes;

    public Asignatura() {
    }

    public Asignatura(String nombre, Estudiante[] estudiantes) {
        this.nombre = nombre;
        this.estudiantes = estudiantes;
    }

    public String getNombre() {
        return nombre;
    }

    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstudiantes(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }

    public String toString() {
        String texto = "Asignatura[nombre=" + nombre + ", estudiantes=";

        for (int i = 0; i < estudiantes.length; i++) {
            texto += estudiantes[i];
            if (i < estudiantes.length - 1) {
                texto += ", ";
            }
        }
        texto += "]";
        return texto;
    }
}