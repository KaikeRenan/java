package ChainOfResponsibility.Solucao;

import ChainOfResponsibility.carro;
import ChainOfResponsibility.marcasEnum;

import java.math.BigDecimal;

public class vendaCarroServiceComChainOfResponsibility {

    public BigDecimal calculaValorVenda(carro carro) {
        BigDecimal valorVenda = carro.getPreco();

        descontoCarro desconto =
                new descontoCarroFiat(
                    new descontoCarroFord(
                            new descontoCarroMaiorQue100k(
                                    new semDesconto(null)
                            )));

        return desconto.aplicaDesconto(carro);
    }
}
