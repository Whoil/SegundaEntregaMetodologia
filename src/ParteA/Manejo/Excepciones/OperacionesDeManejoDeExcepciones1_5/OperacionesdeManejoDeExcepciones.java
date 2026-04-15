package ParteA.Manejo.Excepciones.OperacionesDeManejoDeExcepciones1_5;


// Clase que demuestra las operaciones básicas de manejo de excepciones:
// declarar con throws, lanzar con throw y capturar con catch.

public class OperacionesdeManejoDeExcepciones{
    public static void VerificaciónDeContraseña(String contraseña)  throws Exception{

        // Metodo que comprueba si la contrasena introducida es correcta.
        // Si no coincide con la correcta, lanza una excepcion.

        String contraseñaCorrecta="Alvan55";
        if (!contraseña.equals(contraseñaCorrecta)){
            throw new Exception("La contraseña es incorrecta");
        }
        System.out.println("Contraseña correcta");
    }

    // Ejemplo de uso con try-catch.
    // Aqui la excepcion se captura dentro del propio metodo.

    public static void ProbarConCatch(){
        // Se pone una contrasena incorrecta a proposito
        // para que salte la excepcion y entre en catch.

        try{
            VerificaciónDeContraseña("Alan55");
        }
        catch (Exception ex){
            System.out.println("Excepcion capturada en ProbarConCatch");
            System.out.println(ex.getMessage());
        }
    }

    // Ejemplo de uso con throws.
    // Aquí la excepción no se captura, sino que se propaga
    // al método superior que llame a este.

    public static void ProbarConThrow() throws Exception {

        // Se pone una contrasena incorrecta a proposito
        // para demostrar la propagacion de la excepcion.

        VerificaciónDeContraseña("alban55");
    }
}

