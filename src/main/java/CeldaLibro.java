//Esta clase representa un nodo de la lista enlazada, contiene un libro y un enlace al siguiente nodo.
 // paquete

public class CeldaLibro { // nodo de lista

    public Libro dato; // dato que guarda (libro)
    public CeldaLibro siguiente; // enlace al siguiente nodo

    public CeldaLibro(Libro d) { // constructor

        dato = d; // guarda el libro
        siguiente = null; // no apunta a nada

    }

}