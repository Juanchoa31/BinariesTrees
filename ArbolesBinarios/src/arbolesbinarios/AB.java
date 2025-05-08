package arbolesbinarios;

public class AB {

    Nodo raiz;
    int tamanio;

    public AB() {
        this.raiz = null;
        this.tamanio = 0;
    }

    public boolean validar() {
        return raiz == null;
    }

    //Método para insertar nodos al árbol
    public void insertar(int dato) {

        //1. Crear el primer nodo
        Nodo nuevo = new Nodo(dato);

        //2. Validar si el arbol está vacío
        if (validar()) {
            raiz = nuevo;
        } else {
            Nodo anterior = null;
            Nodo aux = raiz;

            while (aux != null) {
                anterior = aux;
                if (dato > aux.getDato()) {
                    aux = aux.getDer();
                } else {
                    aux = aux.getIzq();
                }
            }

            if (dato > anterior.getDato()) {
                anterior.setDer(nuevo);
            } else {
                anterior.setIzq(nuevo);
            }

            tamanio++;
        }
    }

    //Método para conteo de hojas
    public int contarHojas(Nodo nodo) {
        return (nodo == null) ? 0
                : (nodo.getIzq() == null && nodo.getDer() == null) ? 1
                : contarHojas(nodo.getIzq()) + contarHojas(nodo.getDer());
    }

    //Método recorrido en preorden
    private void imprimirPreorden(Nodo aux) {
        if (aux != null) {
            System.out.print(aux.getDato() + " - ");
            imprimirPreorden(aux.getIzq());
            imprimirPreorden(aux.getDer());
        }
    }

    public void imprimirPreorden() {
        imprimirPreorden(raiz);
    }

    //Método recorrido en Inorden
    private void imprimirInorden(Nodo aux) {
        if (aux != null) {
            imprimirInorden(aux.getIzq());
            System.out.print(aux.getDato() + " - ");
            imprimirInorden(aux.getDer());

        }
    }

    public void imprimirInorden() {
        imprimirInorden(raiz);
    }

    //Método recorrido en Postorden
    private void imprimirPosorden(Nodo aux) {
        if (aux != null) {
            imprimirPosorden(aux.getIzq());
            imprimirPosorden(aux.getDer());
            System.out.print(aux.getDato() + " - ");
        }
    }

    public void imprimirPosorden() {
        imprimirPosorden(raiz);
    }
}
