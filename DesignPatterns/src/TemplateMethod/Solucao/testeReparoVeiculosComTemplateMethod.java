package TemplateMethod.Solucao;

import TemplateMethod.veiculoParaReparo;

public class testeReparoVeiculosComTemplateMethod {

    public static void main(String[] args) {
        System.out.println("---------------Luxo---------------");
        veiculoParaReparo veiculoLuxo = new veiculoParaReparo();
        veiculoLuxo.setPorcentagemDano(55);

        reparoVeiculoService rpl = new reparaVeiculoLuxoServiceComTemplateMethod(veiculoLuxo);

        rpl.reparaVeiculo();

        System.out.println("---------------Comum---------------");

        veiculoParaReparo veiculoComum = new veiculoParaReparo();
        veiculoComum.setPorcentagemDano(69);

        reparoVeiculoService rpc = new reparaVeiculoComumServiceComTemplateMethod(veiculoComum);

        rpc.reparaVeiculo();
    }
}
