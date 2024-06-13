package estruturaDeDados;

public class fila {

    private no first;
    private no last;
    private int length;

    public class no {
        public int value;
        no next;

        no(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

    public fila(int value) {
        no newno = new no(value);
        first = newno;
        last = newno;
        length++;
    }

    public void getFirst() {
        if (first != null) {
            System.out.println("First: " + first.value);
        } else {
            System.out.println("Fila está vazia");
        }
    }

    public void getLast() {
        if (first != null) {
            System.out.println("Last: " + last.value);
        } else {
            System.out.println("Fila está vazia");
        }
    }

    public void getLength() {
        System.out.println("Length: "+ length);
    }

    public void print() {
        System.out.println("##############################");
        no temp = first;
        while(temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println("##############################");
    }

    public void enqueue(int value) {
        no newno = new no(value);
        if (length == 0) {
            first = newno;
            last = newno;
        } else {
            last.next = newno;
            last = newno;
        }
        length++;
    }

    public no dequeue() { //respeita a ordem de inserçao da fila
        if (length == 0) return null;
        no temp = first;
        if (length == 1) {
            first = null;
            last = null;
        } else {
            first = first.next;
            temp.next = null;
        }
        length--;
        return temp;
    }
}
