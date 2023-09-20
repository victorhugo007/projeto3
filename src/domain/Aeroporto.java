package domain;

public class Aeroporto {
    private String nome;
    private Cidade cidade;
    public Aeroporto(String nome, Cidade cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Cidade getCidade() {
        return cidade;
    }
    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    @Override
    public String toString() {
        return "Aeroporto [nome=" + nome + ", cidade=" + cidade + "]";
    }

    
}
