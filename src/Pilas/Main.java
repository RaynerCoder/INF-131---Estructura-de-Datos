
package Pilas;


public class Main {

    public static void main(String[] args) {
        Pila p = new Pila();
        p.Adicionar("uno");
        p.Adicionar("dos");
        p.Adicionar("tres");
        p.Adicionar("cuatro");
        p.Adicionar("cinco");
       
        p.Mostrar();
        
        System.out.println("");
        p.Eliminar();
        p.Mostrar();
   
        

    }
    
}
