package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import okhttp3.*;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String API_KEY = "Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiI1MDRjZWQ0YzlkNTAyMDEwZTNmM2MxODliNDNiNmQxOCIsIm5iZiI6MTczOTg4OTA4Mi4yNTUsInN1YiI6IjY3YjQ5OWJhYTY1ZDYzMDNlN2UxMGVjYyIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.gVFPoy5BQw3gJAp7oresyw8r3QkXfQeLe7ChKG33sWA";
        String BASE_URL = "https://api.themoviedb.org/3/movie/top_rated";

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url(BASE_URL + "?language=pt-BR&page=1")
                .get()
                .addHeader("accept", "application/json")
                .addHeader("Authorization", API_KEY)
                .build();

        try (Response response = client.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                System.out.println("Erro na requisição: " + response.code());
                return;
            }


            String jsonBody = response.body().string();
            Gson gson = new Gson();
            JsonObject jsonObject = gson.fromJson(jsonBody, JsonObject.class);
            JsonArray results = jsonObject.getAsJsonArray("results");


            List<Film> films = new ArrayList<>();


            int count = Math.min(10, results.size());
            for (int i = 0; i < count; i++) {
                JsonObject filmJson = results.get(i).getAsJsonObject();

                // Converter JsonObject para Map
                Type mapType = new TypeToken<Map<String, Object>>(){}.getType();
                Map<String, Object> filmMap = gson.fromJson(filmJson, mapType);

                // Criar objeto Film a partir do Map
                Film film = Film.from_json(filmMap);
                films.add(film);
            }

            saveToJsonFile(films, "top_10_filmes.json");

            // Exibir os filmes no terminal
            for (int i = 0; i < films.size(); i++) {
                System.out.println((i + 1) + ". " + films.get(i));
            }

        } catch (IOException e) {
            System.out.println("Erro ao fazer a requisição: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // Método para salvar a lista de filmes em um arquivo JSON

    private static void saveToJsonFile(List<Film> films, String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            // Criar um JSON bonito (com indentação)
            Gson gson = new GsonBuilder().setPrettyPrinting().create();

            // Converter cada filme para Map antes de salvar
            List<Map<String, Object>> filmMaps = new ArrayList<>();
            for (Film film : films) {
                filmMaps.add(film.to_dict());
            }

            gson.toJson(filmMaps, writer);
            System.out.println("Arquivo " + filename + " salvo com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar o arquivo JSON: " + e.getMessage());
            e.printStackTrace();
        }
    }
}