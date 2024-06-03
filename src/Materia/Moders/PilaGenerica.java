package Materia.Moders;

import java.util.EmptyStackException;

public class PilaGenerica<T> {

    private NodoGenerico<T> top;
    public PilaGenerica(){
        top = null;
    }
    public void push(T dato){
        NodoGenerico<T> nuevoNodo = new NodoGenerico<T>(dato);
        nuevoNodo.next = top;
        top = nuevoNodo;
    }
    public boolean  isEmpety(){
        return top == null;

    }
    public T pop (){
        if(isEmpety()){
            System.out.println("Pila esta vacia");
            throw new EmptyStackException();
        }
        T data = top.data;
        top =top.next;
        return data;
    }
    public T peek (){
        if(isEmpety()){
            System.out.println("Pila esta vacia");
            throw new EmptyStackException();
        }
        return top.data;
}
}