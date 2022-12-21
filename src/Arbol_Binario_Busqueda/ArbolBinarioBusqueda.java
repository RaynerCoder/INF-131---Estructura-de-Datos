package Arbol_Binario_Busqueda;

public class ArbolBinarioBusqueda {

    private Nodo raiz;

    public ArbolBinarioBusqueda() {
        raiz = null;
    }
    

    public Nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }

    public void Agregar(int dato) {
        Nodo nuevo = new Nodo();
        nuevo.setDato(dato);
        if (getRaiz() == null)
        {
            setRaiz(nuevo);
        } 
        else
        {
            Nodo r = getRaiz();
            Boolean sw = true;
            while (sw)
            {
                if (nuevo.getDato() > r.getDato())
                {
                    if (r.getDerecha() != null)
                    {
                        r = r.getDerecha();
                    }
                    else {
                        r.setDerecha(nuevo);
                        sw = false;
                    }
                }
                else {
                    if (nuevo.getDato() < r.getDato())
                    {
                        if (r.getIzquierda() != null)
                        {
                           r = r.getIzquierda();
                        }
                        else {
                            r.setIzquierda(nuevo);
                            sw = false;
                        }
                    }
                    else {
                        System.out.println("YA EXISTE");
                        sw = false;
                    }
                }
            }
        }
    }
    
    public void Busca(int dato){
        Nodo r = getRaiz();
        Boolean sw = false;
        while (r != null)
        {
            if (dato > r.getDato())
            {
                r = r.getDerecha();
            }
            else {
                if (dato < r.getDato())
                {
                    r = r.getIzquierda();
                }
                else {
                    System.out.println("Dato: "+r.getDato());
                    sw = true;
                    r = null;
                }
            }
        }
        if (!sw)
        {
            System.out.println("No encontrado");
        }
    }
    
    public void PreOrden(Nodo raiz){
        if (raiz != null)
        {
            System.out.println("Dato: " + raiz.getDato());
            PreOrden(raiz.getIzquierda());
            PreOrden(raiz.getDerecha());
        }
    }

}
