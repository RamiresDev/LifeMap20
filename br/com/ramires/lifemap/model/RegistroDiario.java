package br.com.ramires.lifemap.model;

public class RegistroDiario {
    private String data;
    private String area;
    private int nota;
    private String humor;

    public RegistroDiario() {
    }

    public RegistroDiario(String data, String area, int nota, String humor) {
        this.data = data;
        this.area = area;
        this.nota = nota;
        this.humor = humor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getHumor() {
        return humor;
    }

    public void setHumor(String humor) {
        this.humor = humor;
    }


}