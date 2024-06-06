package Ejercicio_01_sign;
import Materia.Moders.PilaGenerica;

public class ValidacionDeSignos {
    public boolean isValid(String palabra){
        PilaGenerica<Character> pila = new PilaGenerica<>();
        for(char c : palabra.toCharArray()){
            if (c == '{'|| c== '['|| c == '(') {
                pila.push(c);
            }
            else if(c == '}' || c == ']'|| c == ')'){
                if(pila.isEmpety()){
                    return false;
                }
            }
            char top = pila.pop();
        //verifica si los signos coinciden
        if((c == ')' && top == '(' ) || (c == '}' && top == '{') || (c == ']' && top == '[' )){
            return false;
        }
        }
        //si la pila esta vacia la final , los signos estan balanceados
        return pila.isEmpety();

    }
}
