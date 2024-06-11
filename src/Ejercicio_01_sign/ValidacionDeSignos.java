package Ejercicio_01_sign;
import Materia.Moders.PilaGenerica;

public class ValidacionDeSignos {
    public boolean isValing(String s) {

        PilaGenerica<Character> pila = new PilaGenerica<>();

        for (int i = 0; i < s.length(); i++) {
            char elemento = s.charAt(i);
            if (elemento == '(' || elemento == '{' || elemento == '[') {
                pila.push(elemento);

            } else if (pila.isEmpty() || !coincide(pila.pop(), elemento)) {
                return false;

            }

            }
        return pila.isEmpty();
    }

    private static boolean coincide(char apertura, char cierre) {
        return ((apertura == '(' && cierre == ')') || (apertura == '{' && cierre == '}')
                || (apertura == '[' && cierre == ']'));

    }

}
