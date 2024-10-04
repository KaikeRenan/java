package TemplateMethod.Problema;

import TemplateMethod.veiculoParaReparo;

public class testeReparoVeiculos {

    public static void main(String[] args) {
        System.out.println("---------------Luxo---------------");
        veiculoParaReparo veiculoDeLuxo = new veiculoParaReparo();
        veiculoDeLuxo.setPorcentagemDano(49);

        reparaVeiculoLuxoService rpl = new reparaVeiculoLuxoService(veiculoDeLuxo);

        rpl.reparaVeiculo();

        System.out.println("---------------Comum---------------");

        veiculoParaReparo veiculoComum = new veiculoParaReparo();
        veiculoComum.setPorcentagemDano(71);

        reparaVeiculoComumService rpc = new reparaVeiculoComumService(veiculoComum);

        rpc.reparaVeiculo();
    }
}
