package com.example.movies.services;

import com.example.movies.dto.ActorDetailsDTO;

import com.example.movies.entity.Actor;
import com.example.movies.repositories.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ActorService {

    private final ActorRepository actorRepository;

    @Autowired
    public ActorService(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    public List<Actor> getAllActors() {
        return  (List<Actor>) actorRepository.findAll();
    }

    public Optional<Actor> getActorById(Long id) {
        return actorRepository.findById(id);
    }

    public void addActor(Actor actor) {
        actorRepository.save(actor);
    }

    public void updateActor(Actor actor) {
        actorRepository.save(actor);
    }

    public void deleteActor(Long id) {
        actorRepository.deleteById(id);
    }

    public List<ActorDetailsDTO> getAllActorDetails() {
        List<Actor> actorList = (List<Actor>) actorRepository.findAll();
        List<ActorDetailsDTO> actorsDetailsList = new ArrayList<>();

        actorList.forEach(actor -> actorsDetailsList.add(convertEntityToDTO(actor)));

        return actorsDetailsList;
    }

    private ActorDetailsDTO convertEntityToDTO(Actor actor) {
        ActorDetailsDTO actorMoviesDTO = new ActorDetailsDTO();
        actorMoviesDTO.setActorId(actor.getId());
        actorMoviesDTO.setName(actor.getName());
        actorMoviesDTO.setNationality(actor.getNationality());

        List<String> movies = new ArrayList<>();
        actor.getMoviesList().forEach(movie -> movies.add(movie.getTitle()));
        actorMoviesDTO.setMovies(movies);

        return actorMoviesDTO;
    }
}
