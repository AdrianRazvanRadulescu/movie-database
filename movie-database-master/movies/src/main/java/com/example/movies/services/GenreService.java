package com.example.movies.services;

import com.example.movies.entity.Genre;
import com.example.movies.repositories.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GenreService {
    private final GenreRepository genreRepository;

    @Autowired
    public GenreService(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    public List<Genre> getAllGenres() {
        return (List<Genre>)genreRepository.findAll();
    }

    public Optional<Genre> getGenreById(Long id) {
        return genreRepository.findById(id);
    }

    public void addGenre(Genre genre) {
        genreRepository.save(genre);
    }

    public void updateGenre(Genre genre) {
        genreRepository.save(genre);
    }

    public void deleteGenre(Long id) {
        genreRepository.deleteById(id);
    }
}
