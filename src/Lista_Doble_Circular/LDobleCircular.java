package Lista_Doble_Circular;

public class LDobleCircular {

    private Nodo puntero;

    public LDobleCircular() {
        puntero = null;
    }

    public void AdicionPrincipio(String dato) {
        Nodo nuevo_nodo = new Nodo();
        nuevo_nodo.setDato(dato);
        if (getPuntero() == null) {
            setPuntero(nuevo_nodo);
            nuevo_nodo.setSiguiente(getPuntero());
            nuevo_nodo.setAnterior(getPuntero());
        } else {
            Nodo nodo_ultimo = getPuntero().getAnterior();
            nuevo_nodo.setSiguiente(getPuntero());
            nuevo_nodo.setAnterior(nodo_ultimo);
            getPuntero().setAnterior(nuevo_nodo);
            setPuntero(nuevo_nodo);
            nodo_ultimo.setSiguiente(getPuntero());
        }
    }

    public void AdicionFinal(String dato) {
        Nodo nuevo_nodo = new Nodo();
        nuevo_nodo.setDato(dato);
        if (getPuntero() == null) {
            setPuntero(nuevo_nodo);
            nuevo_nodo.setSiguiente(getPuntero());
            nuevo_nodo.setAnterior(getPuntero());
        } else {
            Nodo nodo_ultimo = getPuntero().getAnterior();
            nodo_ultimo.setSiguiente(nuevo_nodo);
            nuevo_nodo.setAnterior(nodo_ultimo);
            nuevo_nodo.setSiguiente(getPuntero());
            getPuntero().setAnterior(nuevo_nodo);
        }
    }

    public Nodo EliminarPrincio() {
        if (getPuntero() != null) {
            Nodo eliminar = getPuntero();
            if (eliminar.getSiguiente() == getPuntero()) {
                setPuntero(null);
            } else {
                Nodo ultimo_nodo = eliminar.getAnterior();
                Nodo siguiente_nodo = eliminar.getSiguiente();
                ultimo_nodo.setSiguiente(siguiente_nodo);
                siguiente_nodo.setAnterior(ultimo_nodo);
                setPuntero(siguiente_nodo);
                eliminar.setSiguiente(null);
                eliminar.setAnterior(null);
            }
            return eliminar;
        }
        return null;
    }

    public Nodo EliminarFinal() {
        if (getPuntero() != null) {
            Nodo eliminar = getPuntero();
            if (eliminar.getSiguiente() == getPuntero()) {
                setPuntero(null);
            } else {
                while (eliminar.getSiguiente() != getPuntero()) {
                    eliminar = eliminar.getSiguiente();
                }
                Nodo ultimo_nodo = eliminar;
                Nodo anterior_nodo = ultimo_nodo.getAnterior();
                anterior_nodo.setSiguiente(getPuntero());
                getPuntero().setAnterior(anterior_nodo);
                eliminar.setSiguiente(null);
                eliminar.setAnterior(null);
            }
            return eliminar;
        }
        return null;
    }

    public void Mostrar() {
        if (getPuntero() != null) {
            Nodo nodo = getPuntero();
            while (nodo.getSiguiente() != getPuntero()) {
                System.out.println(nodo.getDato());
                nodo = nodo.getSiguiente();
            }
            System.out.println(nodo.getDato());
        }
    }

    public Nodo getPuntero() {
        return puntero;
    }

    public void setPuntero(Nodo puntero) {
        this.puntero = puntero;
    }

}
