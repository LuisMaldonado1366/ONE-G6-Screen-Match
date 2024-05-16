package com.aluracursos.screenmatch.main;

import com.aluracursos.screenmatch.calculators.RecommendationFilter;
import com.aluracursos.screenmatch.calculators.TimestampCalculator;
import com.aluracursos.screenmatch.models.Episode;
import com.aluracursos.screenmatch.models.Movie;
import com.aluracursos.screenmatch.models.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Movie deadpool = new Movie("Deadpool", 2016);
        deadpool.setDurationInMinutes(108);
        deadpool.setMembershipIncluded(true);

        deadpool.displayMovieSpecs();
        deadpool.rateMovie(7.8);
        deadpool.rateMovie(10);
        System.out.printf("\nTotal ratings: %d", deadpool.getTotalRatings());
        System.out.printf("\nAverage rating: %.2f", deadpool.calculateMean());

        Serie houseOfDragon = new Serie("House of Dragon", 2022);
        houseOfDragon.setSeasons(1);
        houseOfDragon.setMinutesPerEpisode(50);
        houseOfDragon.setEpisodesPerSeason(10);
        houseOfDragon.displayMovieSpecs();

        Movie starWarsEp3 = new Movie("Star Wars Episode 3: Revenge of the Sith", 2005);
        starWarsEp3.setDurationInMinutes(140);
        starWarsEp3.setMembershipIncluded(false);

        starWarsEp3.displayMovieSpecs();

        TimestampCalculator calculator = new TimestampCalculator();
        calculator.mediaList(deadpool);
        calculator.mediaList(houseOfDragon);
        calculator.mediaList(starWarsEp3);
        System.out.printf("\n\nTotal time to finish list: %d minutes", calculator.getTotalTime());

        RecommendationFilter recommendationFilter = new RecommendationFilter();
        recommendationFilter.filter(deadpool);

        Episode episode = new Episode();
        episode.setEpisodeNumber(1);
        episode.setEpisodeName("House Targaryen");
        episode.setSerie(houseOfDragon);
        episode.setTotalVisualizations(50);

        recommendationFilter.filter(episode);

        var treasurePlanet = new Movie("Treasure planet", 2002);
        treasurePlanet.setDurationInMinutes(95);

        ArrayList<Movie> movieArrayList = new ArrayList<>();
        movieArrayList.add(deadpool);
        movieArrayList.add(starWarsEp3);
        movieArrayList.add(treasurePlanet);

        System.out.println("\n\n**********************");
        System.out.println("Array movie list length: " + movieArrayList.size());
        System.out.println("The first movie of the list is: " + movieArrayList.get(0).getName());

        System.out.println(movieArrayList);
        System.out.println("toString override = " + movieArrayList.get(0).toString());
    }
}
