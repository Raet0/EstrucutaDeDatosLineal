package Ejercicio_02_sorting;

import Materia.Moders.PilaGenerica;

public class StackSorter {
    public void Sort(PilaGenerica<Integer> stack) {
        PilaGenerica<Integer> tempStack = new PilaGenerica<>();

        while (!stack.isEmpty()) {
            int temporal = stack.pop();
            while (!tempStack.isEmpty() && tempStack.peek() > temporal) {
                stack.push(tempStack.pop());
            }
            tempStack.push(temporal);
        }
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }

    }
}
