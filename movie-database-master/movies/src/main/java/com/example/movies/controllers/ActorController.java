package com.example.movies.controllers;

import com.example.movies.dto.ActorDetailsDTO;
import com.example.movies.entity.Actor;
import com.example.movies.entity.Movie;
import com.example.movies.services.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ActorController {

    private final ActorService actorService;

    @Autowired
    public ActorController(ActorService actorService) {
        this.actorService = actorService;
    }

    @GetMapping("/actors")
    public List<Actor> getAllActors() {
        return actorService.getAllActors();
    }

    @GetMapping("/actor/{id}")
    public Optional<Actor> getDirectorById(@PathVariable Long id) {
        return actorService.getActorById(id);
    }

    @PostMapping("/actors/addNew")
    public void addActor(@RequestBody Actor actor) {
        actorService.addActor(actor);
    }

    @PutMapping("/actors/{id}/update")
    public void updateActor(@RequestBody Actor actor) {
        actorService.updateActor(actor);
    }

    @DeleteMapping("/actor/{id}/delete")
    public void deleteActor(@PathVariable Long id) {
        actorService.deleteActor(id);
    }

    @GetMapping("/actor/{id}/movies")
    public List<Movie> getMoviesByActor(@PathVariable Long id) {
        Optional<Actor> actor = actorService.getActorById(id);
        if(actor.isPresent()) {
            return actor.get().getMoviesList();
        } else {
            return null;
        }
    }

    @GetMapping("/actor_details")
    public List<ActorDetailsDTO> getAllActorDetails() {
        return actorService.getAllActorDetails();
    }
}
