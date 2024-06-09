//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        int[] numeros = new int[5];
//        // arrays = listas, ou seja, indices
//        numeros[0] = 1;
//        numeros[1] = 2;
//        numeros[2] = 3;
//        numeros[3] = 4;
//        numeros[4] = 5;
//        for (int i = 0; i < numeros.length; i++) {
//            System.out.println(numeros[i]);
//        }

//        String[] letras = {"A","B","C","D","E","F"};
//            for (int i = 0; i < letras.length; i++) {
//                System.out.println(letras[i]);
//        }
//        String[] letras = {"A","B","C","D","E","F"};
//        System.out.println(Arrays.toString(letras));

        int[] numeros = {9,10,12,25,2};
        int maior = numeros[0];
        int menor = numeros[0];
        int media = 0;

        for (int i=0; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
            media += numeros[i];
        }
        System.out.println("maior: " + maior);
        System.out.println("menor: " + menor);
        System.out.println("media: " + media/numeros.length);
    }
}