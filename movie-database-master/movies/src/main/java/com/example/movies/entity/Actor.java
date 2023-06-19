package com.example.movies.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(
        name = "Actors",
        schema ="movies"
)
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="Name", nullable = false)
    private String name;

    @Column(name="Nationality")
    private String nationality;
    private int age;

    @ManyToMany(mappedBy = "actorsList", fetch=FetchType.LAZY)
    @JsonBackReference
    private List<Movie>moviesList;

    public Actor() {
    }

    public Actor(long id, String name, String nationality, int age, List<Movie> moviesList) {
        this.id = id;
        this.name = name;
        this.nationality = nationality;
        this.age = age;
        this.moviesList = moviesList;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public int getAge() {
        return age;
    }

    public List<Movie> getMoviesList() {
        return moviesList;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMovieList(List<Movie> movieList) {
        this.moviesList = movieList;
    }
}
