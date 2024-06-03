package Materia.Moders.Pilas;

import java.util.EmptyStackException;

import Materia.Moders.Node;

public class Pila {
    private Node top;

    public Pila() {
        top = null;
    }

    // push <- agregar elemento a la fila
    public void push(int value) {
        Node nuevoNodo = new Node(value);
        nuevoNodo.next = top;
        top = new Node(value);
    }

    public int pop() {
        if (top == null) {
            System.out.println("La fila esta vacia");
            throw new EmptyStackException();
        } else {
            int value = top.value;
            top = top.next;

            return value;

        }
    }
    public int peek() {
        if(top == null){
            System.out.println("La pila esta vacia");
            //throw new EmptySatckException
            return 0;
        }
        return top.value;
    }
    public boolean isEmpety(){
        return top == null;
}
}
