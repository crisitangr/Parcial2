//Esta clase representa un nodo para la estructura pila, contiene un dato y una referencia al siguiente nodo.
 // paquete

public class NodoPrestamo { // nodo pila

    public String dato; // dato guardado
    public NodoPrestamo siguiente; // siguiente nodo

    public NodoPrestamo(String d) { // constructor

        dato = d; // guardar dato
        siguiente = null; // sin enlace

    }

}