
package Cola_Circular;

public class ColaCircular {
    private int max = 5;
    private String Cola[] = new String[max+1];
    private int inicio, fin;
    
    public ColaCircular(){
        inicio = fin = 0;
    }
    
    public boolean EsVacia(){
        return inicio == 0 && fin == 0;
    }

    
    public boolean EsLlena(){
        return NumeroElementos() == max;
    }
    
    
    public int NumeroElementos(){
        if (inicio == 0 && fin == 0) {
            return 0;
        }
        else if (fin > inicio) {
            return fin - inicio;
        }
        return (max - inicio) + fin;
    }
    

    public void Adicionar(String dato){
        if (EsLlena()) {
            System.out.println("Cola Circular Llena");
        }
        else {
            if (fin == max) {
                fin = 1;
            }
            else {
                fin = fin +1;
            }
            Cola[fin] = dato;
        }
    }
    
    
    public String Eliminar(){
        String eliminar = null;
        if (EsVacia()) {
            System.out.println("Cola Circular Vacia");
        }
        else {
            inicio = inicio + 1;
            eliminar = Cola[inicio];
            if (inicio == fin) {
                inicio = fin = 0;
            }
            if (inicio == max) {
                inicio = 0;
            }
        }
        return eliminar;
    }
    
    public void Mostrar(){
        ColaCircular auxi = new ColaCircular();
        while (!EsVacia()) {
            String dato = Eliminar();
            System.out.println(dato);
            auxi.Adicionar(dato.toString());
        }
        Vaciar(auxi);
    }
    
    public void Vaciar(ColaCircular z){
        while(!z.EsVacia()) {            
            Adicionar(z.Eliminar());
        }
    }
}
