package Multiples_Pilas;

public class Main {

    public static void main(String[] args) {

        
        MultiplePilas m = new MultiplePilas();
        m.setNumeroPilas(3);
        m.Adicionar("uno", 0);
        m.Adicionar("uno", 0);
        m.Adicionar("uno", 0);
        
        m.Adicionar("dos", 1);
        m.Adicionar("dos", 1);
        m.Adicionar("dos", 1);
        
        m.Adicionar("tres", 2);
        m.Adicionar("tres", 2);
        m.Adicionar("tres", 2);
        
        m.Mostrar();
        
        
    }
    
}
