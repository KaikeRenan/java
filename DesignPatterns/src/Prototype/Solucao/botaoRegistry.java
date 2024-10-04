package Prototype.Solucao;

import Prototype.botao;
import Prototype.tipoBordaEnum;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class botaoRegistry {

//    private static botaoRegistry botaoRegistry;

    private static Map<String, botao> REGISTRY = new HashMap<>(); //map registra esse prototipos

    static {
        botao botaoAmarelo = new botao();
        botaoAmarelo.setCor("Amarelo");
        botaoAmarelo.setAltura(40);
        botaoAmarelo.setLargura(100);
        botaoAmarelo.setTipoBorda(tipoBordaEnum.TRACEJADA);

        botao botaoVermelho = new botao();
        botaoVermelho.setCor("Vermelho");
        botaoVermelho.setAltura(30);
        botaoVermelho.setLargura(100);
        botaoVermelho.setTipoBorda(tipoBordaEnum.FINA);

        botao botaoAzul = new botao();
        botaoAzul.setCor("Azul");
        botaoAzul.setAltura(35);
        botaoAzul.setLargura(125);
        botaoAzul.setTipoBorda(tipoBordaEnum.TRACEJADA);

        REGISTRY.put("Botao_Amarelo", botaoAmarelo) ;
        REGISTRY.put("Botao_Vermelho", botaoVermelho) ;
        REGISTRY.put("Botao_Azul", botaoAzul) ;
    }

//    public static botaoRegistry getInstance(){
//        if (Objects.isNull(botaoRegistry)) {
//            botaoRegistry = new botaoRegistry();
//            return botaoRegistry;
//        }
//        return botaoRegistry;
//    }

    public static botao getBotao(String chave) {
        return botaoFactory.getInstance(REGISTRY.get(chave));
    }

    public static void addRegistry(String chave, botao botao) {
        REGISTRY.put(chave, botao);
    }
}
