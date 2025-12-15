package br.com.ramires.lifemap.model;

public class Tarefa {
    private String titulo;
    private String area;
    private int tempoEstimadoMin;
    private int tempoFeitoMin;
    private boolean concluida;

    public Tarefa() {
    }

    public Tarefa(String titulo, String area, int tempoEstimadoMin, int tempoFeitoMin, boolean concluida) {
        this.titulo = titulo;
        this.area = area;
        this.tempoEstimadoMin = tempoEstimadoMin;
        this.tempoFeitoMin = tempoFeitoMin;
        this.concluida = concluida;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getTempoEstimadoMin() {
        return tempoEstimadoMin;
    }

    public void setTempoEstimadoMin(int tempoEstimadoMin) {
        this.tempoEstimadoMin = tempoEstimadoMin;
    }

    public int getTempoFeitoMin() {
        return tempoFeitoMin;
    }

    public void setTempoFeitoMin(int tempoFeitoMin) {
        this.tempoFeitoMin = tempoFeitoMin;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }
}