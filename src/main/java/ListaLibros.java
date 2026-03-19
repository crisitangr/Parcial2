//Esta clase implementa una lista enlazada manual usando nodos para almacenar los libros.
 // paquete

public class ListaLibros { // lista enlazada
  
    private CeldaLibro primero; // primer nodo

    public ListaLibros() { // constructor

        primero = null; // lista vacia

    }

    public void agregar(Libro l) { // metodo agregar

        CeldaLibro nuevo = new CeldaLibro(l); // crea nodo

        if (primero == null) { // si lista vacia

            primero = nuevo; // nuevo es primero

        } else {

            CeldaLibro aux = primero; // auxiliar

            while (aux.siguiente != null) { // recorrer

                aux = aux.siguiente; // avanzar

            }

            aux.siguiente = nuevo; // agregar al final

        }

    }

    public CeldaLibro getPrimero() { // obtener primero

        return primero; // devuelve primero

    }

}