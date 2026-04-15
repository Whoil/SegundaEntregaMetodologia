import ParteA.Manejo.Excepciones.Introduccion1_1.ScannerFromFile;
import ParteA.Manejo.Excepciones.Introduccion1_1.ScannerFromFileWithCatch;
import ParteA.Manejo.Excepciones.Introduccion1_1.ScannerFromFileWithThrow;

import ParteA.Manejo.Excepciones.Pila.de.Llamadas1_2.MethodCallStackDemo;
import ParteA.Manejo.Excepciones.Pila.de.Llamadas1_2.MethodCallStackDemoArithmeticException;

import ParteA.Manejo.Excepciones.OperacionesDeManejoDeExcepciones1_5.OperacionesdeManejoDeExcepciones;

import ParteA.Manejo.Excepciones.try_catch_finally1_6.TryCatchFinallyPrimerEjemplo;
import ParteA.Manejo.Excepciones.try_catch_finally1_6.MethodCallStackDemoWithFinally;

import ParteA.Manejo.Excepciones.ClasesdeExcepciónusadascomúnmente1_7.ExcepcionesComunes;
import ParteA.Manejo.Excepciones.Clases.de.Excepciones.Propias1_8.ExcepcionesPropiasTest;


public class Main {
    public static void main(String[] args){
        System.out.println("== 1.1 Introducción ==");
        ScannerFromFileWithCatch.main(new String[0]);

        try{
            ScannerFromFileWithThrow.main(new String[0]);
        }catch (Exception ex){
            ex.printStackTrace();
        }

        System.out.println("== 1.2 Pila De Llamadas ==");
       MethodCallStackDemo.main(new String[0]);
       try{
           MethodCallStackDemoArithmeticException.main(new String[0]);
       }catch(Exception ex){
           System.out.println("ArithmeticException");
           System.out.println(ex.getMessage());
       }


       try{
           MethodCallStackDemoArithmeticException.main(new String[0]);
       }catch (Exception ex){
           System.out.println("ArithmeticException");
           System.out.println(ex.getMessage());
       }

        System.out.println("\n===== 1.5 OPERACIONES DE MANEJO DE EXCEPCIONES =====");
        OperacionesdeManejoDeExcepciones.ProbarConCatch();

        try {
            OperacionesdeManejoDeExcepciones.ProbarConThrow();
        } catch (Exception ex) {
            System.out.println("Excepcion capturada en ProbarConThrow");
            System.out.println(ex.getMessage());;
        }

        System.out.println("\n===== 1.6 TRY-CATCH-FINALLY =====");
        TryCatchFinallyPrimerEjemplo.main(new String[0]);

        try {
            MethodCallStackDemoWithFinally.main(new String[0]);
        } catch (Exception ex) {
            System.out.println("ArithmeticException");
            System.out.println(ex.getMessage());
        }

        System.out.println("\n===== 1.7 EXCEPCIONES COMUNES =====");
        ExcepcionesComunes.ProbarArrayIndexOutOfBoundsException();
        ExcepcionesComunes.ProbarNullPointerException();
        ExcepcionesComunes.ProbarNumberFormatException();
        ExcepcionesComunes.ProbarClassCastException();
        ExcepcionesComunes.ProbarIllegalArgumentException(-5);
        ExcepcionesComunes.ProbarIllegalStateException();

        System.out.println("\n===== 1.8 EXCEPCIONES PROPIAS =====");
        ExcepcionesPropiasTest.ProbarVerificaciónDeContraseña();
        ExcepcionesPropiasTest.ProbarVerificaciónEdad();
    }

}
