import estruturaDeDados.arvoreBinariaDeBusca;

public class Main {
    public static void main(String[] args) {
        arvoreBinariaDeBusca arvore = new arvoreBinariaDeBusca();
        arvore.insert(37);
        arvore.insert(11);
        arvore.insert(66);
        arvore.insert(8);
        arvore.insert(17);
        arvore.insert(42);
        arvore.insert(72);

        arvore.deleteNo(66);

//        System.out.println(arvore.contains(11));
//        System.out.println(arvore.contains(99));

        arvore.inOrder();
    }
}