package ParteB.Persistencia.de.Datos;

public class TestCircle {
    public static void main(String[] args) {

        Circle circuloOriginal = new Circle(5.0);
        GsonUtilEjemplo.guardarObjetoEnArchivo("circle.json", circuloOriginal);
        Circle circuloCargado =GsonUtilEjemplo.cargarObjetoDesdeArchivo("circle.json", Circle.class);
        System.out.println("Círculo original:");
        System.out.println(circuloOriginal);
        System.out.println();
        System.out.println("Círculo cargado:");
        System.out.println(circuloCargado);
        System.out.println("Área: " + circuloCargado.getArea());
        System.out.println("Perímetro: " + circuloCargado.getPerimeter());
    }
}
