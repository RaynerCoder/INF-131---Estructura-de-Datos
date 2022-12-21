package Lista_Simple_Enlazada;

public class Main {

    public static void main(String[] args) {
        LSimpleE lista = new LSimpleE();
        lista.AdicionPrincipio("auto");
        lista.AdicionPrincipio("jarra");
        lista.AdicionPrincipio("pelota");
        lista.AdicionFinal("CASA");
        lista.AdicionFinal("LEON");
        lista.Mostrar();
        
    }
    
}
