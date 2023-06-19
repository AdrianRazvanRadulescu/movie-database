package com.example.movies.services;

import com.example.movies.entity.ScreenWriter;
import com.example.movies.repositories.MovieRepository;
import com.example.movies.repositories.ScreenWriterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ScreenWriterService {

    private final ScreenWriterRepository screenWriterRepository;

    @Autowired
    public ScreenWriterService(ScreenWriterRepository screenWriterRepository) {
        this.screenWriterRepository = screenWriterRepository;
    }

    public List<ScreenWriter> getAllScreenWriters() {
        return (List<ScreenWriter>) screenWriterRepository.findAll();
    }
    public Optional<ScreenWriter> getScreenWriterById(Long id) {
        return screenWriterRepository.findById(id);
    }

    public void addScreenWriter(ScreenWriter screenWriter) {
        screenWriterRepository.save(screenWriter);
    }

    public void updateScreenWriter(ScreenWriter screenWriter) {
        screenWriterRepository.save(screenWriter);
    }

    public void deleteScreenWriter(Long id) {
        screenWriterRepository.deleteById(id);
    }
}
