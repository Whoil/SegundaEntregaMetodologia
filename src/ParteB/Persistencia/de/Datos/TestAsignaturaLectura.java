package ParteB.Persistencia.de.Datos;
//La idea de este programa es probar si después de modificar el archivo .json se modifica el propio objeto
public class TestAsignaturaLectura {
    public static void main(String[] args) {

        Asignatura asignaturaCargada=GsonUtilEjemplo.cargarObjetoDesdeArchivo("asignatura.json", Asignatura.class);

        System.out.println("Asignatura cargada:");
        System.out.println(asignaturaCargada);
    }
}
