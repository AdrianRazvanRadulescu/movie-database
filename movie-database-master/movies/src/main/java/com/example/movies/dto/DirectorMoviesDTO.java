package com.example.movies.dto;

import com.example.movies.entity.Movie;

import java.util.List;

public class DirectorMoviesDTO {
    private Long directorId;
    private String name;
    private String nationality;
    private List<String> movies;

    public DirectorMoviesDTO() {
    }

    public DirectorMoviesDTO(Long directorId, String name, String nationality, List<String> movies) {
        this.directorId = directorId;
        this.name = name;
        this.nationality = nationality;
        this.movies = movies;
    }

    public Long getDirectorId() {
        return directorId;
    }

    public void setDirectorId(Long directorId) {
        this.directorId = directorId;
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
