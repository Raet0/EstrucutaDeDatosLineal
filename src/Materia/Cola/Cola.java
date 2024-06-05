package Materia.Cola;

import java.util.NoSuchElementException;

import Materia.Moders.Node;

public class Cola {
    private Node first;
    private Node last;

    public Cola() {
        this.first = null;
        this.last = null;
    }

    // metodo para agregar un Node a la cola
    public void addNode(int value){
        Node nuevoNodo = new Node(value);
        if(isEmpty()){
            first = nuevoNodo;
            last = nuevoNodo;

        }
        else{
            last.next = nuevoNodo;
            last = nuevoNodo;
        }   
    }
    public int remove(){
        if(isEmpty()){
            throw new NoSuchElementException("La cola esta vacia");
        }
        return first.value;
    }
    public int peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("La cola esta vacia");
        }
        return first.value;
    }

    public boolean isEmpty() {
        return first == null;
    }
}
