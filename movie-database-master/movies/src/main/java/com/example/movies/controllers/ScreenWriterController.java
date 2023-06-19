package com.example.movies.controllers;

import com.example.movies.entity.Movie;
import com.example.movies.entity.ScreenWriter;
import com.example.movies.services.ScreenWriterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ScreenWriterController {

    private final ScreenWriterService screenWriterService;

    @Autowired
    public ScreenWriterController(ScreenWriterService screenWriterService) {
        this.screenWriterService = screenWriterService;
    }

    @GetMapping("/screenwriters")
    public List<ScreenWriter> getAllScreenWriters() {
        return screenWriterService.getAllScreenWriters();
    }

    @GetMapping("/screenwriter/{id}")
    public Optional<ScreenWriter> getScreenWriterById(@PathVariable Long id) {
        return screenWriterService.getScreenWriterById(id);
    }

    @PostMapping("/screenWriters/addNew")
    public void addScreenWriter(@RequestBody ScreenWriter screenWriter) {
        screenWriterService.addScreenWriter(screenWriter);
    }

    @PutMapping("/screenWriter/{id}/update")
    public void updateScreenWriter(@RequestBody ScreenWriter screenWriter) {
        screenWriterService.updateScreenWriter(screenWriter);
    }

    @DeleteMapping("/screenWriter/{id}/delete")
    public void deleteScreenWriter(@PathVariable Long id) {
        screenWriterService.deleteScreenWriter(id);
    }

    @GetMapping("/screenWriter/{id}/movies")
    public List<Movie> getMoviesByScreenWriter(@PathVariable Long id) {
        Optional<ScreenWriter> screenWriter = screenWriterService.getScreenWriterById(id);
        if(screenWriter.isPresent()) {
            return screenWriter.get().getMoviesList();
        }
        return null;
    }
}
