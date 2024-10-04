package Prototype.Problema;

import Prototype.botao;
import Prototype.tipoBordaEnum;

//PROBLEMA para cada botao tem q criar uma classe
public class botaoAmarelo extends botao {

    public botaoAmarelo() {
        setCor("Amarelo");
        setAltura(40);
        setLargura(100);
        setTipoBorda(tipoBordaEnum.TRACEJADA);
    }

}
