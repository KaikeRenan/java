import Animais.Cachorro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //cachorro1 é a variavel de referencia

//        Cachorro cachorro1;
//        cachorro1 = new Cachorro();
        //criando objeto cachorro
        //construtor padrao

        Cachorro cachorro1 = new Cachorro("Puppy", "Marrom",0.25, 5.5, 0.5, "neutro");
        //Construtor com add de valores
        Cachorro cachorro2 = new Cachorro("Rex", "Marrom",0.25, 5.5, 0.5, "neutro");

//        cachorro1.nome = "Pupp";
//        cachorro1.cor = "marrom";
//        cachorro1.altura = 0.25;
//        cachorro1.peso = 5.5;
//        cachorro1.tamanho_rabo = 0.5;
        //add valores a esse objeto

//        cachorro1.setNome("Pupp");
//        cachorro1.setCor("marrom");
//        cachorro1.setAltura(0.25);
//        cachorro1.setPeso(5.5);
//        cachorro1.setTamanho_rabo(0.5);
        //add valores com encapsulamento utilizando métodos

//        System.out.println(cachorro1);
        //mostra onde que o cachorro esta na memória

//        cachorro1.latir();
//
//        System.out.println("O cachorro pegou uma " + cachorro1.pegar());

        System.out.println(cachorro1.getNome());
        System.out.println(cachorro1.getPeso());

        System.out.println("O cachorro está " + cachorro1.interagir("nada"));
        System.out.println("O cachorro está " + cachorro1.interagir("carinho"));
        System.out.println("O cachorro está " + cachorro1.interagir("vai dormir"));
        System.out.println("O cachorro está " + cachorro1.interagir("pisar na batinha"));
        //açao de um objeto
        System.out.println("---------------------------------------");
        System.out.println(cachorro1.toString());
        System.out.println(cachorro2.toString());
        System.out.println("---------------------------------------");
        System.out.println(cachorro2.getNumeroDeCachorros()); //total de objetos
    }
}