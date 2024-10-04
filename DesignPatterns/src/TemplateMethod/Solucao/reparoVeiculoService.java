package TemplateMethod.Solucao;

public abstract class reparoVeiculoService {

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

    protected abstract boolean veiculoParaReparo();

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
