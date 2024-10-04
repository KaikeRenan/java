package Builder.Teste;

import Builder.pessoa;
//import Builder.pessoaComBuilder;

import java.time.LocalDate;

public class testeComPessoaComBuilder {

    public static void main(String[] args) {
        pessoa pessoa = new pessoa.pessoaComBuilder()
                .nome("Kaike")
                .sobreNome("de Almeida")
                .dataNascimento(LocalDate.of(2006,11,1)).criaPessoa();

        System.out.println(pessoa);
    }

}
