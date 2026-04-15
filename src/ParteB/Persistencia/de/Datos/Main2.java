package ParteB.Persistencia.de.Datos;

import com.google.gson.Gson;

// Clase simple para convertir un objeto Persona a JSON
public class Main2 {
    public static void main(String[] args) {

        // Creo el objeto Gson
        Gson gson = new Gson();

        // Creo una persona con datos
        Persona p = new Persona("Antonio Moratilla", 97);

        // Convierto el objeto a formato JSON
        String json = gson.toJson(p);

        // Muestro el JSON por pantalla
        System.out.println(json);
    }
}
