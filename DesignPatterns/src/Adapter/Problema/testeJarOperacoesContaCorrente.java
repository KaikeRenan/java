package Adapter.Problema;

import java.math.BigDecimal;

public class testeJarOperacoesContaCorrente {
    public static void main(String[] args) {
        jarOperacoesContaCorrente jarConta =  new jarOperacoesContaCorrente();
        clienteJarOperacoesContaCorrente client = new clienteJarOperacoesContaCorrente(jarConta);

        BigDecimal valorPretendidoParaSaque = new BigDecimal(1000);

        //programador pode esquecer de validar
        if (client.validaSaldo(valorPretendidoParaSaque)) { // 1° chamada
            client.saca(valorPretendidoParaSaque); //2° chamada
        }

        client.deposita(new BigDecimal(500)); //3° chamada
    }
}
