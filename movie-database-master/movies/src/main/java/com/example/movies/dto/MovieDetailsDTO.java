package com.example.movies.dto;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class MovieDetailsDTO {
    private Long movieID;
    private String title;
    private Date releaseDate;
    private String directorName;
    private String screenWriterName;
    private List<String> actorsName;
    private String genre;

    public MovieDetailsDTO() {
    }

    public MovieDetailsDTO(Long movieID, String title, Date releaseDate, String directorName, String screenWriterName, List<String> actorsName, String genre) {
        this.movieID = movieID;
        this.title = title;
        this.releaseDate = releaseDate;
        this.directorName = directorName;
        this.screenWriterName = screenWriterName;
        this.actorsName = actorsName;
        this.genre = genre;
    }

    public Long getMovieID() {
        return movieID;
    }

    public void setMovieID(Long movieID) {
        this.movieID = movieID;
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

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public String getScreenWriterName() {
        return screenWriterName;
    }

    public void setScreenWriterName(String screenWriterName) {
        this.screenWriterName = screenWriterName;
    }

    public List<String> getActorsName() {
        return actorsName;
    }

    public void setActorsName(List<String> actorsName) {
        this.actorsName = actorsName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
