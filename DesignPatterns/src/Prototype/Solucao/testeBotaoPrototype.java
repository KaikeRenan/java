package Prototype.Solucao;

import Prototype.botao;
import Prototype.tipoBordaEnum;

public class testeBotaoPrototype {
    public static void main(String[] args) {
        // aqui no registry fica registrado nosso prototipos
        botao botaoVermelho = botaoRegistry.getBotao("Botao_Vermelho");
        System.out.println(botaoVermelho);

        botao botaoAzul = botaoRegistry.getBotao("Botao_Azul");
        System.out.println(botaoAzul);

        botao botaoAmarelo = botaoRegistry.getBotao("Botao_Amarelo");
        System.out.println(botaoAmarelo);
        botaoAmarelo.setLargura(200);
        System.out.println(botaoAmarelo);

        botao botaoAmarelo2 = botaoRegistry.getBotao("Botao_Amarelo");
        System.out.println(botaoAmarelo2);

        String chave = "Botao_Preto";
        botao botaoPreto = new botao();
        botaoPreto.setCor("Amarelo");
        botaoPreto.setAltura(50);
        botaoPreto.setLargura(300);
        botaoPreto.setTipoBorda(tipoBordaEnum.FINA);

        botaoRegistry.addRegistry(chave, botaoPreto);

        botao botaoPretoClone = botaoRegistry.getBotao("Botao_Preto");
        System.out.println(botaoPretoClone);
    }
}
