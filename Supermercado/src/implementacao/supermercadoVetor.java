package implementacao;

public class supermercadoVetor extends supermercado {

    private final String[] itens;

    private int lastIndex;

    public supermercadoVetor(final int size) {
        itens = new String[size];
        lastIndex = -1;
    }

    @Override
    public void add(String item) {
        super.add(item);
        if (lastIndex == itens.length-1) {
            System.err.println("Lista de supermercado cheia"); //err pra deixar vermelha
        } else {
            lastIndex++;
            itens[lastIndex] = item;
        }
    }

    @Override
    public void print() {
        super.print();
        System.out.println("##################################################");
        if (lastIndex < 0) {
            System.out.println("Lista de supermercado vazia");
        }
        for(int i = 0; i <= lastIndex; i++) {
            System.out.println(i + " - " + itens[i]);
        }
        System.out.println("##################################################");
    }

    @Override
    public void delete(int index) {
        super.delete(index);
        if (index >= 0 && index <= lastIndex) {
            shift(index); //puxa os elementos da direita para esquerda
            lastIndex--;
        } else {
            System.out.println("Índice inválido: " + index);
        }
    }

    private void shift(int index) {
        for (int i = index; i < lastIndex; i++) {
            itens[i] = itens[i+1];
        }
    }
}
