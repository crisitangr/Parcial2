//La clase Usuario hereda de Persona y agrega el tipo de usuario.
 // paquete
//Juan Felipe Garzon y Cristian Gracia 
public class Usuario extends Persona { // herencia

    private String tipo; // tipo de usuario

    public Usuario(String n, String c, String t) { // constructor

        super(n, c); // llama al constructor de Persona

        tipo = t; // guarda tipo

    }

}