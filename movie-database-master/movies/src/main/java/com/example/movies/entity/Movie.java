package com.example.movies.entity;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(
        name = "Movies",
        schema ="movies"
)
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @Column(name = "Title")
    private String title;

    @Column(name= "Release_Date")
    private Date releaseDate;

    @ManyToOne
    @JoinColumn(name = "Director_Id")
    @JsonManagedReference
    private Director director;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(
            name = "actors_movies",
            joinColumns = @JoinColumn(name = "Movie_Id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "Actor_Id", referencedColumnName = "id")
    )
    @JsonManagedReference
    private List<Actor> actorsList;

    @ManyToOne
    @JoinColumn(name = "Genre_ID")
    @JsonManagedReference
    private Genre genre;

    @ManyToOne
    @JoinColumn(name = "ScreenWriter_Id")
    @JsonManagedReference
    private ScreenWriter screenWriter;

    public Movie() {
    }

    public Movie(Long id,
                 String title,
                 Date releaseDate,
                 Director director,
                 List<Actor> actorsList,
                 Genre genre,
                 Long genreId,
                 ScreenWriter screenWriter,
                 Long screenWriterId) {
        this.id = id;
        this.title = title;
        this.releaseDate = releaseDate;
        this.director = director;
        this.actorsList = actorsList;
        this.genre = genre;

        this.screenWriter = screenWriter;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Actor> getActorsList() {
        return actorsList;
    }

    public void setActorsList(List<Actor> actorsList) {
        this.actorsList = actorsList;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public ScreenWriter getScreenWriter() {
        return screenWriter;
    }

    public void setScreenWriter(ScreenWriter screenWriter) {
        this.screenWriter = screenWriter;
    }

}
