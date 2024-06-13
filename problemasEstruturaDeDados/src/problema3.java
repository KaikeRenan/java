//dada uma árvore binária,
// encontre o maior valor em cada nível.
import estruturaDeDados.arvoreBinaria;

import java.util.ArrayList;
import java.util.List;

public class problema3 {

    public static List<Integer> problema3(arvoreBinaria arvoreBinaria) {

        var list = new ArrayList<Integer>();
        solucaoArvore(arvoreBinaria.root, 0, list);
        return list;
    }

    public static void solucaoArvore(final arvoreBinaria.no no, final int nivel, final ArrayList<Integer> list) {
        if (no == null) return;

        if(nivel == list.size()) {
            list.add(no.value);
        } else {
            list.set(nivel, Math.max(list.get(nivel), no.value));
        }

        solucaoArvore(no.left, nivel+1,list);
        solucaoArvore(no.right, nivel+1,list);
    }

    public static void main(String[] args) {
        arvoreBinaria arvore = new arvoreBinaria();
        arvore.insert(100);

        arvore.insert(10);
        arvore.insert(5);

        arvore.insert(6);
        arvore.insert(1);
        arvore.insert(7);
        arvore.insert(5);

        System.out.println(problema3(arvore));
    }
}
