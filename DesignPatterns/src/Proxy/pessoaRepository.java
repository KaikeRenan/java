package Proxy;

import Builder.pessoa;

import java.util.HashMap;
import java.util.Map;

public class pessoaRepository {

    private Map<Long, pessoa> banco = new HashMap<>();

    private static Long countId = 1L;

    public void save(pessoa pessoa) {banco.put(countId++, pessoa);}

    public pessoa findById(long id) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return banco.get(id);
    }
}
