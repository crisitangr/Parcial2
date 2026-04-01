import com.murcia.utils.*;

public class PilaPrestamos extends ListaEnlazada<String> {

    public PilaPrestamos() {
        super(); // constructor del padre
    }

    public void push(String d) {
        super.push(d); // usa el método del profe
    }

    public String getCima() {
        return super.getFirst(); // cima = primer elemento
    }
}