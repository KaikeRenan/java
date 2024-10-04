package Adapter.Solucao;

import Adapter.Problema.jarOperacoesContaCorrente;

import java.math.BigDecimal;

public class jarOperacoesContaCorrenteAdapter {

    private jarOperacoesContaCorrente jarConta;

    public jarOperacoesContaCorrenteAdapter(jarOperacoesContaCorrente jarConta) {

        this.jarConta = jarConta;
    }

    public void saca(BigDecimal valorPretendido) {
        if (jarConta.validaSaldo(valorPretendido)) {
            jarConta.saca(valorPretendido);
        }else {
            throw new IllegalArgumentException("Valor para saque nao permitido.");
        }
        System.out.println("Sacando...");
    }

    public void deposita(BigDecimal valor) {
        jarConta.deposita(valor);
    }
}


