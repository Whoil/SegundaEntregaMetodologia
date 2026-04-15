package ParteB.Persistencia.de.Datos;

public class ResizableCircle extends Circle implements Resizable{

    // Crea un círculo redimensionable con un radio inicial
    public ResizableCircle(double radius){
        super(radius);
    }

    @Override
    public String toString(){
        // Incluye la info del Circle padre
        return "ResizableCircle[" + super.toString() + "]";
    }

    @Override
    public void resize(int percent) {
        // Ajusta el radio según el porcentaje dado
        radius = percent / 100.0;
    }
}
