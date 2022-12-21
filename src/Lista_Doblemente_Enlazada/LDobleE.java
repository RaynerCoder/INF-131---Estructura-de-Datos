package Lista_Doblemente_Enlazada;

public class LDobleE {

    private Nodo puntero;

    public LDobleE() {
        puntero = null;
    }

    public void AdicionPrincipio(String dato) {
        Nodo nuevo_nodo = new Nodo();
        nuevo_nodo.setDato(dato);
        if (this.getPuntero() == null) {
            setPuntero(nuevo_nodo);
        } else {
            nuevo_nodo.setSiguiente(getPuntero());
            getPuntero().setAnterior(nuevo_nodo);
            setPuntero(nuevo_nodo);
        }
    }

    public void AdicionFinal(String dato) {
        Nodo nuevo_nodo = new Nodo();
        nuevo_nodo.setDato(dato);
        if (getPuntero() == null) {
            setPuntero(nuevo_nodo);
        } else {
            Nodo auxi = getPuntero();
            while (auxi.getSiguiente() != null) {
                auxi = auxi.getSiguiente();
            }
            auxi.setSiguiente(nuevo_nodo);
            nuevo_nodo.setAnterior(auxi);
        }
    }

    public Nodo EliminarPrincio() {
        if (getPuntero() != null) {
            Nodo eliminar = getPuntero();
            if (eliminar.getSiguiente() == null) {
                setPuntero(null);
            } else {
                setPuntero(eliminar.getSiguiente());
                eliminar.setSiguiente(null);
                getPuntero().setAnterior(null);
            }
            return eliminar;
        }
        return null;
    }

    public Nodo EliminarFinal() {
        if (getPuntero() != null) {
            Nodo eliminar = getPuntero();
            if (eliminar.getSiguiente() == null) {
                setPuntero(null);
            } else {
                while (eliminar.getSiguiente() != null) {
                    eliminar = eliminar.getSiguiente();
                }
                Nodo ultimo_nodo = eliminar;
                Nodo anterior_nodo = ultimo_nodo.getAnterior();
                anterior_nodo.setSiguiente(null);
                eliminar.setAnterior(null);
            }
            return eliminar;
        }
        return null;
    }

    public void Mostrar() {
        Nodo nodo = getPuntero();
        while (nodo != null) {
            System.out.println(nodo.getDato().toString());
            nodo = nodo.getSiguiente();
        }
    }

    public Nodo getPuntero() {
        return puntero;
    }

    public void setPuntero(Nodo puntero) {
        this.puntero = puntero;
    }

}
