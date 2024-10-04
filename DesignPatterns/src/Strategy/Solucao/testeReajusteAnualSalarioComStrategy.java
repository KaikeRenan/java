package Strategy.Solucao;

import Strategy.Problema.reajusteAnualSalario;

import java.math.BigDecimal;

public class testeReajusteAnualSalarioComStrategy {

    public static void main(String[] args) {
        reajusteAnualSalarioComStrategy reajusteAnualSalario = new reajusteAnualSalarioComStrategy();

        funcionario funcionarioCLT = new funcionario();
        funcionarioCLT.setNome("Victor");
        funcionarioCLT.setTipoContratacao(tipoContratacaoEnum.CLT);
        funcionarioCLT.setSalario(new BigDecimal(5000));

        funcionario funcionarioPJ = new funcionario();
        funcionarioPJ.setNome("Podolski");
        funcionarioPJ.setTipoContratacao(tipoContratacaoEnum.PJ);
        funcionarioPJ.setSalario(new BigDecimal(10000));

        funcionario funcionarioEstagio = new funcionario();
        funcionarioEstagio.setNome("Osvaldo");
        funcionarioEstagio.setTipoContratacao(tipoContratacaoEnum.ESTAGIO);
        funcionarioEstagio.setSalario(new BigDecimal(3000));

        //calcular nosso reajustes anuais

        reajusteAnualSalario.calculaReajusteAnual(funcionarioCLT, new calculadorReajusteAnualSalarioCLT());
        reajusteAnualSalario.calculaReajusteAnual(funcionarioPJ, new calculadorReajusteAnualSalarioPJ());
        reajusteAnualSalario.calculaReajusteAnual(funcionarioEstagio, new calculadorReajusteAnualSalarioESTAGIO());

        System.out.println(funcionarioCLT.getSalario());
        System.out.println(funcionarioPJ.getSalario());
        System.out.println(funcionarioEstagio.getSalario());
    }
}
