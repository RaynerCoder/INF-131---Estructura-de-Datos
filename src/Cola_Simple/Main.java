
package Cola_Simple;

public class Main {

    public static void main(String[] args) {
        ColaSimple c = new ColaSimple();
        c.Adicionar("uno");
        c.Adicionar("dos");
        c.Adicionar("tres");
        c.Adicionar("cuatro");
        c.Adicionar("cinco");
        c.Mostrar();
        
        System.out.println("---------------------");
        c.Eliminar();
        c.Mostrar();
            
        System.out.println("---------------------");
        c.Adicionar("seis");
        c.Adicionar("seis");
        c.Adicionar("seis");
        c.Mostrar();
        
        System.out.println("---------------------");
        c.Eliminar();
        c.Adicionar("siete");
        c.Mostrar();
    }
    
}
