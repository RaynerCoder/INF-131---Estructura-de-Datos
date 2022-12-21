//LISTA ENLAZADA
package Lista_Simple_Enlazada;

public class LSimpleE {

    private Nodo puntero;

    public LSimpleE() {
        puntero = null;
    }

    public void AdicionPrincipio(String dato) {
        Nodo nuevo_nodo = new Nodo();
        nuevo_nodo.setDato(dato);
        nuevo_nodo.setSiguiente(getPuntero());
        //nuevo_nodo.setSiguiente(this.getPuntero());
        setPuntero(nuevo_nodo);
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
        }
    }

    public Nodo EliminarPrincio() {
        if (getPuntero() != null) {
            Nodo eliminar = getPuntero();
            setPuntero(eliminar.getSiguiente());
            eliminar.setSiguiente(null);
            return eliminar;
        }
        return null;
    }

    public Nodo EliminarFinal() {
        if (getPuntero() != null) {
            Nodo eliminar = getPuntero();
            if (eliminar.getSiguiente() == null) {
                setPuntero(null);
            } 
            else {
                while (eliminar.getSiguiente() != null) {
                    eliminar = eliminar.getSiguiente();
                }

                Nodo auxi = getPuntero();
                while (auxi.getSiguiente() != eliminar) {
                    auxi = auxi.getSiguiente();
                }
                auxi.setSiguiente(null);
            }
            return eliminar;
        }
        return null;
    }

    public void Mostrar() {
        Nodo nodo = getPuntero();
        while (nodo != null) {
            System.out.println(nodo.getDato());
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
