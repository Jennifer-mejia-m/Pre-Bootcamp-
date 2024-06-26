package com.example.demo.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario,Long>{

    List<Usuario>findAll();
    Optional<Usuario> findById(Long id); 
}
