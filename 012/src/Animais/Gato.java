package Animais;

public class Gato extends Animal {
    //classe filha
    static int numeroDeGatos;

    public Gato(String nome, String cor, double peso) {
        super(nome, cor, peso); //super - construtor pai
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override //a classe filha herda da classe pai, mas tem uma açao diferente da classe pai
    public void soar() {
        System.out.println("MIAU MIAU");
    }
}
