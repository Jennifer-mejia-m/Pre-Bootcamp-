package com.example.demo.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Programa;

@Repository
public interface ProgramaRepository extends CrudRepository<Programa,Long> {

    List<Programa>findAll();
    Optional<Programa> findById(Long id); 
    
}
