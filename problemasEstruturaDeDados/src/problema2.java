//dado um inteiro K e uma fila de inteiro,
//a tarefa é inverter a ordem dos primeiros K elementos da fila,
//deixando os demais elementos na mesma ordem relativa.

import java.util.LinkedList;
import java.util.Queue;

public class problema2 {
    public static Queue<Integer> reverseFirstK(Queue<Integer> queue, int k) {
        solucaoFila(queue, k);
        int n = queue.size() - k;
        while (n-- > 0) {
            int element = queue.remove();
            queue.add(element);
        }
        return queue;
    }

    private static void solucaoFila(final Queue<Integer> queue, final int k) {
        if (k == 0) return;
        int element = queue.remove();
        solucaoFila(queue, k-1);
        queue.add(element);
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(reverseFirstK(queue,3));
    }
}

