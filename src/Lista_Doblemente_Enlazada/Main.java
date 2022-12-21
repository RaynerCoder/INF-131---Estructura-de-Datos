
package Lista_Doblemente_Enlazada;

public class Main {


    public static void main(String[] args) {
        
        LDobleE lista = new LDobleE();
        lista.AdicionFinal("uno");
        lista.AdicionFinal("dos");
        lista.AdicionFinal("tres");
        lista.AdicionPrincipio("cuatro");
        lista.AdicionPrincipio("cinco");
        lista.Mostrar();
        System.out.println("");
        
        lista.EliminarPrincio();
        lista.EliminarFinal();
        lista.Mostrar();
        

        
        
    }
    
}
