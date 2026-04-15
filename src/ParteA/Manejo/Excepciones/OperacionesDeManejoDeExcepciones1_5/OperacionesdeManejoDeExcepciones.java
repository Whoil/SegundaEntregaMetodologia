package ParteA.Manejo.Excepciones.OperacionesDeManejoDeExcepciones1_5;
public class OperacionesdeManejoDeExcepciones{

    public static void VerificaciónDeContraseña(String contraseña)  throws Exception{
        String contraseñaCorrecta="Alvan55";
        if (!contraseña.equals(contraseñaCorrecta)){
            throw new Exception("La contraseña es incorrecta");
        }
        System.out.println("Contraseña correcta");
    }
    public static void ProbarConCatch(){
        try{
            VerificaciónDeContraseña("Alban55");
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
    public static void ProbarConThrow() throws Exception {
        VerificaciónDeContraseña("alban55");
    }
}

