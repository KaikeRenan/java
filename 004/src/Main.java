//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        boolean fim_de_semana = false;
        boolean sol = true;
        boolean praia = fim_de_semana && sol; // && = and
        System.out.println(praia); // sout

        /*
        Tabela verdade
        Operador && (and)
        true && true = true
        true && false = false
        false && true = false
        false && false = false

        Operador || (or)
        true && true = true
        true && false = true
        false && true = true
        false && false = false
         */

        String mensagem = fim_de_semana ? "É fim de semana" /* se for True */ : "Nao é fim de semana"; /* se for False */
        System.out.println(mensagem);
    }
}