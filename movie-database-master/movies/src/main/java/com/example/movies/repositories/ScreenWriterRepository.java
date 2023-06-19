package com.example.movies.repositories;

import com.example.movies.entity.ScreenWriter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ScreenWriterRepository extends CrudRepository<ScreenWriter, Long> {

}
