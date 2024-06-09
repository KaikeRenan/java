//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            // 1 2 3 4 5 6 7 8 9 10
            // para uma variável que inicia em 1, e vai até 10, mudando 1-por-1, faça:
            for (int i = 1; i <= 10; i++) { // começa em 1; vai até 10; i++ incremento de 1 em 1 +=2 (2 em 2)
                for (int j = 1; j <= 10; j++ ) { // para cada variacao de i vai existir 10 variacoes de j
                    System.out.println(j + "x" + i + " = " + j * i);
                    //1x1 = 1
                }
        }
    }
}