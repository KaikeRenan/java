package ChainOfResponsibility.Solucao;

import ChainOfResponsibility.carro;
import ChainOfResponsibility.marcasEnum;

import java.math.BigDecimal;

public class descontoCarroFord extends descontoCarro{

    public descontoCarroFord(descontoCarro proximoDesconto) {
        super(proximoDesconto);
    }

    @Override
    public BigDecimal aplicaDesconto(carro carro) {
        BigDecimal valorVenda = carro.getPreco();
        if (marcasEnum.FORD.equals(carro.getMarca())) {
            return valorVenda.subtract(new BigDecimal(2000));
        }
        return proximoDesconto.aplicaDesconto(carro);
    }
}
