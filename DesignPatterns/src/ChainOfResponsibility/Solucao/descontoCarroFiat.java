package ChainOfResponsibility.Solucao;

import ChainOfResponsibility.carro;
import ChainOfResponsibility.marcasEnum;

import java.math.BigDecimal;

public class descontoCarroFiat extends descontoCarro{

    public descontoCarroFiat(descontoCarro proximoDesconto) {
        super(proximoDesconto);
    }

    @Override
    public BigDecimal aplicaDesconto(carro carro) {
        BigDecimal valorVenda = carro.getPreco();
        if (marcasEnum.FIAT.equals(carro.getMarca())) {
            return valorVenda.subtract(new BigDecimal(1000));
        }
        return proximoDesconto.aplicaDesconto(carro);
    }
}
