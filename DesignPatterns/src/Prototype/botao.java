package Prototype;

public class botao {
    protected String cor;
    protected int largura;
    protected int altura;
    protected tipoBordaEnum tipoBorda;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public tipoBordaEnum getTipoBorda() {
        return tipoBorda;
    }

    public void setTipoBorda(tipoBordaEnum tipoBorda) {
        this.tipoBorda = tipoBorda;
    }
}
