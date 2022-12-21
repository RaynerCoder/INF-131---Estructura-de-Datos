package Arboles_Binarios;

public class Main {

    public static void main(String[] args) {

        ArbolBinario a = new ArbolBinario();
        Nodo nodo1 = new Nodo();
        nodo1.setDato("Pescado");

        Nodo nodo2 = new Nodo();
        nodo2.setDato("Abeja");
        nodo1.setIzquierda(nodo2);
        
        Nodo nodo3 = new Nodo();
        nodo3.setDato("Leon");
        nodo1.setDerecha(nodo3);
        
        a.PreOrden(nodo1);
        System.out.println("");
        a.InOrden(nodo1);
        System.out.println("");
        a.PostOrden(nodo1);
    }
    
}
