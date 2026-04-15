package ParteA.Manejo.Excepciones.ClasesdeExcepciónusadascomúnmente1_8;

public class ExcepcionesComunes {
    public static void ProbarArrayIndexOutOfBoundsException() {
        int[] AnArray = new int[3];
        System.out.println(AnArray[3]);
    }

    public static void ProbarNullPointerException() {
        String[] strs = new String[3];
        System.out.println(strs[0].length());
    }

    public static void ProbarNumberFormatException() {
        Integer.parseInt("abc");
    }

    public static void ProbarClassCastException() {
        Object o = new Object();
        Integer i = (Integer) o;
    }


    public static void ProbarIllegalArgumentException(int edad) throws IllegalArgumentException {
        if (edad <= 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }
    }


    static boolean iniciado = false;

    public static void ProbarIllegalStateException() {
        if (!iniciado) {
            throw new IllegalStateException("Primero tienes que iniciar");
        }
        System.out.println("Programa iniciado correctamente");
    }

}

