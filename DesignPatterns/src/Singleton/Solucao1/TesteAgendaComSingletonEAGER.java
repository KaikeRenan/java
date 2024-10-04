package Singleton.Solucao1;

//SOlUÇAO com Singleton EAGER
public class TesteAgendaComSingletonEAGER {

    public static void main(String[] args) {
        reservaDiaEAGER("Sexta");
        reservaDiaEAGER("Sábado");
    }

    public static void reservaDiaEAGER(String data) {
        AgendaSingletonEAGER agenda = AgendaSingletonEAGER.getInstance();
        agenda.ocupa(data);
        System.out.println(agenda.getDias());
    }
}
