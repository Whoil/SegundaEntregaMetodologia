package ParteB.Persistencia.de.Datos;

public class TestRectangle {
    public static void main(String[] args) {

        //Creamos un rectángulo
        Rectangle rectanguloOriginal = new Rectangle(4.5f, 2.0f);

        // Lo guardamos
        GsonUtilEjemplo.guardarObjetoEnArchivo("rectangle.json", rectanguloOriginal);

        // Lo cargamos
        Rectangle rectanguloCargado = GsonUtilEjemplo.cargarObjetoDesdeArchivo("rectangle.json", Rectangle.class);

        // Mostramos que todo esté bien
        System.out.println("Rectángulo original:");
        System.out.println(rectanguloOriginal);

        System.out.println();

        System.out.println("Rectángulo cargado:");
        System.out.println(rectanguloCargado);

        System.out.println();

        System.out.println("Área del rectángulo cargado: " + rectanguloCargado.getArea());
        System.out.println("Perímetro del rectángulo cargado: " + rectanguloCargado.getPerimeter());
    }
}
