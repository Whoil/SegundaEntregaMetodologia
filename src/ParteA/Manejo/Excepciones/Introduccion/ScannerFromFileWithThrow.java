package ParteA.Manejo.Excepciones.Introduccion;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class ScannerFromFileWithThrow {
    public static void main(String[] args) throws FileNotFoundException {
            Scanner in = new Scanner(new File("test.in"));
        System.out.println("Fichero abierto correctamente");
        in.close();

        }
}
