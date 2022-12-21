package Cola_Circular;

public class Main {

    public static void main(String[] args) {
        
        ColaCircular cola = new ColaCircular();
        cola.Adicionar("uno");
        cola.Adicionar("dos");
        cola.Adicionar("tres");
        cola.Adicionar("cuatro");
        cola.Adicionar("cinco");
        cola.Mostrar();
        
        System.out.println("");
        
        
       cola.Eliminar();
       cola.Eliminar();
       cola.Adicionar("1uno");
       cola.Adicionar("2dos");
       cola.Adicionar("3tres");
       cola.Adicionar("4cuatro");
       cola.Adicionar("5cinco");       
       cola.Mostrar();
    }
    
}
