   //Esta clase representa un nodo para la estructura pila, contiene un dato y una referencia al siguiente nodo.
// Hereda de Nodo<String> porque guarda datos tipo String
import com.murcia.utils.Nodo; 

// Esta clase representa un nodo para una pila de préstamos
public class NodoPrestamo extends Nodo<String> {

    // Constructor que recibe un dato tipo String
    public NodoPrestamo(String d) {

        // Llama al constructor de la clase padre
        super(d);
    }

}