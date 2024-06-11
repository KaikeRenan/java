import Animais.Animal;
import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;
import Loja.Petshop;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("Puppy", "Marrom",0.25, 5.5, 0.5, "neutro");
        Gato gato1 = new Gato("Felix","Preto",4.5);
//        Animal gato2 = new Gato("Felix","Preto",4.5);
//        Animal gato3 = new Animal("Felix","Preto",4.5); n funciona mais pq Animal é uma classe abstrata
        Passaro passaro1 = new Passaro("Frajola","Azul",0.5);

        cachorro1.soar();
        gato1.soar();
        passaro1.soar();

        Petshop petshop = new Petshop();

        petshop.darBanho(cachorro1);
        System.out.println(cachorro1.getEstadoDeEspirito());

        petshop.darBanho(gato1);
        System.out.println(gato1.getEstadoDeEspirito());

        petshop.tosar(cachorro1);
        System.out.println(cachorro1.getEstadoDeEspirito());

    }
}