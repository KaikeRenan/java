//dada uma string de expressao exp, escreva um programa para
//examinar se os pares e as orden de "{}", "()" e "[]"
//estao corretos na expressao dada.

import java.util.Set;
import java.util.Stack;

public class problema1 {
    public static boolean solucao(String expressao) {
        Set<Character> abertura = Set.of('(', '{', '[');
        Set<Character> fechamento = Set.of(')', '}', ']');

        Stack<Character> pilha = new Stack<>(); //pilha do próprio Java

        for(char c: expressao.toCharArray()) {
            if (abertura.contains(c)) pilha.push(c);
            if (fechamento.contains(c)) {
                if(pilha.isEmpty()) return false;
                var open = pilha.pop();
                if(open == '(' && c != ')') return false;
                if(open == '{' && c != '}') return false;
                if(open == '[' && c != ']') return false;
            }
        }

        return pilha.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(solucao("2*(3+4+5*[2+3)]"));
    }
}

