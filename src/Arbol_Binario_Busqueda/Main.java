
package Arbol_Binario_Busqueda;

public class Main {

    public static void main(String[] args) {
        
        ArbolBinarioBusqueda a = new ArbolBinarioBusqueda();
    
        a.Agregar(2);
        a.Agregar(1);
        a.Agregar(4);
        a.Agregar(3);
        a.Agregar(5);
        
        a.PreOrden(a.getRaiz());
    }
    
}
