package ParteB.Persistencia.de.Datos;
// Clase base que representa un punto en 2D
public class Point {

    // Coordenadas
    private float x=0.0f;
    private float y=0.0f;

    // Constructor con valores
    public Point(float x, float y){
        this.x=x;
        this.y=y;
    }

    // Constructor por defecto
    public Point(){
        this.x=0.0f;
        this.y=0.0f;
    }

    // Getter de X
    public float getX(){
        return x;
    }

    // Setter de X
    public void setX(float x) {
        this.x = x;
    }

    // Getter de Y
    public float getY(){
        return y;
    }

    // Setter de Y
    public void setY(float y) {
        this.y = y;
    }

    // Devuelve X e Y en un array
    public float[] getXY(){
        return new float[] {x,y};
    }

    // Cambia ambas coordenadas
    public void setXY(float x, float y){
        this.x=x;
        this.y=y;
    }

    // Cambia ambas coordenadas
    public String toString(){
        float[] point2D = getXY();
        return "("+point2D[0]+","+point2D[1]+")";
    }
}
