import com.murcia.utils.ColaEnlazada; // Importamos la cola del profe
import com.murcia.utils.Nodo; // Para poder trabajar con nodos si es necesario

// Se usa la estructura cola para manejar los usuarios en orden de llegada
public class ColaUsuarios extends ColaEnlazada<Usuario> {

    // Constructor: llama al constructor de la clase padre
    public ColaUsuarios() {
        super(); // inicializa la cola del profe
    }

    // Método equivalente a "insertar" )
    public void insertar(Usuario u) {

        // usamos el método del profe
        this.encolar(u);
    }

    // Método para obtener el frente 
    public Usuario getFrente() {

        
        //usamos clone() para no alterar la cola original
        ColaEnlazada<Usuario> copia = (ColaEnlazada<Usuario>) this.clone();

        // Obtenemos el primer elemento sin eliminarlo de la cola original
        return copia.desencolar();
    }
}