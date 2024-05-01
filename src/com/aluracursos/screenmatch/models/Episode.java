package com.aluracursos.screenmatch.models;

import com.aluracursos.screenmatch.calculators.Classification;

public class Episode implements Classification {
    private int episodeNumber;
    private String episodeName;
    private Serie serie;
    private int totalVisualizations;

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

    public int getTotalVisualizations() {
        return totalVisualizations;
    }

    public void setTotalVisualizations(int totalVisualizations) {
        this.totalVisualizations = totalVisualizations;
    }

    @Override
    public int getClassification() {
        int episodeClassification = 0;

        if (totalVisualizations > 100) {
            episodeClassification = 4;
        } else {
            episodeClassification = 2;
        }

        return episodeClassification;
    }
}
