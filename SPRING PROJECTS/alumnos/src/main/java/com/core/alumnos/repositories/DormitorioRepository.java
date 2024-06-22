package com.core.alumnos.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.core.alumnos.models.Dormitorio;

@Repository
public interface DormitorioRepository extends CrudRepository<Dormitorio,Long>{

    List<Dormitorio> findAll();
    Optional<Dormitorio> findById(Long id);
    
    
}
