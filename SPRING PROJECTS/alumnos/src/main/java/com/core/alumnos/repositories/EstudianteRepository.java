package com.core.alumnos.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.core.alumnos.models.Estudiante;

@Repository
public interface EstudianteRepository extends CrudRepository<Estudiante,Long>{

    List<Estudiante>findAll();
    Optional<Estudiante> findById(Long id);
    
}
