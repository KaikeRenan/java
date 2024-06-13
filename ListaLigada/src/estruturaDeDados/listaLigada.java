package estruturaDeDados;

public class listaLigada {
    //atributos
    private no head;
    private no tail;
    private int length;

    //construtores
    public class no {
        public String dado;
        no next; // cada nó aponta para outro nó

        no(String dado) {
            this.dado = dado;
        }
    }

    public listaLigada(String dado) {
        length = 1;
        no newno = new no(dado);
        head = newno;
        tail = newno;
    }

    //métodos

    //Ler item
    public void getHead() {
        if (this.head == null) {
            System.out.println("Lista Vazia");
        } else {
            System.out.println("Head: " + head.dado);
        }
    }

    public void getTail() {
        if (this.tail == null) {
            System.out.println("Lista Vazia");
        } else {
            System.out.println("Tail: " + tail.dado);
        }
    }

    public no get(int index) {
        if (index < 0 || index >= length) return null;
        no temp = head;
        for (int i = 0; i<index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    //Operaçoes opcionais:
    public void getLength() {
        System.out.println("Length: " + this.length);
    }

    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    public boolean set(int index,String dado) { //troca de um valor
        no temp = get(index);
        if (temp != null) {
            temp.dado = dado;
            return true;
        }
        return false;
    }

    //Imprimir
    public void print() {
        System.out.println("##############################");
        no temp = this.head;
        while (temp != null) {
            System.out.println(temp.dado);
            temp = temp.next;
        }
        System.out.println("##############################");
    }

    //Adicionar item
    public void prepend(String dado) {
        no newno = new no(dado);
        if(length == 0) {
            head = newno;
            tail = newno;
        } else {
            newno.next = head;
            head = newno;
        }

        length++;
    }

    public void append(String dado) {
        no newno = new no(dado);
        if (length == 0) {
            head = newno;
            tail = newno;
        } else {
            tail.next = newno;
            tail = newno;
        }
        length++;
    }

    public boolean insert(int index,String dado) {
        if (index < 0 || index >= length) return false;
        if (index == 0) {
            prepend(dado);
            return true;
        }
        if (index == length) {
            append(dado);
            return true;
        }

        no newno = new no(dado);
        no temp = get(index-1);
        newno.next = temp.next;
        temp.next = newno;
        length++;
        return true;
    }

    //Remover item
    public no removeFirst() {
        if (length == 0) return null;
        no temp = head;
        head = head.next;
        temp.next = null;
        length--;

        if (length == 0) {
            head = null;
            tail = null;
        }

        return temp;
    }

    public no removeLast() {
        if (length == 0) return null;

        no pre = head;
        no temp = null;

        while(pre.next != tail) {
            pre = pre.next;
        }

        temp = tail;
        tail = pre;
        tail.next = null;

        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }

        return temp;
    }

    public no delete(int index) {
        if (index < 0 || index >= length) return null;
        if (index == 0) return removeFirst();
        if (index == length - 1) return removeLast();

        no prev = get(index - 1);
        no temp = prev.next;

        prev.next = temp.next;
        temp.next = null;
        length--;

        return temp;
    }

}
