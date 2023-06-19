package com.example.movies.controllers;

import com.example.movies.entity.Genre;
import com.example.movies.entity.Movie;

import com.example.movies.services.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class GenreController {

    private final GenreService genreService;

    @Autowired
    public GenreController(GenreService genreService) {
        this.genreService = genreService;
    }

    @GetMapping("/genres")
    public List<Genre> getAllGenres() {
        return genreService.getAllGenres();
    }

    @GetMapping("/genre/{id}")
    public Optional<Genre> getGenreById(@PathVariable Long id) {
        return genreService.getGenreById(id);
    }

    @GetMapping("/genre/{id}/movies")
    public List<Movie> getMoviesByGenre(@PathVariable Long id) {
        Optional<Genre> genre = genreService.getGenreById(id);
        if(genre.isPresent()) {
            return genre.get().getMovieList();
        }
        return null;
    }

    @PostMapping("/genres/addNew")
    public void addGenre(@RequestBody Genre genre) {
        genreService.addGenre(genre);
    }

    @PutMapping("/genre/{id}/update")
    public void updateGenre(@RequestBody Genre genre) {
        genreService.updateGenre(genre);
    }

    @DeleteMapping("/genre/{id}/delete")
    public void deleteGenre(@PathVariable Long id) {
        genreService.deleteGenre(id);
    }
}
