package com.aluracursos.screenmatch.calculators;

public class RecommendationFilter {

    public void filter(Classification classification) {
        int rateNote = classification.getClassification();
        if (rateNote >= 4) {
            System.out.println("\n\nBest content!");
        } else if (rateNote >= 2) {
            System.out.println("\n\nTrending content");
        } else {
            System.out.println("\n\nAdd to my watchlist");
        }
    }
}
