package estruturaDeDados;

//Imagine que voce está desenvolvendo um sistema de atendimento ao cliente para uma loja.
// Crie um programa Java que simule a fila de atendimento,
// onde os clientes entram na fila e sao atendidos um por um

import java.util.Random;

public class problema {

    public static void main(String[] args) {
        int n = 5;

        var random = new Random();
        int cliente = random.nextInt(101);

        fila fila = new fila(cliente);

        System.out.println("Chegou o cliente: " + cliente);

        for(int i = 2; i <= n; i++){
            cliente = random.nextInt(101);
            System.out.println("Chegou o cliente: " + cliente);
            fila.enqueue(cliente);
        }

        //Atendimento dos clientes
        var no = fila.dequeue();
        while (no != null) {
            System.out.println("Atendimento o cliente: " + no.getValue());
            no = fila.dequeue();
        }
    }

}

