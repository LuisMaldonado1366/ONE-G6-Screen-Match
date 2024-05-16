package com.aluracursos.screenmatch.main;

import com.aluracursos.screenmatch.models.Movie;
import com.aluracursos.screenmatch.models.Serie;
import com.aluracursos.screenmatch.models.Title;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainWithLists {
    public static void main(String[] args) {
        Movie deadpool = new Movie("Deadpool", 2016);
        deadpool.rateMovie(9);

        Movie starWarsEp3 = new Movie("Star Wars Episode 3: Revenge of the Sith", 2005);
        starWarsEp3.rateMovie(10);

        var treasurePlanet = new Movie("Treasure planet", 2002);
        treasurePlanet.rateMovie(5);

        Serie houseOfDragon = new Serie("House of Dragon", 2022);

        ArrayList<Title> list = new ArrayList<>();
        list.add(deadpool);
        list.add(starWarsEp3);
        list.add(treasurePlanet);
        list.add(houseOfDragon);

        for (Title item: list){
            System.out.println(item.getName());
            if (item instanceof Movie movieItem && movieItem.getClassification() > 3) {
                System.out.println(movieItem.getClassification());
            }
        }

        ArrayList<String> artistList = new ArrayList<>();
        artistList.add("Ryan Reynolds");
        artistList.add("Anne Hataway");
        artistList.add("Keanu Reeves");

        System.out.println("Unsorted artist list: " + artistList);
        Collections.sort(artistList);
        System.out.println("Sorted artist list: " + artistList);

        Collections.sort(list);
        System.out.println("Sorted titles list: " + list);

        list.sort(Comparator.comparing(Title::getReleaseDate));
        System.out.println("Sorted titles list with release date: " + list);
    }
}
