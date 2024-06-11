package Animais;

public class Cachorro {

    static int NumeroDeCachorros;

    private String nome;
    private String cor;
    private double altura;
    private double peso;
    private double tamanho_rabo;
    private String estado_de_espirito;
    //definiçao de atributos que todos os cachorros tem



    public Cachorro() {}
    //construtor padrao
    public Cachorro(String nome, String cor, double altura, double peso, double tamanho_rabo, String estado_de_espirito) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanho_rabo = tamanho_rabo;
        this.estado_de_espirito = estado_de_espirito;

        NumeroDeCachorros++; // NumeroDeCachorros = NumeroDeCachorros + 1;
    }
    //construtores adicionados

    public String getNome() {
        return this.nome;
    }
    //métodos de acesso getter

    public void setNome(String nome) {
        if(nome.equals("lily")){
            this.nome = null;
        }
        this.nome = nome; //this é o atributo dessa classe
    }
    //métodos de acesso settter

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

    public double getTamanho_rabo() {
        return tamanho_rabo;
    }

    public void setTamanho_rabo(double tamanho_rabo) {
        this.tamanho_rabo = tamanho_rabo;
    }

    public String getEstado_de_espirito() {
        return estado_de_espirito;
    }

    public void setEstado_de_espirito(String estado_de_espirito) {
        this.estado_de_espirito = estado_de_espirito;
    }
    //métodos

    public static int getNumeroDeCachorros() {
        return NumeroDeCachorros;
    }

    public static void setNumeroDeCachorros(int numeroDeCachorros) {
        NumeroDeCachorros = numeroDeCachorros;
    }



    public void comer(){}
    //definiçao de um metodo

    public void latir(){
        System.out.println("AU AU");
    }
    //definiçao de um metodo

    public String pegar() {
        return "Bolinha";
    }
    //definiçao de um metodo

//    public String interagir(String acao){
//        if (acao.equals("carinho")) {
//            this.estado_de_espirito = "feliz";
//        } else if (acao.equals("vai dormir")) {
//            this.estado_de_espirito = "bravo";
//        } else if (acao.equals("pisar na batinha")) {
//            this.estado_de_espirito = "triste";
//        }else {
//            this.estado_de_espirito = "neutro";
//        }
//        return estado_de_espirito;
//    }
    //definiçao de um metodo

    // dois metodos sao iguais apenas diminue o tamanho do código

    public String interagir(String acao){
        switch (acao) {
            case "carinho": this.estado_de_espirito = "feliz"; break;
            case "vai dormir": this.estado_de_espirito = "bravo"; break;
            case "pisar na batinha": this.estado_de_espirito = "triste"; break;
            default: this.estado_de_espirito = "neutro"; break;
        }

        return this.estado_de_espirito;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
