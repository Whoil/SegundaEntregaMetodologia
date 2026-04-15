package ParteA.Manejo.Excepciones.Clases.de.Excepciones.Propias1_8;

public class MyMagicExceptionTest {
    //Ejemplo copiado de la hoja
    public static void magic(int number) throws MyMagicException {
        if (number == 8) {
            throw (new MyMagicException("you hit the magic number"));
        }
        System.out.println("hello");
    }

    public static void main(String[] args) {
        try {
            magic(9);   // does not trigger exception
            magic(8);   // trigger exception
        } catch (MyMagicException ex) {   // exception handler
            System.out.println(ex.getMessage());
        }
    }
}
