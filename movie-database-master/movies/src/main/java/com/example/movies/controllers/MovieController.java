package com.example.movies.controllers;

import com.example.movies.dto.MovieDetailsDTO;
import com.example.movies.entity.Movie;
import com.example.movies.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MovieController {

    private final MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/movies")
    public List<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }

    @GetMapping("/movie/{id}")
    public Optional<Movie> getMovieById(@PathVariable Long id) {
        return movieService.getMovieById(id);
    }

    @PostMapping("/movies/addNew")
    public void addMovie(@RequestBody Movie movie) {
        movieService.addMovie(movie);
    }

    @PutMapping("/movie/{id}/update")
    public void updateMovie(@RequestBody Movie movie) {
        movieService.updateMovie(movie);
    }

    @DeleteMapping("/movie/{id}/delete")
    public void deleteMovie(@PathVariable Long id) {
        movieService.deleteMovie(id);
    }

    @GetMapping("/movie_details")
    public List<MovieDetailsDTO> getAllMovieDetailsDTO() {
        return movieService.getAllMoviesDetails();
    }
}
