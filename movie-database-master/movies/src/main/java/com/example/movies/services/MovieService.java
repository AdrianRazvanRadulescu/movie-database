package com.example.movies.services;

import com.example.movies.dto.MovieDetailsDTO;
import com.example.movies.entity.Movie;
import com.example.movies.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    @Autowired
    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> getAllMovies() {
        return  (List<Movie>) movieRepository.findAll();
    }

    public Optional<Movie> getMovieById(Long id) {
        return movieRepository.findById(id);
    }

    public void addMovie(Movie movie) {
        movieRepository.save(movie);
    }

    public void updateMovie(Movie movie) {
        movieRepository.save(movie);
    }

    public void deleteMovie(Long id) {
        movieRepository.deleteById(id);
    }

    public List<MovieDetailsDTO> getAllMoviesDetails() {
        List<Movie> movieList = (List<Movie>) movieRepository.findAll();
        List<MovieDetailsDTO> movieDetailsDTOList = new ArrayList<>();

        movieList.forEach(movie -> movieDetailsDTOList.add(convertEntityToDTO(movie)));

        return movieDetailsDTOList;
    }

    private MovieDetailsDTO convertEntityToDTO(Movie movie) {
        MovieDetailsDTO movieDetailsDTO = new MovieDetailsDTO();
        movieDetailsDTO.setMovieID(movie.getId());
        movieDetailsDTO.setTitle(movie.getTitle());
        movieDetailsDTO.setReleaseDate(movie.getReleaseDate());
        movieDetailsDTO.setDirectorName(movie.getDirector().getName());
        movieDetailsDTO.setScreenWriterName(movie.getScreenWriter().getName());
        movieDetailsDTO.setGenre(movie.getGenre().getGenreType());

        List<String> actorsName = new ArrayList<>();
        movie.getActorsList().forEach(actor -> actorsName.add(actor.getName()));
        movieDetailsDTO.setActorsName(actorsName);

        return movieDetailsDTO;
    }
}
