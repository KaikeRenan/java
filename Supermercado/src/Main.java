import implementacao.supermercado;
import implementacao.supermercadoVetor;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static int SIZE = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Scanner le oq o usuario digita pelo teclado
        supermercado supermercado = new supermercadoVetor(SIZE);
        int opcao;
        do {
            System.out.println("\nLista de compras");
            System.out.println("1 - Inserir");
            System.out.println("2 - Listar");
            System.out.println("3 - Remover");
            System.out.println("4 - Sair");
            System.out.println("Escolha uma opçao: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o item a ser inserido: ");
                    String item = scanner.next();
                    supermercado.add(item);
                    break;
                case 2:
                    supermercado.print();
                    break;
                case 3:
                    System.out.println("Digite a posiçao do item a ser removido: ");
                    int index = scanner.nextInt();
                    supermercado.delete(index);
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opçao inválida. Por favor, escolha novamente.");
            }

        } while (opcao != 4);

        scanner.close();
    }
}