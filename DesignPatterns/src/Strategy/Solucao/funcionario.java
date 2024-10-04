package Strategy.Solucao;

import java.math.BigDecimal;

public class funcionario {

    public String nome;
    public BigDecimal salario;
    public tipoContratacaoEnum tipoContratacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public tipoContratacaoEnum getTipoContratacao() {
        return tipoContratacao;
    }

    public void setTipoContratacao(tipoContratacaoEnum tipoContratacao) {
        this.tipoContratacao = tipoContratacao;
    }
}
