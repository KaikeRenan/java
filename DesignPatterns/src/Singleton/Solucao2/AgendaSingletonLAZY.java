package Singleton.Solucao2;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class AgendaSingletonLAZY {

    private static AgendaSingletonLAZY INSTANCE = null;

    private Map<String, Boolean> diasDisponiveis = new HashMap<>();

    private AgendaSingletonLAZY() {
        diasDisponiveis.put("Domingo", Boolean.TRUE);
        diasDisponiveis.put("Segunda", Boolean.TRUE);
        diasDisponiveis.put("Terça", Boolean.TRUE);
        diasDisponiveis.put("Quarta", Boolean.TRUE);
        diasDisponiveis.put("Quinta", Boolean.TRUE);
        diasDisponiveis.put("Sexta", Boolean.TRUE);
        diasDisponiveis.put("Sábado", Boolean.TRUE);
    }

    public static AgendaSingletonLAZY getInstance() { //Carrega sobre demanda
        if(Objects.isNull(INSTANCE)){
            INSTANCE = new AgendaSingletonLAZY();
            return INSTANCE;
        }
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