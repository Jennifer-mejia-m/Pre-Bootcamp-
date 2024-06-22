package com.examen.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.examen.demo.models.Idea;
import com.examen.demo.repositories.IdeaRepository;

@Service
public class IdeaServices {
    
    private final IdeaRepository ideaRepository;

    public IdeaServices(IdeaRepository ideaRepository){
        this.ideaRepository=ideaRepository;
    }

//visualizar todas las ideas

public List<Idea>showAll() {
    return ideaRepository.findAll();
}

//visualizar idea por id

public Idea findIdea (Long id) {
    return ideaRepository.findById(id).orElse(null);
}

//crear nueva idea

public Idea crearIdea(Idea idea) {
    return ideaRepository.save(idea);
}

//actualizar idea

public Idea updatedIdea(Idea idea) {
    return ideaRepository.save(idea);
}

//eliminar idea

public void eliminarIdea(Long id) {
    ideaRepository.deleteById(id);
}

}
