import estruturaDeDados.listaLigada;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        listaLigada list = new listaLigada("Elemento 1");

        //Adicionar item
        list.prepend("Elemento 0");
        list.append("Elemento 2");
        list.append("Elemento 3");
        list.insert(3,"elemento 2,5");

        //Ler item
        list.getHead();
        list.getTail();
        System.out.println(list.get(2).dado);

        //Remover
        System.out.println(list.delete(2));
//        System.out.println(list.removeFirst().dado);
//        System.out.println(list.removeLast().dado);

        //operaçoes opcionais
//        list.set(1,"Elemento 0,5");

        //Imprimir
        list.print();

        //operaçoes opcionais:
        list.getLength();

    }
}