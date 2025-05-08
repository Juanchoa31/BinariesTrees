package arbolesbinarios;

public class Nodo {

    private Nodo izq; //Definición de nodo izquierdo
    private Nodo der; //Definición de nodo derecho
    private int dato; //Definición del dato

    public Nodo(int dato) {
        this.dato = dato; //Hago referencia al nodo, según el parámetro que se asigna en el constructor
        this.izq = null; //Defino el nodo izquierdo como vacío
        this.der = null; //Defino el nodo derecho como vacío
    }

    public Nodo getIzq() {
        return izq;
    }

    public void setIzq(Nodo izq) {
        this.izq = izq;
    }

    public Nodo getDer() {
        return der;
    }

    public void setDer(Nodo der) {
        this.der = der;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

}
