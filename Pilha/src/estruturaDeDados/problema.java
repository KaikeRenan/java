package estruturaDeDados;

public class problema {
//utilizando uma pilha, inverta um conjunto de dados fornecidos pelo usuario
    public static void main(String[] args) {

        int [] numeros = {5,4,3,2,1};

        inverter(numeros);
    }

    private static void inverter(final int[] numeros) {
        Pilha pilha = new Pilha(numeros[0]);

        for (int i = 1; i < numeros.length; i++) {
            pilha.push(numeros[i]);
        }

        var no = pilha.pop();
        while (no != null){
            System.out.println(no.getValue());
            no = pilha.pop();
        }
    }
}
