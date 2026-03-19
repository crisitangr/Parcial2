//Esta clase es la clase padre Persona, contiene los datos básicos y se usa para aplicar herencia en la clase Usuario.
 // paquete

public class Persona { // clase padre

    protected String nombre; // nombre de la persona
    protected String cedula; // cedula de la persona

    public Persona(String n, String c) { // constructor

        nombre = n; // guarda nombre
        cedula = c; // guarda cedula

    }

}