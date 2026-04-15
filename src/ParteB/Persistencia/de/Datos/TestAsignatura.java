package ParteB.Persistencia.de.Datos;

public class TestAsignatura {
    public static void main(String[] args) {
        // Creamos varios estudiante para la asignatura
        Estudiante e1 = new Estudiante("Alvaro", 19, "E001");
        Estudiante e2 = new Estudiante("Lucia", 18, "E002");
        Estudiante e3 = new Estudiante("Pablo", 20, "E003");
        Estudiante[] listaEstudiantes = {e1, e2, e3}; // Guardamos a los estudiantes en un array
        Asignatura asignaturaOriginal = new Asignatura("Metodologia de la Programacion", listaEstudiantes);

        // Guardamos y cargamos
        GsonUtilEjemplo.guardarObjetoEnArchivo("asignatura.json", asignaturaOriginal);
        Asignatura asignaturaCargada = GsonUtilEjemplo.cargarObjetoDesdeArchivo("asignatura.json", Asignatura.class);

        System.out.println("Asignatura original:");
        System.out.println(asignaturaOriginal);
        System.out.println();
        System.out.println("Asignatura cargada desde JSON:");
        System.out.println(asignaturaCargada);
    }
}
