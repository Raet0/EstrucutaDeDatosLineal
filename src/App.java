import Ejercicio_01_sign.ValidacionDeSignos;
import Ejercicio_02_sorting.StackSorter;
import Materia.Cola.ColaGenerica;
import Materia.ListasEnsalazadas.ListasEnlazadas;
import Materia.Moders.Pantalla;
import Materia.Moders.PilaGenerica;
import Materia.Moders.Pilas.Pila;

public class App {
    public static void main(String[] args) throws Exception {
        Pila pila = new Pila();
        pila.push(10);
        pila.push(20);
        pila.push(30);
        pila.push(40);

        System.out.println("Elemento en  la cima de la pila: " + pila.peek());
        System.out.println("Elemento eliminado de la es: " + pila.pop());
        System.out.println("Elemento en  la cima de la pila: " + pila.peek());

        System.out.println();
        // implementacion de pila generica
        PilaGenerica<Pantalla> pilaPantallas = new PilaGenerica<>();
        pilaPantallas.push(new Pantalla("Home page", "/home"));
        pilaPantallas.push(new Pantalla("Menu Page", "/home/menu"));
        pilaPantallas.push(new Pantalla("Set page", "/home/menu/settings"));
        System.out.println("Estoy en la pantalla " + pilaPantallas.peek().getNombre());
        System.out.println("Destruir pantalla " + pilaPantallas.pop().getNombre());
        System.out.println("Estoy en la pantalla " + pilaPantallas.peek().getNombre());
        pilaPantallas.push(new Pantalla("User page", "/home/menu/user"));
        System.out.println("Estoy en la pantalla \n\t " + pilaPantallas.peek().getNombre());
        // imprimir la colaGenerica
        ColaGenerica<Pantalla> colaGenerica = new ColaGenerica<>();
        colaGenerica.addNode(new Pantalla("Menu Page", "home"));
        System.out.println("Estoy en la pantalla \t" + colaGenerica.peek().getNombre());
        System.out.println("Estoy en la pantalla \t" + colaGenerica.peek().getNombre());
        colaGenerica.addNode(new Pantalla("User page ", "home/menu/user"));
        System.out.println("Estoy en la pantalla " + colaGenerica.peek().getNombre());
        System.out.println("Estoy en la pantalla " + colaGenerica.remove().getNombre());
        System.out.println("Estoy en la pantalla " + colaGenerica.remove().getNombre());
        System.out.println("Estoy en la pantalla " + colaGenerica.peek().getNombre());
        System.out.println("La cola tiene : " + colaGenerica.size() + " Elementos");// se elimina uno
        // metodo comprobar caracter

        // metodo stacksorter

        ValidacionDeSignos validador = new ValidacionDeSignos();

        System.out.println(validador.isValing("()"));
        System.out.println(validador.isValing("({)}"));

        PilaGenerica<Integer> stack = new PilaGenerica<>();

        stack.push(4);
        stack.push(1);
        stack.push(8);
        stack.push(3);
        System.out.println("Pila original " + stack);
        StackSorter ordenar = new StackSorter();

        ordenar.Sort(stack);

        System.out.println("Pila ordenada " + stack);
        // metodo listasEnlazadas
        ListasEnlazadas lista = new ListasEnlazadas();
        lista.addNote(1);
        lista.addNote(4);
        lista.addNote(3);
        lista.addNote(6);
        lista.print();
    }
}
