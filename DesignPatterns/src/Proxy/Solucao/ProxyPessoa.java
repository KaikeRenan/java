package Proxy.Solucao;

import Builder.pessoa;

public interface ProxyPessoa {

    void save(pessoa pessoa);

    pessoa findById(long id);
}
