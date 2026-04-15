package ParteA.Manejo.Excepciones.Clases.de.Excepciones.Propias1_8;

// Excepción propia para indicar que la contraseña introducida es incorrecta.


public class ContrasenaIncorrectaException extends Exception {

    // Constructor que recibe el mensaje de error y lo pasa a Exception.
    public ContrasenaIncorrectaException(String message) {
        super(message);
    }
}
