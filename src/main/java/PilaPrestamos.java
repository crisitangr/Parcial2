//Se usa la pila para guardar el historial de préstamos.
 // paquete

public class PilaPrestamos { // pila
   
    private NodoPrestamo cima; // parte superior

    public PilaPrestamos() { // constructor

        cima = null; // pila vacia

    }

    public void push(String d) { // agregar

        NodoPrestamo nuevo = new NodoPrestamo(d); // crear nodo

        nuevo.siguiente = cima; // apunta a la cima

        cima = nuevo; // nueva cima

    }

    public NodoPrestamo getCima() { // obtener cima

        return cima; // devuelve cima

    }

}