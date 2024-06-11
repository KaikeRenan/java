package Animais;

public class Cachorro extends Animal {
    //classe filha
    static int numeroDeCachorros;
    private double tamanhoDeRabo;

    public Cachorro(String nome, String cor, double altura, double peso, double tamanhoDeRabo, String estadoDeEspirito) {
        super(nome,cor,peso);
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDeRabo = tamanhoDeRabo;
        this.estadoDeEspirito = estadoDeEspirito;

        numeroDeCachorros++;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if(nome.equals("lily")){
            this.nome = null;
        }
        this.nome = nome; //this é o atributo dessa classe
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double gettamanhoDeRabo() {
        return tamanhoDeRabo;
    }

    public void settamanhoDeRabo(double tamanhoDeRabo) {
        this.tamanhoDeRabo = tamanhoDeRabo;
    }

    public String getestadoDeEspirito() {
        return estadoDeEspirito;
    }

    public void setestadoDeEspirito(String estadoDeEspirito) {
        this.estadoDeEspirito = estadoDeEspirito;
    }

    public static int getnumeroDeCachorros() {
        return numeroDeCachorros;
    }

    public static void setnumeroDeCachorros(int numeroDeCachorros) {
        numeroDeCachorros = numeroDeCachorros;
    }

    public String pegar() {
        return "Bolinha";
    }

    public String interagir(String acao){
        switch (acao) {
            case "carinho": this.estadoDeEspirito = "feliz"; break;
            case "vai dormir": this.estadoDeEspirito = "bravo"; break;
            case "pisar na batinha": this.estadoDeEspirito = "triste"; break;
            default: this.estadoDeEspirito = "neutro"; break;
        }

        return this.estadoDeEspirito;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override //a classe filha tem uma açao diferente da classe pai
    public void soar() {
        System.out.println("AU AU");
    }
}
