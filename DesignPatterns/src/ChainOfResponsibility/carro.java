package ChainOfResponsibility;

import java.math.BigDecimal;

public class carro {
    private marcasEnum marca;
    private String modelo;
    private BigDecimal preco;

    public marcasEnum getMarca() {
        return marca;
    }

    public void setMarca(marcasEnum marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
}
