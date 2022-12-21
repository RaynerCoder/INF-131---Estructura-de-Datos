package Pilas;

public class Pila {

    private int max = 100;
    private String Pila[] = new String[max + 1];
    private int tope;

    public Pila() {
        tope = 0;
    }

    public boolean EsVacia() {
        return tope == 0;
    }

    public Pila(int longitudPila){
        max = longitudPila;
        String Pila[] = new String[max+1];
        tope = 0;
    }
    
    public boolean EsLlena() {
        return tope == max;
    }

    public void Adicionar(String dato) {
        if (EsLlena()) {
            System.out.println("Pila Llena");
        } 
        else {
            tope = tope + 1;
            Pila[tope] = dato;
        }
    }
    
    public String Eliminar() {
        String eliminar = null;
        if (EsVacia()) {
            System.out.println("Pila Vacia");
        } 
        else {
            eliminar = Pila[tope];
            tope = tope - 1;
        }
        return eliminar;
    }

    public void Mostrar() {
        if (EsVacia()) {
            System.out.println("Pila Vacia");
        } 
        else {
            Pila aux = new Pila();
            while (!EsVacia()) { //this.EsVacia()       
                String dato = Eliminar(); //this.Eliminar()
                System.out.println(dato);
                aux.Adicionar(dato);
            }
            Vaciar(aux);
        }
    }
    
    public void Vaciar(Pila aux){
        while (!aux.EsVacia()) {            
            Adicionar(aux.Eliminar());//this.Adicionar(z.Eliminar())
        }
    }
    
    

}
