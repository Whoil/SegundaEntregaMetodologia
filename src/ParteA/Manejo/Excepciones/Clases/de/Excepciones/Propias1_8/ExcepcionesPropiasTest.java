package ParteA.Manejo.Excepciones.Clases.de.Excepciones.Propias1_8;


// Clase de prueba para demostrar el uso de excepciones propias.

public class ExcepcionesPropiasTest {

    // Método que valida la contraseña y lanza una excepción propia
    // si la contraseña es incorrecta.
    public static void VerificaciónDeContraseña(String contraseña)  throws ContrasenaIncorrectaException{
        String contraseñaCorrecta="Alvan55";
        if (!contraseña.equals(contraseñaCorrecta)){
            throw new ContrasenaIncorrectaException("La contraseña es incorrecta");
        }
        System.out.println("Contraseña correcta");
    }


    // Método que valida la edad y lanza una excepción propia
    // si el valor no es correcto.
    public static void VerificacionEdad(int edad) throws EdadInvalidaException {
        if (edad <= 0) {
            throw new EdadInvalidaException("La edad no puede ser negativa");
        }
    }


    // Método de prueba que captura la excepción propia de contraseña.
    public static void ProbarVerificaciónDeContraseña(){
        try{
            VerificaciónDeContraseña("Alban55");
        }
        catch (ContrasenaIncorrectaException ex){
            System.out.println(ex.getMessage());
        }
    }

    // Método de prueba que captura la excepción propia de edad.
    public static void ProbarVerificaciónEdad(){
        try {
            VerificacionEdad(-5);
        }
        catch (EdadInvalidaException ex){
            System.out.println(ex.getMessage());
        }
    }


}
