package FactoryMethod.Teste;

import FactoryMethod.produto;
import FactoryMethod.produtoDigital;
import FactoryMethod.produtoFisico;
import FactoryMethod.tipoProdutoEnum;

//SOLUCAO
public class produtoFactory {
    public static produto getInstance(tipoProdutoEnum tipoProdutoEnum) {
        switch (tipoProdutoEnum) {
            case FISICO:
                produtoFisico produtoFisico = new produtoFisico();
                produtoFisico.setPossuiDimensoesFisicas(true);
                return produtoFisico;

            case DIGITAL:
                produtoDigital produtoDigital = new produtoDigital();
                produtoDigital.setPossuiDimensoesFisicas(false);
                return produtoDigital;

            default:
                throw new IllegalArgumentException("Tipo de Produto nao disponivel"); //ARGUMENTO INFORMADO É ILEGAL
        }


    }
}
