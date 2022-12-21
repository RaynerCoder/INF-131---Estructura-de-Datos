package Multiples_Pilas;


public class MultiplePilas {
    private int numeroPilas;
    private Pila Pilas[] = new Pila[10];
    // numeroPilas < 10
    
    public MultiplePilas(){
        for (int i = 0; i < 10; i++) {
            Pilas[i] = new Pila();
        }
    }

    // i = posicion
    public boolean EsLlena(int i){
        return Pilas[i].EsLlena();
    }

    public boolean EsVacia(int i){
        return Pilas[i].EsVacia();
    }
    
    public int NumeroElementos(int i){
        return Pilas[i].NumeroElementos();
    }
    
    public void Adicionar(String dato, int i){
        Pilas[i].Adicionar(dato);
    }
    
    public void Eliminar(String dato, int i){
        Pilas[i].Eliminar();
    }
    
    public void Mostrar_Individual_Pila(int i){
        Pilas[i].Mostrar();
    }
    
    public void Mostrar(){
        for (int i = 0; i < numeroPilas; i++) {
            System.out.println("Posicion: "+(i+1));
            Mostrar_Individual_Pila(i);
        }
    }

    public void Vaciar(int i, Pila x){
        Pilas[i].Vaciar(x);
    }
    
    public void Vaciar(int i, int j){
        Pilas[i].Vaciar(Pilas[j]);
    }
    
    public int getNumeroPilas() {
        return numeroPilas;
    }

    public void setNumeroPilas(int numeroPilas) {
        this.numeroPilas = numeroPilas;
    }

    public Pila[] getPilas() {
        return Pilas;
    }

    public void setPilas(Pila[] Pilas) {
        this.Pilas = Pilas;
    }
    
    
}
