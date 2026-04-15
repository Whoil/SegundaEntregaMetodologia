package ParteA.Manejo.Excepciones.Pila.de.Llamadas1_2;

// Ejemplo que muestra cómo una excepción recorre la pila de llamadas.
// La división entre 0 provoca una ArithmeticException.


public class MethodCallStackDemoArithmeticException {
    public static void main(String[] args) {
        System.out.println("Enter main()");
        methodA();
        System.out.println("Exit main()");
    }

    public static void methodA() {
        System.out.println("Enter methodA()");
        methodB();
        System.out.println("Exit methodA()");
    }

    public static void methodB() {
        System.out.println("Enter methodB()");
        methodC();
        System.out.println("Exit methodB()");
    }

    public static void methodC() {
        System.out.println("Enter methodC()");

        // Esta operación lanza una ArithmeticException a propósito.
        System.out.println(1 / 0);  // divide-by-0 triggers an ArithmeticException
        System.out.println("Exit methodC()");
    }


}
