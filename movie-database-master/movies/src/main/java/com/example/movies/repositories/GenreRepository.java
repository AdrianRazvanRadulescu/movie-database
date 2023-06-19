package com.example.movies.repositories;

import com.example.movies.entity.Genre;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface GenreRepository extends CrudRepository<Genre, Long> {
}
