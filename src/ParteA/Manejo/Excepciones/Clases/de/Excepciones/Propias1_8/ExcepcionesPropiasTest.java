package ParteA.Manejo.Excepciones.Clases.de.Excepciones.Propias1_8;

public class ExcepcionesPropiasTest {
    public static void VerificaciónDeContraseña(String contraseña)  throws ContrasenaIncorrectaException{
        String contraseñaCorrecta="Alvan55";
        if (!contraseña.equals(contraseñaCorrecta)){
            throw new ContrasenaIncorrectaException("La contraseña es incorrecta");
        }
        System.out.println("Contraseña correcta");
    }

    public static void VerificacionEdad(int edad) throws EdadInvalidaException {
        if (edad <= 0) {
            throw new EdadInvalidaException("La edad no puede ser negativa");
        }
    }

    public static void ProbarVerificaciónDeContraseña(){
        try{
            VerificaciónDeContraseña("Alban55");
        }
        catch (ContrasenaIncorrectaException ex){
            ex.printStackTrace();
        }
    }
    public static void ProbarVerificaciónEdad(){
        try {
            VerificacionEdad(-5);
        }
        catch (EdadInvalidaException ex){
            ex.printStackTrace();
        }
    }


}
