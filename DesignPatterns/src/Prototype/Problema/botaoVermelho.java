package Prototype.Problema;

import Prototype.botao;
import Prototype.tipoBordaEnum;

public class botaoVermelho extends botao {

    public botaoVermelho() {
        setCor("Vermelho");
        setAltura(30);
        setLargura(100);
        setTipoBorda(tipoBordaEnum.FINA);
    }
}
