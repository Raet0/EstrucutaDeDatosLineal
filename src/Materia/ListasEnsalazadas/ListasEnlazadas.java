package Materia.ListasEnsalazadas;
import Materia.Moders.Node;
public class ListasEnlazadas {
    public Node head;
    public ListasEnlazadas(){

    }
    public int size(){
        return 1;
    }
    public void addNote(int value){
        if(head == null){
            head = new Node(value);
            return;
        }
        Node actual = head;
        while (actual.next != null) {
            actual = actual.next;
        }
        actual.next = new Node(value);
    }
    //crear metodo para eliminar
    public void metodoEliminar(int value){
        if(head == null)return;//no hay elementos no haga nada
        if(head.value == value){
            head = head.next;
            return;
        }
        Node actual = head;
        while (actual.next != null) {
            if (actual.next.value == value) {
                actual.next = actual.next.next;
                
            }
            actual = actual.next;
            
        }
    }
    public void print(){
        if(head == null){
            System.out.println("La lista esta vacia");
            return;
        }
        Node actual = head;
        while (actual.next != null) {
            System.out.println("Node -> "+actual.value);
            actual = actual.next;
    }
    System.out.println("Node -> "+actual.value);
    System.out.println("Fin de la lista");
    }
    //intentando pasar a clases genericas
    
}
