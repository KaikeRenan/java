import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Olá, {nome}. Hoje é {dia-da-semana}, BOM DIA

        String nome = "Kaike";
//        System.out.println(nome.toUpperCase()); // upper
//        System.out.println(nome.toLowerCase()); // lower
//        System.out.println(nome.length()); // tamanho

//        String outro_nome = "Caique";
//        System.out.println(nome.esquals(outro_nome));  // comparas as strings
//        System.out.println(nome.esqualsIgnoreCase(outro_nome)); // ignora se é maisculas ou minusculas

        // ISO 8681
        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt","BR");

//        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));

        String dia_da_semana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);

        String saudacao;
        LocalDateTime agora = LocalDateTime.now();
        if (agora.getHour() >= 0 && agora.getHour() < 12) {
            saudacao = "bom dia";
        } else if (agora.getHour() >= 12 && agora.getHour() < 18) {
            saudacao = "boa tarde";
        } else if (agora.getHour() >= 18 && agora.getHour() < 24) {
            saudacao = "boa noite";
        } else {
            saudacao = "Olá";
        }

        System.out.printf("Olá, %s. Hoje é %s, %s.%n", nome, dia_da_semana, saudacao.toUpperCase());
    }
}