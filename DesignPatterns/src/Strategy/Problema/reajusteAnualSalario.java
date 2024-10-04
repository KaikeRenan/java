package Strategy.Problema;

import Strategy.Solucao.funcionario;
import Strategy.Solucao.tipoContratacaoEnum;

import java.math.BigDecimal;

public class reajusteAnualSalario {

    public void calculaReajusteAnual (funcionario funcionario) {

        if (tipoContratacaoEnum.CLT.name().equals((funcionario.getTipoContratacao().name()))) {
            BigDecimal salario = funcionario.getSalario();
            funcionario.setSalario(salario.add(salario.multiply(new BigDecimal(0.10))));

        } else if (tipoContratacaoEnum.PJ.equals(funcionario.getTipoContratacao().name())) {
            BigDecimal salario = funcionario.getSalario();
            funcionario.setSalario(salario.add(salario.multiply(new BigDecimal(0.05))));

        } else if (tipoContratacaoEnum.ESTAGIO.equals(funcionario.getTipoContratacao().name())) {
            BigDecimal salario = funcionario.getSalario();
            funcionario.setSalario(salario.add(salario.multiply(new BigDecimal(0.02))));
        }
    }
}
