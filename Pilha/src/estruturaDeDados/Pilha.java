package estruturaDeDados;

public class Pilha {

    private no top;
    private int height;

    public class no {

        public int value;

        no next;

        no (int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public Pilha(int value) {
        no newno = new no(value);
        top = newno;
        height = 1;
    }

    //ler topo
    public void getTop() {
        if (top == null) {
            System.out.println("Pilha vazia");
        } else {
            System.out.println("Topo: " + top.value);
        }
    }

    //altura da pilha
    public void getHeight() {
        System.out.println("Altura: " + height);
    }

    //imprimir
    public void print() {
        System.out.println("########################");

        no temp = top;

        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }

        System.out.println("########################");
    }

    //inserir
    public void push(int value) {
        no newno = new no(value);

        if (height == 0) {
            top = newno;
        } else {
            newno.next = top;
            top = newno;
        }

        height++;
    }

    //remover
    public no pop() {
        if (height == 0) return null;

        no temp = top;
        top = top.next;
        temp.next = null;
        height--;

        return temp;
    }
}
