
package Arboles_Binarios;

public class ArbolBinario {
    
    private Nodo raiz;

    public ArbolBinario() {
        raiz = null;
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
    
    public void Crear(Nodo x){

    }
    
    public void PreOrden(Nodo x){
        if (x != null) {
            System.out.println("Dato: " + x.getDato().toString());
            PreOrden(x.getIzquierda());
            PreOrden(x.getDerecha());
        }
    }
    
    public void InOrden(Nodo x){
        if (x != null) {
            PreOrden(x.getIzquierda());
            System.out.println("Dato: " + x.getDato().toString());
            PreOrden(x.getDerecha());
        }
    }
    
    public void PostOrden(Nodo x){
        if (x != null) {
            PreOrden(x.getIzquierda());
            PreOrden(x.getDerecha());
            System.out.println("Dato: " + x.getDato());
        }
    }
    
    
}
