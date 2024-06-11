package Animais;

public class Passaro extends Animal {
    //classe filha
    static int numeroDePassaros;

    public Passaro(String nome, String cor, double peso) {
        super(nome, cor, peso);
    }



    @Override
    public String toString() {
        return "Passaro{" +
                "nome='" + nome + '\'' +
                '}';
    }
    @Override //a classe filha tem uma açao diferente da classe pai
    public void soar() {
        System.out.println("PIU PIU");
    }
}
