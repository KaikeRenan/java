package ChainOfResponsibility.Solucao;

import ChainOfResponsibility.carro;
import ChainOfResponsibility.marcasEnum;

import java.math.BigDecimal;

public class descontoCarroMaiorQue100k extends descontoCarro{

    public descontoCarroMaiorQue100k(descontoCarro proximoDesconto) {
        super(proximoDesconto);
    }

    @Override
    public BigDecimal aplicaDesconto(carro carro) {
        BigDecimal valorVenda = carro.getPreco();
        if (carro.getPreco().compareTo(new BigDecimal(100000.00)) > 0) {
            return valorVenda.subtract(new BigDecimal(10000));
        }
        return proximoDesconto.aplicaDesconto(carro);
    }
}
