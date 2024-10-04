package Proxy;
import Proxy.Solucao.ProxyPessoa;
import Builder.pessoa;

public class pessoaService {
    private ProxyPessoa ProxyPessoa;

    public pessoaService(ProxyPessoa ProxyPessoa) {
        this.ProxyPessoa = ProxyPessoa;
    }

    public void save(pessoa pessoa) {
        ProxyPessoa.save(pessoa);
    }

    public pessoa findById(long id) {
        return ProxyPessoa.findById(id);
    }
}
