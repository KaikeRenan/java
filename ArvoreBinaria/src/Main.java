import estruturaDeDados.arvoreBinaria;

public class Main {
//    public static void main(String[] args) {
//        arvoreBinaria arvoreBinaria  = new arvoreBinaria();
//        arvoreBinaria.insert(1);
//        arvoreBinaria.insert(2);
//        arvoreBinaria.insert(3);
//
//        System.out.println(arvoreBinaria.root.value);
//        System.out.println(arvoreBinaria.root.left.value);
//        System.out.println(arvoreBinaria.root.right.value);
//
//        System.out.println(arvoreBinaria.root.isLeaf());
//        System.out.println(arvoreBinaria.root.right.isLeaf());
//    }

    public static void main(String[] args) {
        arvoreBinaria arvoreBinaria = new arvoreBinaria();
        arvoreBinaria.insert(37);
        arvoreBinaria.insert(11);
        arvoreBinaria.insert(66);
        arvoreBinaria.insert(8);
        arvoreBinaria.insert(17);
        arvoreBinaria.insert(42);
        arvoreBinaria.insert(72);

        System.out.println("###############");
//        arvoreBinaria.preOrder();
//        arvoreBinaria.inOrder();
//        arvoreBinaria.posOrder();
        arvoreBinaria.BFS();
        System.out.println("###############");
    }
}
