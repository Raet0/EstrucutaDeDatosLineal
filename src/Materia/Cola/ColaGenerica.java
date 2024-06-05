package Materia.Cola;

import java.util.NoSuchElementException;
import Materia.Moders.NodoGenerico;

public class ColaGenerica<T> {

    private NodoGenerico<T> first;
    private NodoGenerico<T> last;
    private int size;

    public ColaGenerica() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }
    public T remove(){
        if(isEmpty()){
            throw new NoSuchElementException("La cola esta vacia");
        }
        T value = first.data;
        first = first.next;
        if(first == null){
            last=null;
        }
        return value;
    }
   public void addNode(T data){
        NodoGenerico<T> nuevoNodo = new NodoGenerico<>(data);
        if(isEmpty()){
            first=nuevoNodo;

            last=nuevoNodo;
        }
        else{
            last.next=nuevoNodo;
            last=nuevoNodo;
        }
    } 
    public void size(T data){
        NodoGenerico<T> nuevoNodo = new NodoGenerico<>(data);
        if(isEmpty()){
            first = nuevoNodo;
            last = nuevoNodo;
        }else{
            last.next=nuevoNodo;
            last= nuevoNodo;
        }
        size ++;//<- incrementa el tamaño
    }
    public T remove(T data){
        if(isEmpty()){
            throw new NoSuchElementException("La cola esta vacia");
        }
        T value = first.data;
        first = first.next;
        if(first == null){
            last= null;
        }
        size --;
        return value;
    }
    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("La cola esta vacia");
        }
        return first.data;
    }

    public boolean isEmpty() {
        return first == null;
    }
    public int size(){
        return size;
    }
}