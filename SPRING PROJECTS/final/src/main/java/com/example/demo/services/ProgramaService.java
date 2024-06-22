package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.models.Programa;
import com.example.demo.repositories.ProgramaRepository;

@Service
public class ProgramaService {

    private final ProgramaRepository programaRepository;

     public ProgramaService(ProgramaRepository programaRepository) {
        this.programaRepository = programaRepository;
    }

    //visualizar todos los programas

    public List<Programa>showAll() {
        return programaRepository.findAll();
    }

    //visualizar programa por id

    public Programa findPrograma (Long id) {
        return programaRepository.findById(id).orElse(null);
    }

    //crear nuevo programa

    public Programa crearPrograma(Programa programa) {
        return programaRepository.save(programa);
    }

    //actualizar programa

    public Programa updatedPprograma(Programa programa) {
        return programaRepository.save(programa);
    }

    //eliminar programa

    public void eliminarPrograma(Long id) {
        programaRepository.deleteById(id);
    }
    
}
