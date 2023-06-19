package com.example.movies.repositories;

import com.example.movies.entity.Director;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DirectorRepository extends CrudRepository<Director, Long> {

}
