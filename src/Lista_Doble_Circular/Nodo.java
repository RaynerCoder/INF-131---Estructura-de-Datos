
package Lista_Doble_Circular;


public class Nodo {
    private String dato;
    private Nodo siguiente;
    private Nodo anterior;

    public Nodo() {
        siguiente = null;
        anterior = null;
    }
    
    
    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
    
    
}
