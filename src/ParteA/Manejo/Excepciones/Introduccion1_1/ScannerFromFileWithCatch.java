package ParteA.Manejo.Excepciones.Introduccion1_1;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ScannerFromFileWithCatch {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new File("test.in"));
            System.out.println("Fichero abierto correctamente");
            in.close();
        } catch (FileNotFoundException ex) { // error handling separated from the main logic
            System.out.println(ex.getMessage());
        }
    }

}
