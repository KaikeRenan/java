package Proxy.Solucao;

import Builder.pessoa;
import Proxy.pessoaRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Logger;

public class pessoaRepositoryProxy extends pessoaRepository implements ProxyPessoa{

    private static Logger log = Logger.getLogger(pessoaRepositoryProxy.class.getName());

    private Map<Long, pessoa> cache = new HashMap<>();

    @Override
    public void save(pessoa pessoa) {
        log.info("Iniciando chamada do metodo save... ");
        super.save(pessoa);
        log.info("Chamada do metodo save finalizada. ");
    }

    @Override
    public pessoa findById(long id) {
        log.info("Iniciando chamada do metodo findById... ");
        long inicio = System.currentTimeMillis();

        pessoa pessoa = null;

        if (Objects.nonNull(cache.get(id))) {
            log.info("Esta pegando do cache. ");
            pessoa = cache.get(id);
        } else {
            log.info("Esta peagndo do PessoaRepository. ");
            pessoa = super.findById(id);
            cache.put(id, pessoa);
        }
        log.info("Chamada do metodo findById finalizada. ");
        long fim = System.currentTimeMillis();

        log.info("Tempo gasto na chamada... " + (fim - inicio));
        return pessoa;
    }
}
