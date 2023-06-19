package com.example.movies.dto;

import com.example.movies.entity.Movie;

import java.util.List;

public class ActorDetailsDTO {
    private Long actorId;
    private String name;
    private String nationality;
    private List<String> movies;

    public ActorDetailsDTO() {
    }


    public ActorDetailsDTO(Long actorId, String name, String nationality, List<String> movies) {
        this.actorId = actorId;
        this.name = name;
        this.nationality = nationality;
        this.movies = movies;
    }

    public Long getActorId() {
        return actorId;
    }

    public void setActorId(Long actorId) {
        this.actorId = actorId;
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
