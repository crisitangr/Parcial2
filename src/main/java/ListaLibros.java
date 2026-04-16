
import com.murcia.utils.ListaEnlazada; // Importamos la lista del profe

// Maneja libros usando la estructura ya definida por el profe
public class ListaLibros extends ListaEnlazada<Libro> {

    // Constructor
    public ListaLibros() {

        // Llama al constructor de la clase padre
        super(); // inicializa head y size
    }

    // Método equivalente a "agregar" 
    public void agregar(Libro l) {

        
        // Este método ya se encarga de crear nodos y enlazarlos
        this.add(l);
    }

    // Método para obtener el primero 
    public Libro getPrimero() {

        // Retorna el primer elemento de la lista
        return this.getFirst();
    }

}