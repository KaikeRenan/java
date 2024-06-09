//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // nome de váriavel só precisa ser igual no mesmo escopo
        // escopo 1
//        String nome_original = "Renan";
//        saudacao(nome_original);

        int resultado = soma(2,3);
        System.out.println(resultado);
    }

    // escopo 2
//    public static void saudacao(String nome_parametro) {
//        System.out.println("Olá, " + nome_parametro);

        public static int soma(int a,int b) {
            return a + b; //return para retornar valores
    }

}