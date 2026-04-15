package ParteA.Manejo.Excepciones.Pila.de.Llamadas1_2;


// Ejemplo que muestra el funcionamiento de la pila de llamadas.
// main llama a methodA, methodA llama a methodB y methodB llama a methodC.
public class MethodCallStackDemo {

    // Método principal que inicia la secuencia de llamadas.
    public static void main(String[] args) {
        System.out.println("Enter main()");
        methodA();
        System.out.println("Exit main()");
    }

    // Primer método llamado desde main.
    public static void methodA() {
        System.out.println("Enter methodA()");
        methodB();
        System.out.println("Exit methodA()");
    }
    // Segundo método en la pila de llamadas.
    public static void methodB() {
        System.out.println("Enter methodB()");
        methodC();
        System.out.println("Exit methodB()");
    }
    // Último método de la cadena de llamadas.
    public static void methodC() {
        System.out.println("Enter methodC()");
        System.out.println("Exit methodC()");
    }
}