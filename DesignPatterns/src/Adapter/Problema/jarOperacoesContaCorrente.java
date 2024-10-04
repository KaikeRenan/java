package Adapter.Problema;

import java.math.BigDecimal;

public class jarOperacoesContaCorrente {
    public boolean validaSaldo(BigDecimal valorPretendidoSaque) {
        System.out.println("Validando Saque...");
        return true;
    }


    public void saca(BigDecimal valorPretendido) {
        System.out.println("Sacando...");
    }

    public void deposita(BigDecimal valor) {
        System.out.println("Depositando...");
    }
}


