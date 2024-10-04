package Strategy.Problema;

import Strategy.Solucao.funcionario;
import Strategy.Solucao.tipoContratacaoEnum;

import java.math.BigDecimal;

public class testeReajusteAnualSalario {

    public static void main(String[] args) {
        reajusteAnualSalario reajusteAnualSalario = new reajusteAnualSalario();

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

        reajusteAnualSalario.calculaReajusteAnual(funcionarioCLT);
        reajusteAnualSalario.calculaReajusteAnual(funcionarioPJ);
        reajusteAnualSalario.calculaReajusteAnual(funcionarioEstagio);

        System.out.println(funcionarioCLT);
        System.out.println(funcionarioPJ);
        System.out.println(funcionarioEstagio);
    }
}
