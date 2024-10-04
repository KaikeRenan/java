package TemplateMethod.Solucao;

import TemplateMethod.veiculoParaReparo;

public class reparaVeiculoLuxoServiceComTemplateMethod extends reparoVeiculoService {

    private TemplateMethod.veiculoParaReparo veiculoParaReparo;

    public reparaVeiculoLuxoServiceComTemplateMethod(veiculoParaReparo veiculoParaReparo) {
        this.veiculoParaReparo = veiculoParaReparo;
    }

    @Override
    protected boolean veiculoParaReparo() {
        return veiculoParaReparo.getPorcentagemDano() <= 50;
    }
}
