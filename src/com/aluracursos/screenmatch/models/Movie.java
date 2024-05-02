package com.aluracursos.screenmatch.models;

import com.aluracursos.screenmatch.calculators.Classification;

public class Movie extends Title implements Classification {
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassification() {
        return (int) (calculateMean() / 2);
    }

    @Override
    public String toString() {
        return "Movie: " + this.getName() + " (" + this.getReleaseDate() + ")";
    }
}
