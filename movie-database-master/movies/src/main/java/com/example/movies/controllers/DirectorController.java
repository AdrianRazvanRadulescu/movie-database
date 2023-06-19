package com.example.movies.controllers;

import com.example.movies.entity.Director;

import com.example.movies.entity.Movie;

import com.example.movies.services.DirectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DirectorController {

    private final DirectorService directorService;

    @Autowired
    public DirectorController(DirectorService directorService) {
        this.directorService = directorService;
    }

    @GetMapping("/directors")
    public List<Director> getAllDirectors() {
        return directorService.getAllDirectors();
    }

    @GetMapping("/director/{id}")
    public Optional<Director> getDirectorById(@PathVariable Long id) {
        return directorService.getDirectorById(id);
    }

    @PostMapping("/directors/addNew")
    public void addDirector(@RequestBody Director director) {
        directorService.addDirector(director);
    }

    @PutMapping("/director/{id}/update")
    public void updateDirector(@RequestBody Director director) {
        directorService.updateDirector(director);
    }

    @DeleteMapping("/director/{id}/delete")
    public void deleteDirector(@PathVariable Long id) {
        directorService.deleteDirector(id);
    }

    @GetMapping("/director/{id}/movies")
    public List<Movie> getMoviesByDirector(@PathVariable Long id) {
        Optional<Director> director = directorService.getDirectorById(id);
        if(director.isPresent()) {
            return director.get().getMovieList();
        }
        return null;
    }
}
