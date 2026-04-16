//Esta clase contiene las estructuras principales del programa como variables estáticas para poder acceder a ellas desde la interfaz gráfica
 // paquete
//Cristian Gracia
import com.murcia.utils.*;
public class Biblioteca { // clase principal de datos

    public static ListaLibros lista = new ListaLibros(); 
    // lista global de libros

    public static ColaUsuarios cola = new ColaUsuarios(); 
    // cola global de usuarios

    public static PilaPrestamos pila = new PilaPrestamos(); 
    // pila global de prestamos
public void agregarLibro(String t, String a) {

    Libro l = new Libro(t, a);

    lista.agregar(l);

}
public void agregarUsuario(String n,String c, String t) {

    Usuario u = new Usuario(n, c, t);

    cola.insertar(u);

}
public void prestarLibro(String t, String u) {

    String dato = t + " prestado a " + u;

    pila.push(dato);

}
} 