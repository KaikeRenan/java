package Singleton.Solucao3;

import Singleton.Solucao2.AgendaSingletonLAZY;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//SOlUÇAO com Singleton LAZY
public class TesteAgendaComSingletonENUM {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        reservaDiaENUM("Sexta");
        reservaDiaENUM("Sábado");

        AgendaSingletonENUM agenda1 = AgendaSingletonENUM.getInstance();
        AgendaSingletonENUM agenda2 = AgendaSingletonENUM.getInstance();
        System.out.println(agenda1.hashCode());
        System.out.println(agenda2.hashCode());

        // com enum veiculoParaReparo reflection nao funciona
        Constructor<AgendaSingletonENUM> construtorTravesso = AgendaSingletonENUM.class.getDeclaredConstructor();
        construtorTravesso.setAccessible(true);
        AgendaSingletonENUM agendaTravessa = construtorTravesso.newInstance();
        AgendaSingletonENUM agendaTravessa2 = construtorTravesso.newInstance();

        System.out.println(agendaTravessa.hashCode());
        System.out.println(agendaTravessa2.hashCode());
    }

    public static void reservaDiaENUM(String data) {
        AgendaSingletonENUM agenda = AgendaSingletonENUM.getInstance();
        agenda.ocupa(data);
        System.out.println(agenda.getDias());
    }
}
