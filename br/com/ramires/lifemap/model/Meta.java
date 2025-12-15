package br.com.ramires.lifemap.model;


public class Meta {
    private String titulo;
    private String descricao;
    private String area;
    private String status;
    private String prazo;

    public Meta() {
    }

    public Meta(String titulo, String descricao, String area, String status, String prazo) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.area = area;
        this.status = status;
        this.prazo = prazo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getPrazo() {
        return prazo;
    }

    public void setPrazo(String prazo) {
        this.prazo = prazo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getResumo() {
        return titulo + " | Descrição: " + descricao + " | Área: " + area + " Status: " + status + " | Prazo: " + prazo;
    }

}