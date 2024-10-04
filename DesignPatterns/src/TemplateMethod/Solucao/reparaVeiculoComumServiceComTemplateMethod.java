package TemplateMethod.Solucao;

import TemplateMethod.veiculoParaReparo;

public class reparaVeiculoComumServiceComTemplateMethod extends reparoVeiculoService {

    private TemplateMethod.veiculoParaReparo veiculoParaReparo;

    public reparaVeiculoComumServiceComTemplateMethod(veiculoParaReparo veiculoParaReparo) {
        this.veiculoParaReparo = veiculoParaReparo;
    }

    @Override
    protected boolean veiculoParaReparo() {
        return veiculoParaReparo.getPorcentagemDano() <= 70;
    }
}
