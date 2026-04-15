package ParteB.Persistencia.de.Datos;

public class TestPoint {
    public static void main(String[] args) {

        Point puntoOriginal = new Point(3.5f, 7.2f);
        GsonUtilEjemplo.guardarObjetoEnArchivo("point.json", puntoOriginal);
        Point puntoCargado = GsonUtilEjemplo.cargarObjetoDesdeArchivo("point.json", Point.class);
        System.out.println("Punto original:");
        System.out.println(puntoOriginal);
        System.out.println();
        System.out.println("Punto cargado:");
        System.out.println(puntoCargado);
    }
}
