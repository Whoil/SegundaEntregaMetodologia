package ParteB.Persistencia.de.Datos;

public class TestResizableCircle {
    public static void main(String[] args) {

        ResizableCircle circuloOriginal = new ResizableCircle(5.0);

        // Guardamos
        GsonUtilEjemplo.guardarObjetoEnArchivo("resizableCircle.json", circuloOriginal);

        //cargarmos
        ResizableCircle circuloCargado =
                GsonUtilEjemplo.cargarObjetoDesdeArchivo("resizableCircle.json", ResizableCircle.class);

        // Comprobación
        System.out.println("Circulo original:");
        System.out.println(circuloOriginal);
        System.out.println();
        System.out.println("Circulo cargado:");
        System.out.println(circuloCargado);
        System.out.println();

        // Probar el metodo resize
        circuloCargado.resize(50);

        System.out.println("Circulo cargado despues de resize(50):");
        System.out.println(circuloCargado);
    }
}
