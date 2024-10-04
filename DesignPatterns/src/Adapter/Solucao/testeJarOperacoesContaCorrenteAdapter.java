package Adapter.Solucao;

import Adapter.Problema.clienteJarOperacoesContaCorrente;
import Adapter.Problema.jarOperacoesContaCorrente;

import java.math.BigDecimal;

public class testeJarOperacoesContaCorrenteAdapter {
    public static void main(String[] args) {
        jarOperacoesContaCorrente JarConta = new jarOperacoesContaCorrente();
        jarOperacoesContaCorrenteAdapter jarContaAdapter = new jarOperacoesContaCorrenteAdapter(JarConta);
        clienteJarOperacoesContaCorrenteAdapter client = new clienteJarOperacoesContaCorrenteAdapter(jarContaAdapter);

        BigDecimal valorPretendidoParaSaque = new BigDecimal(1000);

        client.saca(valorPretendidoParaSaque); //1° chamada

        client.deposita(new BigDecimal(500)); //2° chamada
    }
}
