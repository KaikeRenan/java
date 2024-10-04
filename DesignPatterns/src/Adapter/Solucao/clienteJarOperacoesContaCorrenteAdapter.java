package Adapter.Solucao;

import Adapter.Problema.jarOperacoesContaCorrente;

import java.math.BigDecimal;

public class clienteJarOperacoesContaCorrenteAdapter {

    private jarOperacoesContaCorrenteAdapter jarContaAdapter;

    public clienteJarOperacoesContaCorrenteAdapter(jarOperacoesContaCorrenteAdapter jarContaAdapter) {
        this.jarContaAdapter = jarContaAdapter;
    }

    public void saca(BigDecimal valorPretendido) {

        jarContaAdapter.saca(valorPretendido);
    }

    public void deposita(BigDecimal valor) {

        jarContaAdapter.deposita(valor);
    }
}
