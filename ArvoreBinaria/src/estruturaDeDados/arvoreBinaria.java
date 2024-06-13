package estruturaDeDados;

import java.util.LinkedList;
import java.util.Queue;

public class arvoreBinaria {

    //inicializaçao
    public no root; //nó raiz

    public static class no {
        public int value;
        public no left;
        public no right;

        public no(int value) {
            this.value = value;
        }
        //é folha?
        public boolean isLeaf() {
            return (this.left == null) && (this.right == null);
        }
    }

    //inserir
    public void insert(int value) {
        if (root == null) root = new no(value);
        else {
            no newno = new no(value);
            Queue<no> queue = new LinkedList<>(); //fila do próprio Java e lista ligada também
            queue.add(root);
            while (queue.size() > 0) {
                no currentno = queue.remove();
                if (currentno.left == null) {
                    currentno.left = newno;
                    break;
                } else {
                    queue.add(currentno.left);
                }
                if (currentno.right == null) {
                    currentno.right = newno;
                    break;
                } else {
                    queue.add(currentno.right);
                }
            }
        }
    }

    //travessia

    //pré ordem

    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(final no no) {
        //R E D
        if (no == null) return;
        System.out.println(no.value);
        preOrder(no.left);
        preOrder(no.right);
    }

    //ordem
    public void inOrder() {
        inOrder(root);
    }
    private void inOrder(final no no) {
        //E R D
        if (no == null) return;
        inOrder(no.left);
        System.out.println(no.value);
        inOrder(no.right);
    }

    //pós ordem
    public void posOrder() {
        posOrder(root);
    }
    private void posOrder(final no no) {
        //E D R
        if (no == null) return;
        posOrder(no.left);
        posOrder(no.right);
        System.out.println(no.value);
    }

    //busca

    //busca em largura (BFS)
    public void BFS() {
        if (root == null) return;
        Queue<no> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            no no = queue.remove();
            if (no.left != null) queue.add(no.left);
            if (no.right != null) queue.add(no.right);
            System.out.println(no.value);
        }
    }

    //busca em profundidade (DFS) = pré-ordem
}
