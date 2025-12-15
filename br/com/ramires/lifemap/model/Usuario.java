package br.com.ramires.lifemap.model;

public class Usuario {
    private String nome;
    private String dataNascimento;
    private int idade;

    public Usuario() {
    }

    public Usuario(String nome, String dataNascimento, int idade) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getResumo() {
        return nome + " | Nascimento: " + dataNascimento + " | Idade: " + idade;
    }

}