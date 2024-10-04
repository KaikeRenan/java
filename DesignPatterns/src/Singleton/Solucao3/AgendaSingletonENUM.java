package Singleton.Solucao3;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public enum AgendaSingletonENUM {

    INSTANCE;

    private Map<String, Boolean> diasDisponiveis = new HashMap<>();

    private AgendaSingletonENUM() {
        diasDisponiveis.put("Domingo", Boolean.TRUE);
        diasDisponiveis.put("Segunda", Boolean.TRUE);
        diasDisponiveis.put("Terça", Boolean.TRUE);
        diasDisponiveis.put("Quarta", Boolean.TRUE);
        diasDisponiveis.put("Quinta", Boolean.TRUE);
        diasDisponiveis.put("Sexta", Boolean.TRUE);
        diasDisponiveis.put("Sábado", Boolean.TRUE);
    }

    public static AgendaSingletonENUM getInstance() { // impede o reflection
        return INSTANCE;
    }

    public Map<String, Boolean> getDias () {
        return diasDisponiveis;
    }

    public void ocupa(String data) {
        diasDisponiveis.replace(data, Boolean.FALSE);
    }
}
;