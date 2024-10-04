package ChainOfResponsibility.Problema;

import ChainOfResponsibility.carro;
import ChainOfResponsibility.marcasEnum;

import java.math.BigDecimal;

public class vendaCarroService {

    public BigDecimal calculaValorVenda(carro carro) {
        BigDecimal valorVenda = carro.getPreco();

        if (marcasEnum.FIAT.equals(carro.getMarca())) {
            return valorVenda.subtract(new BigDecimal(1000));
        }

        if (marcasEnum.FORD.equals(carro.getMarca())) {
            return valorVenda.subtract(new BigDecimal(2000));
        }

        if (carro.getPreco().compareTo(new BigDecimal(100000.00)) > 0) {
            return valorVenda.subtract(new BigDecimal(10000));
        }

        return valorVenda;
    }
}
