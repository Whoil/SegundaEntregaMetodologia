package ParteA.Manejo.Excepciones.try_catch_finally1_6;


// Ejemplo que muestra que el bloque finally se ejecuta
// incluso cuando se produce una excepción.


public class MethodCallStackDemoWithFinally {
        public static void main(String[] args) {

            // Método que provoca una ArithmeticException dentro de un try
            // y ejecuta finally antes de terminar.
            System.out.println("Enter main()");
            methodA();
            System.out.println("Exit main()");
        }

        public static void methodA() {
            System.out.println("Enter methodA()");

            // División por 0 para provocar la excepción.
            try {
                System.out.println(1 / 0);

            }
            // Este bloque se ejecuta aunque ocurra la excepción.
            finally {
                System.out.println("finally in methodA()");
            }
            System.out.println("Exit methodA()");
        }
}
