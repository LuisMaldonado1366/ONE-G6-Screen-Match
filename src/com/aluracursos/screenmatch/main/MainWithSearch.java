package com.aluracursos.screenmatch.main;

import com.aluracursos.screenmatch.exceptions.ErrorInDurationException;
import com.aluracursos.screenmatch.models.Title;
import com.aluracursos.screenmatch.models.TitleOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainWithSearch {

    public static void main(String[] args) throws IOException {

        Scanner userInput = new Scanner(System.in);
        List<Title> titles = new ArrayList<>();
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while (true) {
            System.out.println("Enter a movie name: ");
            String userTitle = userInput.nextLine();

            if (userTitle.equalsIgnoreCase("exit")){
                break;
            }
            String url = "http://www.omdbapi.com/?apikey=83f3606b&t=" +
                    URLEncoder.encode(userTitle, StandardCharsets.UTF_8);

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();



            try {
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);

//            Gson gsonStandard = new Gson();
//            Title jsonTitleStandard = gsonStandard.fromJson(json, Title.class);
//            System.out.println(jsonTitleStandard);

                TitleOmdb omdbTitle = gson.fromJson(json, TitleOmdb.class);
                System.out.println(omdbTitle);
                Title jsonTitle = new Title(omdbTitle);
                System.out.println(jsonTitle);

                titles.add(jsonTitle);

            } catch (IOException | InterruptedException | IllegalArgumentException e) {
                System.out.println("\nExit on error - " + e.getMessage());

            } catch (ErrorInDurationException e) {
                System.out.println("\nExit on custom duration error - " + e.getMessage());

            }
        }
        System.out.println(titles);
        try {
            FileWriter titlesWriter = new FileWriter("movies.txt", Charset.defaultCharset());
            titlesWriter.write(gson.toJson(titles));
            titlesWriter.close();
        } catch (IOException e) {
            System.out.println("Error when writing movies to file.");
        }
        System.out.println("\n\nProgram terminated.");
    }
}
