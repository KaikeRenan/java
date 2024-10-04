package Proxy.Solucao;

import Builder.pessoa;
import Proxy.pessoaService;

import java.time.LocalDate;

public class pessoaTesteComProxy {

    public static void main(String[] args) {
        pessoaRepositoryProxy pessoaRepositoryProxy = new pessoaRepositoryProxy();
        pessoaRepositoryProxyNew pessoaRepositoryProxyNew = new pessoaRepositoryProxyNew();

        pessoaService pessoaService = new pessoaService(pessoaRepositoryProxy);


        pessoa pessoa = new pessoa.pessoaComBuilder()
                .nome("Renan")
                .sobreNome("de Almeida")
                .dataNascimento(LocalDate.of(2005,10,11))
                .criaPessoa();

        pessoaService.save(pessoa);

        pessoa pessoaRetornada = pessoaService.findById(1L);
        System.out.println(pessoaRetornada);

        pessoa pessoaRetornadaCache = pessoaService.findById(1L);
        System.out.println(pessoaRetornadaCache);
    }
}
