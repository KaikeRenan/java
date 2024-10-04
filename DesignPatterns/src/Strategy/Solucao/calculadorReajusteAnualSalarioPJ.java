package Strategy.Solucao;

import java.math.BigDecimal;

public class calculadorReajusteAnualSalarioPJ implements calculadorReajusteAnualSalario{

    @Override
    public void calcularReajusteAnual(funcionario funcionario) {
        BigDecimal salario = funcionario.getSalario();
        funcionario.setSalario(salario.add(salario.multiply(new BigDecimal(0.05))));
    }
}
