//Esta clase representa un nodo para la estructura cola, contiene un usuario y una referencia al siguiente nodo.
//Proyecto de Juan Felipe Garzon Varon y Cristian Gracia 
 // paquete
import com.murcia.utils.*;
public class NodoUsuario { // nodo para cola

    public Usuario dato; // guarda un usuario
    public NodoUsuario siguiente; // apunta al siguiente nodo

    public NodoUsuario(Usuario d) { // constructor

        dato = d; // guarda usuario
        siguiente = null; // no apunta a nadie

    }

}