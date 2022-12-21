package Lista_Doble_Circular;

public class Main {

    public static void main(String[] args) {
        LDobleCircular lista = new LDobleCircular();
        lista.AdicionFinal("A");
        lista.AdicionFinal("B");
        lista.AdicionFinal("C");
        lista.AdicionPrincipio("D");
        lista.Mostrar();
        
        System.out.println("");
        
       lista.EliminarPrincio();
       lista.EliminarFinal();
       
       lista.Mostrar();
    }
    
}
