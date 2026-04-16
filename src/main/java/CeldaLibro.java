import com.murcia.utils.Nodo; // importamos la clase Nodo del profe

// Esta clase representa un nodo que guarda un Libro
public class CeldaLibro extends Nodo<Libro> {

    // Constructor que recibe un objeto Libro
    public CeldaLibro(Libro d) {

        // Llama al constructor de la clase padre (Nodo)
        // Aquí se guarda el libro en el atributo interno "data"
        super(d);
    }

}