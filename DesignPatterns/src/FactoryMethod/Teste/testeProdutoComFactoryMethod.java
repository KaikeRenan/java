package FactoryMethod.Teste;

import FactoryMethod.produto;
import FactoryMethod.tipoProdutoEnum;

//SOLUCAO
public class testeProdutoComFactoryMethod {
    public static void main(String[] args) {
        produto produtoFisico = produtoFactory.getInstance(tipoProdutoEnum.FISICO);
        produto produtoDigital = produtoFactory.getInstance(tipoProdutoEnum.DIGITAL);

        System.out.println(produtoFisico);
        System.out.println(produtoDigital);
    }
}
