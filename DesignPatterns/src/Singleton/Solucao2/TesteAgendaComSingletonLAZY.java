package Singleton.Solucao2;

import Singleton.Solucao2.AgendaSingletonLAZY;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//SOlUÇAO com Singleton LAZY
public class TesteAgendaComSingletonLAZY {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        reservaDiaLAZY("Sexta");
        reservaDiaLAZY("Sábado");

        AgendaSingletonLAZY agenda1 = AgendaSingletonLAZY.getInstance();
        AgendaSingletonLAZY agenda2 = AgendaSingletonLAZY.getInstance();
        System.out.println(agenda1);
        System.out.println(agenda2);

        // reflection - nao pode, ele burla o construtor, gerando mais instancias
        Constructor<AgendaSingletonLAZY> construtorTravesso = AgendaSingletonLAZY.class.getDeclaredConstructor();
        construtorTravesso.setAccessible(true);
        AgendaSingletonLAZY agendaTravessa = construtorTravesso.newInstance();
        AgendaSingletonLAZY agendaTravessa2 = construtorTravesso.newInstance();

        System.out.println(agendaTravessa);
        System.out.println(agendaTravessa2);
    }

    public static void reservaDiaLAZY(String data) {
        AgendaSingletonLAZY agenda = AgendaSingletonLAZY.getInstance();
        agenda.ocupa(data);
        System.out.println(agenda.getDias());
    }
}
