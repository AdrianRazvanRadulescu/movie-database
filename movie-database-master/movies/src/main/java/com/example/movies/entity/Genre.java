package com.example.movies.entity;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(
        name = "Genres",
        schema ="movies"
)
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Genre_Type")
    private String genreType;

    @OneToMany (mappedBy = "genre")
    @JsonBackReference
    private List<Movie> movieList;

    public Genre() {
    }

    public Genre(Long id, String genreType, List<Movie> movieList) {
        this.id = id;
        this.genreType = genreType;
        this.movieList = movieList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGenreType() {
        return genreType;
    }

    public void setGenreType(String genreType) {
        this.genreType = genreType;
    }

    public List<Movie> getMovieList() {
        return movieList;
    }

    public void setMovieList(List<Movie> movieList) {
        this.movieList = movieList;
    }
}
