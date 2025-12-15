package br.com.ramires.lifemap.model;


// ATRIBUTOS
public class AreaVida {
    private String nome;
    private String descricao;


    // CONSTRUTOR
    public AreaVida(String descricao, String nome) {
        this.descricao = descricao;
        this.nome = nome;
    }

    // getters/setters
    public String getDescricao() {
        return descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}









