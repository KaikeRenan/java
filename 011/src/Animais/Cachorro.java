package Animais;

public class Cachorro {

    public String nome;
    public String cor;
    public double altura;
    public double peso;
    public double tamanho_rabo;
    public String estado_de_espirito;
    //definiçao de atributos que todos os cachorros tem

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

    public String interagir(String acao){
        if (acao.equals("carinho")) {
            this.estado_de_espirito = "feliz";
        } else if (acao.equals("vai dormir")) {
            this.estado_de_espirito = "bravo";
        }else {
            this.estado_de_espirito = "neutro";
        }
        return estado_de_espirito;
    }
    //definiçao de um metodo

}
