package Prototype.Solucao;

import Prototype.botao;

public class botaoFactory {
    public static botao getInstance(botao prototipo) {
        botao clone = new botao();
        clone.setCor(prototipo.getCor());
        clone.setAltura(prototipo.getAltura());
        clone.setLargura(prototipo.getLargura());
        clone.setTipoBorda(prototipo.getTipoBorda());

        return clone;
    }
}
