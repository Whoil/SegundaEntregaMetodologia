package ParteA.Manejo.Excepciones.Clases.de.Excepciones.Propias1_8;


// Excepción propia para indicar que la edad introducida no es válida.

public class EdadInvalidaException extends Exception {


    // Constructor que recibe el mensaje de error y lo pasa a Exception.

    public EdadInvalidaException(String message) {
        super(message);
    }
}
