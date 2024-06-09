//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        int nota = 90;
//        String graduacao;

        // nota maior ou igual 70 - aluno aprovado

//         if (nota >= 70) {
//             System.out.println("Aluno APROVADO!!!");
//         } else {
//             System.out.println("Aluno Nao Aprovado!!!");
//         }

        // A 80 B 70 C 60 D 50
//        if (nota >= 80){
//            System.out.println("Graduaçao A");
//        } else if (nota < 80 && nota >= 70) {
//            System.out.println("Graduaçao B");
//        } else if (nota < 70 && nota >= 60) {
//            System.out.println("Graduaçao C");
//        } else if (nota < 60 && nota >= 50) {
//            System.out.println("Graduaçao D");
//        } else {
//            System.out.println("Nota inválida");
//        }

        int nota = 90;
        String graduacao;

        if (nota >= 80){
            graduacao = "A";
        } else if (nota < 80 && nota >= 70) {
            graduacao = "B";
        } else if (nota < 70 && nota >= 60) {
            graduacao = "C";
        } else if (nota < 60 && nota >= 50) {
            graduacao = "D";
        } else {
            graduacao = "";
        }

        switch (graduacao) {
            case "A":
            case "B":
                System.out.println("Aluno Aprovado");
                break;
            case "C":
            case "D":
                System.out.println("Aluno Nao Aprovado");
                break;
            default:
                System.out.println("Graduaçao Inválida");
        }

    }
}