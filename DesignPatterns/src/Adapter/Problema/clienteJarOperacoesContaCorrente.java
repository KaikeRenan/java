package Adapter.Problema;

import java.math.BigDecimal;

public class clienteJarOperacoesContaCorrente {

    private jarOperacoesContaCorrente jocc;

    public clienteJarOperacoesContaCorrente(jarOperacoesContaCorrente jocc) {
        this.jocc = jocc;
    }

    public boolean validaSaldo(BigDecimal valorPretendidoSaque) {
        return jocc.validaSaldo(valorPretendidoSaque);
    }

    public void saca(BigDecimal valorPretendido) {
        jocc.saca(valorPretendido);
    }

    public void deposita(BigDecimal valor) {
        jocc.deposita(valor);
    }
}
