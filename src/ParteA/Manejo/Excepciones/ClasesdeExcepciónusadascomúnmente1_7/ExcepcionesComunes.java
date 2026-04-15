package ParteA.Manejo.Excepciones.ClasesdeExcepciónusadascomúnmente1_7;

// Clase que agrupa ejemplos de excepciones comunes en Java.


public class ExcepcionesComunes {
    public static void ProbarArrayIndexOutOfBoundsException() {

        // Ejemplo de ArrayIndexOutOfBoundsException al acceder
        // a una posición que no existe en el array.


        try {
            int[] anArray = new int[3];
            System.out.println(anArray[3]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("ArrayIndexOutOfBoundsException");
            System.out.println(ex.getMessage());
        }
    }
    // Ejemplo de NullPointerException al usar una referencia nula.
    public static void ProbarNullPointerException() {
        try{
        String[] strs = new String[3];
        System.out.println(strs[0].length());}
        catch (NullPointerException ex){
            System.out.println("NullPointerException");
            System.out.println(ex.getMessage());
        }
    }


    // Ejemplo de NumberFormatException al convertir una cadena no numérica.
    public static void ProbarNumberFormatException() {
        try{
        Integer.parseInt("abc");}catch (NumberFormatException ex) {
            System.out.println("NumberFormatException");
            System.out.println(ex.getMessage());
        }
    }
    // Ejemplo de ClassCastException al forzar un cast incompatible.
    public static void ProbarClassCastException() {
        try{
        Object o = new Object();
        Integer i = (Integer) o;
        }catch (ClassCastException ex){
            System.out.println("ClassCastException");
            System.out.println(ex.getMessage());
        }
    }

    // Ejemplo de IllegalArgumentException cuando el argumento recibido no es válido.
    public static void ProbarIllegalArgumentException(int edad) throws IllegalArgumentException {
        try{
        if (edad <= 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa");}
        }
        catch(IllegalArgumentException ex) {
            System.out.println("IllegalArgumentException");
            System.out.println(ex.getMessage());
        }
    }

    // Variable que representa el estado del programa.
    static boolean iniciado = false;


    // Ejemplo de IllegalStateException cuando el programa no está
    // en el estado correcto para ejecutar una acción.
    public static void ProbarIllegalStateException() {
        try {
            if (!iniciado) {
                throw new IllegalStateException("Primero tienes que iniciar");
            }
            System.out.println("Programa iniciado correctamente");
        } catch (IllegalStateException ex) {
            System.out.println("IllegalStateException");
            System.out.println(ex.getMessage());
        }
    }

}

