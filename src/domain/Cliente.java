package domain;

import java.util.List;

public class Cliente {
    private String id;
    private String nome;
    private List<Passagem> passagens;
    
    public Cliente(String id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<Passagem> getPassagens() {
        return passagens;
    }
    public void setPassagens(List<Passagem> passagens) {
        this.passagens = passagens;
    }
    @Override
    public String toString() {
        return "Cliente [id=" + id + ", nome=" + nome + ", passagens=" + passagens + "]";
    }

    
}
