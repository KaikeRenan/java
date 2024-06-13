import estruturaDeDados.Pilha;

public class Main {
    public static void main(String[] args) {
        Pilha myPilha = new Pilha(2);
        myPilha.push(1);

        System.out.println(myPilha.pop().value);
        System.out.println(myPilha.pop().value);

        System.out.println(myPilha.pop() == null);

//        myPilha.getTop();
//        myPilha.getHeight();
//
//        myPilha.print();
//
//        myPilha.print();
//        myPilha.getTop();
//        myPilha.getHeight();
    }
}