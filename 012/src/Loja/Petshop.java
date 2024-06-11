package Loja;

import Animais.Animal;
import Animais.Cachorro;

public class Petshop {

    //métodos
    public void darBanho(Animal animal) { //aceita todas as classes
        animal.setEstadoDeEspirito("Limpo");
    }

    public void tosar(Cachorro cachorro) { //aceita apenas a classe cachorro
        cachorro.setEstadoDeEspirito("Tosado");
    }

    public void deixarHotel(Animal animal) { //aceita todas as classes
        animal.setEstadoDeEspirito("com Saudades");
    }

}
