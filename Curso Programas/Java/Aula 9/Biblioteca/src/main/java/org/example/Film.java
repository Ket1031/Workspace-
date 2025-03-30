package org.example;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

public class Film {
    private int id;
    private String title;
    private String release_date;
    private double vote_average;
    private String overview;
    private String poster_path;
    private boolean adult;
    private String original_language;
    private String original_title;
    private double popularity;
    private boolean video;
    private int vote_count;
    private String backdrop_path;
    private List<Integer> genre_ids; // Mudei para List<Integer>

    public Film(int id, String title, String release_date, double vote_average,
                String overview, String poster_path, boolean adult,
                String original_language, String original_title, double popularity,
                boolean video, int vote_count, String backdrop_path, List<Integer> genre_ids) {
        this.id = id;
        this.title = title;
        this.release_date = release_date;
        this.vote_average = vote_average;
        this.overview = overview;
        this.poster_path = poster_path;
        this.adult = adult;
        this.original_language = original_language;
        this.original_title = original_title;
        this.popularity = popularity;
        this.video = video;
        this.vote_count = vote_count;
        this.backdrop_path = backdrop_path;
        this.genre_ids = genre_ids;
    }

    public Map<String, Object> to_dict() {
        Gson gson = new Gson();
        Type type = new TypeToken<Map<String, Object>>(){}.getType();
        return gson.fromJson(gson.toJson(this), type);
    }

    public static Film from_json(Map<String, Object> jsonData) {
        // Pegamos os dados do JSON e criamos um novo objeto Film
        int id = ((Number) jsonData.getOrDefault("id", 0)).intValue();
        String title = (String) jsonData.getOrDefault("title", "");
        String release_date = (String) jsonData.getOrDefault("release_date", "");
        double vote_average = ((Number) jsonData.getOrDefault("vote_average", 0.0)).doubleValue();
        String overview = (String) jsonData.getOrDefault("overview", "");
        String poster_path = (String) jsonData.getOrDefault("poster_path", "");
        boolean adult = (Boolean) jsonData.getOrDefault("adult", false);
        String original_language = (String) jsonData.getOrDefault("original_language", "");
        String original_title = (String) jsonData.getOrDefault("original_title", "");
        double popularity = ((Number) jsonData.getOrDefault("popularity", 0.0)).doubleValue();
        boolean video = (Boolean) jsonData.getOrDefault("video", false);
        int vote_count = ((Number) jsonData.getOrDefault("vote_count", 0)).intValue();
        String backdrop_path = (String) jsonData.getOrDefault("backdrop_path", "");

        // Tratamento correto para genre_ids (como List<Integer>)
        List<Integer> genre_ids = (List<Integer>) jsonData.getOrDefault("genre_ids", List.of());

        return new Film(id, title, release_date, vote_average, overview, poster_path,
                adult, original_language, original_title, popularity,
                video, vote_count, backdrop_path, genre_ids);
    }

    @Override
    public String toString() {
        return title + " (" + release_date + ") - Nota: " + vote_average;
    }
}