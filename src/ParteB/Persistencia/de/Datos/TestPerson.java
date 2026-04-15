package ParteB.Persistencia.de.Datos;

public class TestPerson {
    public static void main(String[] args) {

        Person personaOriginal = new Person("Alvaro", "Alovera");

        GsonUtilEjemplo.guardarObjetoEnArchivo("person.json", personaOriginal);

        Person personaCargada =
                GsonUtilEjemplo.cargarObjetoDesdeArchivo("person.json", Person.class);

        System.out.println("Persona original:");
        System.out.println(personaOriginal);

        System.out.println();

        System.out.println("Persona cargada:");
        System.out.println(personaCargada);
    }
}
