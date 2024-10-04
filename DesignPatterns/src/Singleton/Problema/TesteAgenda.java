package Singleton.Problema;
//PROBLEMA cada invocaçao de metodo gera uma nova instancia
public class TesteAgenda {

    public static void main(String[] args) {
        reservaDia("Sexta");
        reservaDia("Sábado");
    }

    public static void reservaDia(String data) {
        Agenda agenda = new Agenda();
        agenda.ocupa(data);
        System.out.println(agenda.getDias());
    }
}
