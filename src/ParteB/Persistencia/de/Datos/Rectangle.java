package ParteB.Persistencia.de.Datos;

// Clase que representa un rectángulo con largo y ancho
public class Rectangle {
    private float length; // largo
    private float width;  // ancho

    // Constructor por defecto (1x1)
    public Rectangle(){
        length= 1.0f;
        width= 1.0f;
    }

    // Constructor que inicializa largo y ancho
    public Rectangle(float length, float width){
        this.length=length;
        this.width= width;
    }

    // Devuelve el largo
    public float getLength(){
        return length;
    }

    // Modifica el largo solo si es positivo
    public void setLength(float newLength){
        if (newLength < 0) {
            System.out.println("ERROR, la altura debe ser positiva");
        }
        else {
            length = newLength;
        }
    }

    // Devuelve el ancho
    public float getWidth(){
        return width;
    }

    // Modifica el ancho solo si es positivo
    public void setWidth(float newWidth){
        if (newWidth < 0) {
            System.out.println("ERROR, el ancho debe ser positivo");
        }
        else {
            width = newWidth;
        }
    }

    // Calcula el área
    public double getArea(){
        return length * width;
    }

    // Calcula el perímetro
    public double getPerimeter(){
        return (length * 2) + (2 * width);
    }

    // Devuelve la información en formato texto
    public String toString(){
        return "Rectangle [length=" + length + " ,width=" + width + "]";
    }
}
