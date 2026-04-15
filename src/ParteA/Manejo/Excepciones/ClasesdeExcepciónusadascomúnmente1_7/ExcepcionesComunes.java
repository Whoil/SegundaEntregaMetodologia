package ParteA.Manejo.Excepciones.ClasesdeExcepciónusadascomúnmente1_7;

public class ExcepcionesComunes {
    public static void ProbarArrayIndexOutOfBoundsException() {
        try{
        int[] AnArray = new int[3];
        System.out.println(AnArray[3]);
        }catch (ArithmeticException ex){
            System.out.println("ArrayIndexOutOfBoundsException");
            System.out.println(ex.getMessage());
        }
    }

    public static void ProbarNullPointerException() {
        try{
        String[] strs = new String[3];
        System.out.println(strs[0].length());}
        catch (NullPointerException ex){
            System.out.println("NullPointerException");
            System.out.println(ex.getMessage());
        }
    }

    public static void ProbarNumberFormatException() {
        try{
        Integer.parseInt("abc");}catch (NumberFormatException ex) {
            System.out.println("NumberFormatException");
            System.out.println(ex.getMessage());
        }
    }

    public static void ProbarClassCastException() {
        try{
        Object o = new Object();
        Integer i = (Integer) o;
        }catch (ClassCastException ex){
            System.out.println("ClassCastException");
            System.out.println(ex.getMessage());
        }
    }


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


    static boolean iniciado = false;

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

