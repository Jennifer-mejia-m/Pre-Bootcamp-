package com.examen.demo.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.examen.demo.models.Idea;

@Repository
public interface IdeaRepository extends CrudRepository<Idea, Long>  {

    List<Idea>findAll();
    Optional<Idea> findById(Long id); 
    
}
