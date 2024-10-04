package ChainOfResponsibility.Solucao;

import ChainOfResponsibility.carro;

import java.math.BigDecimal;

public abstract class descontoCarro {
    protected descontoCarro proximoDesconto;

    public descontoCarro(descontoCarro proximoDesconto) {
        this.proximoDesconto = proximoDesconto;
    }

    public abstract BigDecimal aplicaDesconto(carro carro);
}
