package com.aluracursos.radio.modelos;

public class Podcast extends Audio{

    private String presentador;
    private String descripcion;
    private String tematica;

    @Override
    public int getTotalDeRepoduccion() {
        if(getTotalDeRepoduccion() >= 200){
            return 9;
        }else{
            return 2;
        }
    }

    public String getPresentador() {
        return presentador;
    }

    public void setPresentador(String presentador) {
        this.presentador = presentador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }
}
