package Builder;

import java.time.LocalDate;

public class pessoa {

    private String nome;
    private String sobreNome;
    private LocalDate dataNascimento;

    private pessoa(String nome,String sobreNome,LocalDate dataNascimento) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    @Override
    public String toString() {
        return "pessoa{" +
                "nome='" + nome + '\'' +
                ", sobreNome='" + sobreNome + '\'' +
                ", dataNascimento=" + dataNascimento +
                '}';
    }

    public static class pessoaComBuilder {

        private String nome;
        private String sobreNome;
        private LocalDate dataNascimento;

        public pessoaComBuilder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public pessoaComBuilder sobreNome(String sobreNome) {
            this.sobreNome = sobreNome;
            return this;
        }

        public pessoaComBuilder dataNascimento(LocalDate dataNascimento) {
            this.dataNascimento = dataNascimento;
            return this;
        }

        public pessoa criaPessoa() {
            return new pessoa(nome,sobreNome,dataNascimento);
        }
    }
}
