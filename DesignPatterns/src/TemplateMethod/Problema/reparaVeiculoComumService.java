package TemplateMethod.Problema;

import TemplateMethod.veiculoParaReparo;

public class reparaVeiculoComumService {

    private TemplateMethod.veiculoParaReparo veiculoParaReparo;

    public reparaVeiculoComumService(veiculoParaReparo veiculoParaReparo) {
        this.veiculoParaReparo = veiculoParaReparo;
    }

    public void reparaVeiculo() {
        entradaOficina();
        analisarDanos();
        if(veiculoParaReparo()) {
            repararVeiculo();
            notificarReparoParaSeguradora();
        } else {
            notificarPerdaTotalParaSeguradora();
        }
    }

    private boolean veiculoParaReparo() {
        return veiculoParaReparo.getPorcentagemDano() <= 70;
    }

    private void notificarPerdaTotalParaSeguradora() {
        System.out.println("Notificando perda total para a Seguradora...");
    }

    private void notificarReparoParaSeguradora() {
        System.out.println("Notificando reparo para a Seguradora...");
    }

    private void repararVeiculo() {
        System.out.println("Reparando Veiculo...");
    }

    private void analisarDanos() {
        System.out.println("Analisando Danos...");
    }

    private void entradaOficina() {
        System.out.println("Veiculo Entrando Oficina...");
    }


}
