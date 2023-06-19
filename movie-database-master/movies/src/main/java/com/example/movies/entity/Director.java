package com.example.movies.entity;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(
        name = "Directors",
        schema ="movies"
)
public class Director {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DirectorId")
    private Long id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Nationality")
    private String nationality;
    @JsonBackReference
    @OneToMany(mappedBy = "director")
    private List<Movie> moviesList;

    public Director() {
    }

    public Director(Long id, String name, String nationality, List<Movie> moviesList) {
        this.id = id;
        this.name = name;
        this.nationality = nationality;
        this.moviesList = moviesList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public List<Movie> getMovieList() {
        return moviesList;
    }

    public void setMovieList(List<Movie> movieList) {
        this.moviesList = movieList;
    }
}
