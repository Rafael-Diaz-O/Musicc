package com.aluracursos.radio.principal;

import com.aluracursos.radio.modelos.Cancion;
import com.aluracursos.radio.modelos.MisFavoritos;
import com.aluracursos.radio.modelos.Podcast;

public class SoloMuisic {

    public static void main(String[] args) {

        Cancion miCancion = new Cancion();
        miCancion.setCantante("El loco jacson");
        miCancion.setAlbum("Sombie");
        miCancion.setTitulo("Inolvidable");

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Sergio vegeria");
        miPodcast.setTematica("Entrevistar a empresrios multimillonarios");
        miPodcast.setTitulo("Derek creador de empresa multimillonaria");

        //cancion
        for(int i= 0; i < 100; i++){
            miCancion.meGustas();
        }
        for(int i=0; i < 500; i ++){
            miCancion.reproducir();
        }

        //podcast

        for(int i= 0; i < 10000; i++){
            miPodcast.meGustas();
        }
        for(int i=0; i < 5000; i ++){
            miPodcast.reproducir();
        }


        System.out.println("Total de megustas: " + miCancion.getMeGustas());
        System.out.println("Total de reproduciones: " + miCancion.getTotalDeRepoduccion());

        MisFavoritos favoritos = new MisFavoritos();

        favoritos.adicione(miCancion);// se puede hacer esto por que estan heredando de audio esas clases
        favoritos.adicione(miPodcast);
    }
}
