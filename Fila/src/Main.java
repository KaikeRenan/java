import estruturaDeDados.fila;

public class Main {
    public static void main(String[] args) {
        fila myFila = new fila(1);
        myFila.enqueue(2);
        myFila.enqueue(3);

        System.out.println(myFila.dequeue().value);
        System.out.println(myFila.dequeue().value);
        System.out.println(myFila.dequeue().value);

//        myFila.getFirst();
//        myFila.getLast();
//        myFila.getLength();
//        myFila.print();
    }
}