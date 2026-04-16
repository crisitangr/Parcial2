//Esta clase representa un objeto libro, contiene atributos título y autor, y se usa como dato dentro de la lista enlazada.
 // paquete donde está la clase

public class Libro { // clase Libro

    private String titulo; // variable para guardar el titulo
    private String autor; // variable para guardar el autor

    public Libro(String titulo, String autor) { // constructor

        this.titulo = titulo; // guarda el titulo recibido
        this.autor = autor; // guarda el autor recibido

    }

    public String getTitulo() { // metodo para obtener titulo
        return titulo; // devuelve el titulo
    }

    public String getAutor() { // metodo para obtener autor
        return autor; // devuelve el autor
    }

}