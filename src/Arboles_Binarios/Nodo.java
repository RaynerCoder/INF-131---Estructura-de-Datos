package Arboles_Binarios;

public class Nodo {
    private String dato;
    private Nodo izquierda, derecha;
    
    public Nodo(){
        izquierda = derecha = null;
    }
    
    
    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }
     
    
}
