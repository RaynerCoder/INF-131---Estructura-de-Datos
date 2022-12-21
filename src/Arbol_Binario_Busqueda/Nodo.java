
package Arbol_Binario_Busqueda;

public class Nodo {
    
    private int dato;
    private Nodo izquierda, derecha;
    
    public Nodo(){
        izquierda = derecha = null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
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
