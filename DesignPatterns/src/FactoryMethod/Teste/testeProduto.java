package FactoryMethod.Teste;

import FactoryMethod.produtoDigital;
import FactoryMethod.produtoFisico;

//Problema
public class testeProduto {
    public static void main(String[] args) {
        produtoFisico produtoFisico = new produtoFisico();
        produtoFisico.setPossuiDimensoesFisicas(true);

        produtoDigital produtoDigital = new produtoDigital();
        produtoDigital.setPossuiDimensoesFisicas(false);
    }
}
