package Ejercicio_03_linkedLists;

public class LinkedListEjr {
    class Nodo {
        int dato;
        Nodo siguiente;

        public Nodo(int dato) {
            this.dato = dato;
            this.siguiente = null;
        }
    }

    private Nodo cabeza;

    public LinkedListEjr() {
        this.cabeza = null;
    }

    // Método para insertar al final de la lista
    public void insertarAlFinal(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo temp = cabeza;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevoNodo;
        }
    }

    // Método para obtener el nodo N desde el final
    public int getByPos(int position) {
            if (cabeza == null) {
                throw new IllegalArgumentException("La lista está vacía");
            }
    
            Nodo mainPointer = cabeza;
            Nodo referencePointer = cabeza;
    
            // Mueve el referencePointer position nodos hacia adelante
            for (int i = 0; i < position; i++) {
                if (referencePointer == null) {
                    throw new IllegalArgumentException("La posición es mayor que el número de nodos en la lista");
                }
                referencePointer = referencePointer.siguiente;
            }
    
            // Mueve ambos punteros hasta que referencePointer llegue al final
            while (referencePointer != null) {
                mainPointer = mainPointer.siguiente;
                referencePointer = referencePointer.siguiente;
            }
            return mainPointer.dato; // mainPointer ahora apunta al nodo N desde el final
        }
                //imprimiendo el nuevo metodo
            // Método para imprimir la lista (para fines de prueba)
            public void imprimirLista() {
                Nodo temp = cabeza;
                while (temp != null) {
                    System.out.print(temp.dato + " -> ");
                    temp = temp.siguiente;
                }
                System.out.println("null");
                LinkedListEjr lista = new LinkedListEjr();
            lista.insertarAlFinal(1);
            lista.insertarAlFinal(2);
            lista.insertarAlFinal(3);
            lista.insertarAlFinal(4);
            lista.insertarAlFinal(5);
    
            lista.imprimirLista();
    
            int n = 2;
            try {
                int valor = lista.getByPos(n);
                System.out.println("El valor del nodo " + n + " desde el final es: " + valor);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
}
