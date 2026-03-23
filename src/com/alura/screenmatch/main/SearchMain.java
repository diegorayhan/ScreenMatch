package com.alura.screenmatch.main;

import com.alura.screenmatch.exception.YearErrorConversionException;
import com.alura.screenmatch.modelos.OmdbTitle;
import com.alura.screenmatch.modelos.Title;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.Charset;
import java.util.Scanner;

public class SearchMain {
    static void main() throws IOException, InterruptedException {

        Scanner search = new Scanner(System.in);
        System.out.println("Digite um filme para busca: ");
        var browse = search.nextLine();
        String refer = "https://www.omdbapi.com/?t=" + browse.replace(" " ,"+" ) + "&apikey=1a80d3fc";
        System.out.println(refer);
        try{
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(refer))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
            System.out.println(json);

            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .create();

            OmdbTitle myTitleOmdb = gson.fromJson(json, OmdbTitle.class);
            System.out.println(myTitleOmdb);
            //try {
            Title myTitle = new Title(myTitleOmdb);
            System.out.println("Titulo convertido: ");
            System.out.println(myTitle);
        } catch (NumberFormatException e){
            System.out.println("Aconteceu um erro");
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e){
            System.out.println("Argumento invalido");
            System.out.println(e.getMessage());
        } catch (YearErrorConversionException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Programa finalizou corretamente!");
    }
}
