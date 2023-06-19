package com.example.movies.dto;

import com.example.movies.entity.Movie;

import java.util.List;

public class ScreenWriterMoviesDTO {
    private Long ScreenWriterId;
    private String name;
    private String nationality;
    private List<String> movies;

    public ScreenWriterMoviesDTO() {
    }

    public ScreenWriterMoviesDTO(Long screenWriterId, String name, String nationality, List<String> movies) {
        ScreenWriterId = screenWriterId;
        this.name = name;
        this.nationality = nationality;
        this.movies = movies;
    }

    public Long getScreenWriterId() {
        return ScreenWriterId;
    }

    public void setScreenWriterId(Long screenWriterId) {
        ScreenWriterId = screenWriterId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public List<String> getMovies() {
        return movies;
    }

    public void setMovies(List<String> movies) {
        this.movies = movies;
    }
}
