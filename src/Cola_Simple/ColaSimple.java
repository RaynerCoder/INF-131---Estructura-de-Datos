package Cola_Simple;

public class ColaSimple {
    private int max = 100;
    private String ColaSimple[] = new String[max+1];
    private int inicio, fin;
    
    public ColaSimple(){
        inicio = fin = 0;
    }
    
    public ColaSimple(int longitudCola){
        max = longitudCola;
        String ColaSimple[] = new String[max+1];
        inicio = fin = 0;
    }
    
    public boolean EsVacia(){
        return inicio == 0 && fin == 0;
    }

    public boolean EsLlena(){
        return fin == max;
    }
    
    public void Adicionar(String dato){
        if (EsLlena()) {
            System.out.println("Cola Llena");
        }
        else {
            fin = fin + 1;
            ColaSimple[fin] = dato;
        }
    }
    
    public String Eliminar(){
        String eliminar = null;
        if (EsVacia()) {
            System.out.println("Cola Vacia");
        }
        else {
            inicio = inicio + 1;
            eliminar = ColaSimple[inicio];
            if (inicio == fin) {
                inicio = fin = 0;
            }
            
        }
        return eliminar;
    }
    
    public int NumeroElementos(){
        return fin - inicio;
    }
    
    public void Mostrar(){
        ColaSimple auxi = new ColaSimple();
        while (!EsVacia()) { //this.EsVacia()     
            String dato = Eliminar();//this.Eliminar()
            System.out.println(dato.toString());
            auxi.Adicionar(dato);
        }
        Vaciar(auxi);
    }
    
    public void Vaciar(ColaSimple auxi){
        while (!auxi.EsVacia()) {            
            Adicionar(auxi.Eliminar());
        }
    }
}
