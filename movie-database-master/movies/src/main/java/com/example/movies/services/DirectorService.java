package com.example.movies.services;

import com.example.movies.entity.Director;
import com.example.movies.repositories.DirectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DirectorService {

    private final DirectorRepository directorRepository;

    @Autowired
    public DirectorService(DirectorRepository directorRepository) {
        this.directorRepository = directorRepository;
    }

    public List<Director> getAllDirectors() {
        return  (List<Director>) directorRepository.findAll();
    }

    public Optional<Director> getDirectorById(Long id) {
        return directorRepository.findById(id);
    }

    public void addDirector(Director director) {
        directorRepository.save(director);
    }

    public void updateDirector(Director director) {
        directorRepository.save(director);
    }

    public void deleteDirector(Long id) {
        directorRepository.deleteById(id);
    }
}
