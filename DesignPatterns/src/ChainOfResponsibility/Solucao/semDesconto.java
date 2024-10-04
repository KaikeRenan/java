package ChainOfResponsibility.Solucao;

import ChainOfResponsibility.carro;
import ChainOfResponsibility.marcasEnum;

import java.math.BigDecimal;

public class semDesconto extends descontoCarro{

    public semDesconto(descontoCarro proximoDesconto) {
        super(proximoDesconto);
    }

    @Override
    public BigDecimal aplicaDesconto(carro carro) {
        return BigDecimal.ZERO;
    }
}
