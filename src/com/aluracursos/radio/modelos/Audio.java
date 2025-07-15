package com.aluracursos.radio.modelos;

public class Audio {

     private String titulo;
     private  int duracion;
     private int totalDeRepoduccion;
     private int meGustas;
     private int clasificacion;

     public void meGustas(){
        this.meGustas++;
     }

     public void reproducir(){
        this.totalDeRepoduccion++;
     }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getMeGustas() {
        return meGustas;
    }

    public void setMeGustas(int meGustas) {
        this.meGustas = meGustas;
    }

    public int getTotalDeRepoduccion() {
        return totalDeRepoduccion;
    }

    public void setTotalDeRepoduccion(int totalDeRepoduccion) {
        this.totalDeRepoduccion = totalDeRepoduccion;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }
}
