package com.aluracursos.screenmatch.models;

public class Episode {
    private int episodeNumber;
    private String episodeName;
    private Serie serie;

    public int getEpisodeNumber() {
        return episodeNumber;
    }

    public void setEpisodeNumber(int episodeNumber) {
        this.episodeNumber = episodeNumber;
    }

    public String getEpisodeName() {
        return episodeName;
    }

    public void setEpisodeName(String episodeName) {
        this.episodeName = episodeName;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }
}
