package com.aluracursos.screenmatch.main;

import com.aluracursos.screenmatch.models.Title;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainWithSearch {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter a movie name: ");
        String userTitle = userInput.nextLine();

        String url = "http://www.omdbapi.com/?apikey=83f3606b&t=" + userTitle;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            System.out.println(json);

            Gson gson = new Gson();
            Title jsonTitle = gson.fromJson(json, Title.class);

            System.out.println(jsonTitle);


        } catch (IOException | InterruptedException | IllegalArgumentException e) {
            throw new RuntimeException(e);
        }
    }
}
