
//Proyecto de Juan Felipe Garzon Varon y Cristian Gracia 
 // paquete
import com.murcia.utils.Nodo; // importamos la clase Nodo del profe

// Esta clase representa un nodo que guarda un Usuario
public class NodoUsuario extends Nodo<Usuario> {

    // Constructor que recibe un Usuario
    public NodoUsuario(Usuario d) {

      
        // Guarda el usuario en el atributo "data"
        super(d);
    }

}