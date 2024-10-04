package ChainOfResponsibility.Problema;

import ChainOfResponsibility.carro;
import ChainOfResponsibility.marcasEnum;

import java.math.BigDecimal;

public class testeVendaCarro {

    public static void main(String[] args) {
        vendaCarroService vendaCarroService = new vendaCarroService();

        carro carro1 = new carro();
        carro1.setMarca(marcasEnum.FORD);
        carro1.setModelo("Fusion");
        carro1.setPreco(new BigDecimal(90_000.00));

        BigDecimal valorVenda1 = vendaCarroService.calculaValorVenda(carro1);

        System.out.println("Valor de venda Fusion: " + carro1.getPreco());
        System.out.println("Valor de venda Fusion com desconto: " + valorVenda1);

        carro carro2 = new carro();
        carro2.setMarca(marcasEnum.FIAT);
        carro2.setModelo("Uno");
        carro2.setPreco(new BigDecimal(40_000.00));

        BigDecimal valorVenda2 = vendaCarroService.calculaValorVenda(carro2);

        System.out.println("Valor de venda Uno: " + carro2.getPreco());
        System.out.println("Valor de venda Uno com desconto: " + valorVenda2);

        carro carro3 = new carro();
        carro3.setMarca(marcasEnum.CHEVROLET);
        carro3.setModelo("Camaro");
        carro3.setPreco(new BigDecimal(200_000.00));

        BigDecimal valorVenda3 = vendaCarroService.calculaValorVenda(carro3);

        System.out.println("Valor de venda Camaro: " + carro3.getPreco());
        System.out.println("Valor de venda Camaro com desconto: " + valorVenda3);
    }
}
