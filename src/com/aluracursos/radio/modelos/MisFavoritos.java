package com.aluracursos.radio.modelos;

public class MisFavoritos {

    public void adicione(Audio audio){
        if(audio.getClasificacion() >= 8){
            System.out.println(audio.getTitulo() + "Es uno de los favoritod del momento");
        }else{
            System.out.println(audio.getTitulo() + "Tambien eres uno de los favoritos");
        }
    }
}
